(function(ocnt){

ocnt.app.factory('MovementService', ['$q', '$filter', '$timeout','$http', function ($q, $filter, $timeout,$http,$scope) {
	
	var items = [];
	this.isRefresh = null;
	var results = {};
	
	function retrieveMovementDetails(start, number, params,refresh,deferred){
		if((refresh == null && this.isRefresh == null) || refresh || this.isRefresh){
			$http.post('http://localhost:8080/ocnt-ws/rest/movement/generateJson').
			then(function(response){
				items = response.data;
				console.log(items);
				this.isRefresh = false;
				results.totalNoOfPage = items.totalNoOfPage;
				results.totalNoOfRec = items.totalNoOfRec;
				results.dest_filter = items.dest_filter_dropdown;
				results.opt_filter = items.opt_filter_dropdown;
				getPage(start, number, params);
				deferred.resolve(results);
			});
		}else{
			getPage(start, number, params);
			deferred.resolve(results);
		}
	}
	
	function getPage(start, number, params) {
			var filtered = params.search.predicateObject ? $filter('filter')(items.list_mv_data, params.search.predicateObject) : items.list_mv_data;
			if (params.sort.predicate) {
				filtered = $filter('orderBy')(filtered, params.sort.predicate, params.sort.reverse);
			}
			var result = filtered.slice(start, start + number);
			results.data = result;
	}

	function retrievePageRecords(start, number, params,refresh){
		var deferred = $q.defer();
		retrieveMovementDetails(start, number, params,refresh,deferred);
		return deferred.promise;
	}
	
	return {
		retrieveMovementDetails:retrieveMovementDetails,
		getPage: getPage,
		retrievePageRecords:retrievePageRecords
	};

}]);

}) (window.ocnt = window.ocnt || {});
(function(ocnt){

ocnt.app.factory('assignMovementService', ['$q', '$filter', '$timeout','$http', function ($q, $filter, $timeout,$http,$scope) {
	
	var items = [];
	this.isRefresh = null;
	var results = {};
	
	function retrieveAssignMovementDetails(){
			var deferred = $q.defer();
			$http.post('http://localhost:8080/ocnt-ws/rest/movement/generateAssignMovementJson').
			then(function(response){
				items = response.data;
				console.log(items);
				//getPage(start, number, params);
				deferred.resolve(items);
			});
			
			return deferred.promise;
	}
	
	/*function getPage(start, number, params, items) {
			var filtered = params.search.predicateObject ? $filter('filter')(items, params.search.predicateObject) : items;
			if (params.sort.predicate) {
				filtered = $filter('orderBy')(filtered, params.sort.predicate, params.sort.reverse);
			}
			var result = filtered.slice(start, start + number);
			results.data = result;
	}

	function retrievePageRecords(start, number, params,refresh){
		var deferred = $q.defer();
		retrieveAssignMovementDetails(start, number, params,refresh,deferred);
		return deferred.promise;
	}*/
	
	return {
		retrieveAssignMovementDetails:retrieveAssignMovementDetails,
		//getPage: getPage,
		//retrievePageRecords:retrievePageRecords
	};

}]);

}) (window.ocnt = window.ocnt || {});
(function(ocnt){

ocnt.app.factory('MovementService', ['$q', '$filter', '$timeout','$http', function ($q, $filter, $timeout,$http) {
	
	var items = [];
	this.isRefresh = null;
	var results = {};
	var dest = [];
	var movementUrl = urlPath + '/ocnt-ws/rest/movement/getMovement';
	
	function retrieveMovementDetails(start, number, params,refresh,deferred, url){
		if((refresh == null && this.isRefresh == null) || refresh || this.isRefresh){
			console.log(params.movementFilter);
			$http.post(url,params.movementFilter).
			then(function(response){
				items = response.data.pageItems;
				console.log(items);
				this.isRefresh = false;
				results.totalNoOfPage = response.data.pagesAvailable;
				results.totalNoOfRec = items.length;
				
				$.each(items,function(index,value){
					if($.inArray(value.destination,dest)==-1){
						dest.push(value.destination);
					}
				});
				
				results.dest_filter = dest;
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
			var filtered = params.search.predicateObject ? $filter('filter')(items, params.search.predicateObject) : items;
			if (params.sort.predicate) {
				filtered = $filter('orderBy')(filtered, params.sort.predicate, params.sort.reverse);
			}
			var result = filtered.slice(start, start + number);
			results.data = result;
	}

	function retrievePageRecords(start, number, params,refresh){
		var deferred = $q.defer();
		retrieveMovementDetails(start, number, params,refresh,deferred,movementUrl);
		return deferred.promise;
	}
		
	function searchDayRange(start, number, params, refresh, minusDate,plusDate){
		var deferred = $q.defer();
		retrieveMovementDetails(start, number, params,refresh,deferred,movementUrl);
		return deferred.promise;
	}
	
	return {
		retrieveMovementDetails:retrieveMovementDetails,
		getPage: getPage,
		retrievePageRecords:retrievePageRecords,
		searchDayRange: searchDayRange
	};

}]);

}) (window.ocnt = window.ocnt || {});
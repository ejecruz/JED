(function(ocnt){

ocnt.app.factory('assignMovementService', ['$q', '$filter', '$timeout','$http', function ($q, $filter, $timeout,$http,$scope) {
	
	var itemsAllocatedData = [];
	this.isRefreshAllocatedData= null;
	var resultsAllocatedData = {};
	
	var itemsNonAssignedData = [];
	this.isRefreshNonAssignedData = null;
	var resultsNonAssignedData = {};
	
	var url1 = urlPath + '/ocnt-ws/rest/movement/getAssignMovementAllocatedDataAsJson';
	var url2 = urlPath + '/ocnt-ws/rest/movement/getAssignMovementNonAssignedDataAsJson';
	
	//1
	function retrieveAssignMovementAllocatedDataDetails(start, number, params,refresh,deferred,url){
		if(this.isRefreshAllocatedData == null || this.isRefreshAllocatedData){
			$http.post(url).
			then(function(response){
				resultsAllocatedData = response.data.pageItems;
				console.log(resultsAllocatedData);
				this.isRefreshAllocatedData = false;
				resultsAllocatedData.numberOfPages = parseInt(resultsAllocatedData.length/5);
				resultsAllocatedData.numberOfRecords = resultsAllocatedData.length;
				//results.dest_filter = items.dest_filter_dropdown;
				//results.opt_filter = items.opt_filter_dropdown;
				getPageAllocatedData(start, number, params);
				deferred.resolve(resultsAllocatedData);
			});
		}else{
			getPageAllocatedData(start, number, params);
			deferred.resolve(resultsAllocatedData);
		}
	}
	
	function getPageAllocatedData(start, number, params) {
			var filtered = params.search.predicateObject ? $filter('filter')(resultsAllocatedData, params.search.predicateObject) : resultsAllocatedData;
			if (params.sort.predicate) {
				filtered = $filter('orderBy')(filtered, params.sort.predicate, params.sort.reverse);
			}
			var result = filtered.slice(start, start + number);
			resultsAllocatedData.data = result;
	}

	function retrievePageRecordsAllocatedData(start, number, params,refresh, movementId){
		var deferred = $q.defer();
		retrieveAssignMovementAllocatedDataDetails(start, number, params,refresh,deferred,url1+"/"+movementId);
		return deferred.promise;
	}
	
	//2
	function retrieveAssignMovementNonAssignedDataDetails(start, number, params,refresh,deferred,url){
		if(this.isRefreshNonAssignedData == null || this.isRefreshNonAssignedData){
			$http.post(url).
			then(function(response){
				resultsNonAssignedData = response.data.pageItems;
				console.log(resultsNonAssignedData);
				this.isRefreshNonAssignedData = false;
				resultsNonAssignedData.numberOfPages = parseInt(resultsNonAssignedData.length/5);
				resultsNonAssignedData.numberOfRecords = resultsNonAssignedData.length;
				//results.dest_filter = items.dest_filter_dropdown;
				//results.opt_filter = items.opt_filter_dropdown;
				getPageNonAssignedData(start, number, params);
				deferred.resolve(resultsNonAssignedData);
			});
		}else{
			getPageNonAssignedData(start, number, params);
			deferred.resolve(resultsNonAssignedData);
		}
	}
	
	function getPageNonAssignedData(start, number, params) {
			var filtered = params.search.predicateObject ? $filter('filter')(resultsNonAssignedData, params.search.predicateObject) : resultsNonAssignedData;
			if (params.sort.predicate) {
				filtered = $filter('orderBy')(filtered, params.sort.predicate, params.sort.reverse);
			}
			var result = filtered.slice(start, start + number);
			resultsNonAssignedData.data = result;
	}

	function retrievePageRecordsNonAssignedData(start, number, params,refresh, movementId){
		var deferred = $q.defer();
		retrieveAssignMovementNonAssignedDataDetails(start, number, params,refresh,deferred,url2+"/"+movementId);
		return deferred.promise;
	}
	
	return {
		retrieveAssignMovementAllocatedDataDetails:retrieveAssignMovementAllocatedDataDetails,
		getPageAllocatedData: getPageAllocatedData,
		retrievePageRecordsAllocatedData:retrievePageRecordsAllocatedData,
		retrieveAssignMovementNonAssignedDataDetails:retrieveAssignMovementNonAssignedDataDetails,
		getPageNonAssignedData:getPageNonAssignedData,
		retrievePageRecordsNonAssignedData:retrievePageRecordsNonAssignedData
	};

}]);

}) (window.ocnt = window.ocnt || {});
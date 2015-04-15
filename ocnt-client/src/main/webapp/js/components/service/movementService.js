(function(ocnt){

ocnt.app.factory('MovementService', ['$q', '$filter', '$timeout','$http', function ($q, $filter, $timeout,$http,$scope) {
	
	function getPage(start, number, params) {
			var deferred = $q.defer();
			$http.post('http://localhost:8080/ocnt-ws/rest/movement/generateJson').
			then(function(response){
				var items = response.data;
			var filtered = params.search.predicateObject ? $filter('filter')(items, params.search.predicateObject) : items;

			if (params.sort.predicate) {
				filtered = $filter('orderBy')(filtered, params.sort.predicate, params.sort.reverse);
			}

			var result = filtered.slice(start, start + number);

			deferred.resolve({
				data: result,
				numberOfPages: Math.ceil(1000 / number)
			});
		});

		return deferred.promise;
	}

	return {
		getPage: getPage
	};

}]);

}) (window.ocnt = window.ocnt || {});
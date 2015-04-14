(function(ocnt){

ocnt.app.factory('MovementService', ['$q', '$filter', '$timeout','$http', function ($q, $filter, $timeout,$http) {

	var items = [];
	$http.post('http://localhost:8080/ocnt-client/rest/movement/generateJson').
	then(function(response){
		alert("Http Status:" +response.statusText+
				"Data Received from Server:"+JSON.stringify(response.data));
		items = response.data;
	});

	function getPage(start, number, params) {

		var deferred = $q.defer();

		var filtered = params.search.predicateObject ? $filter('filter')(items, params.search.predicateObject) : items;

		if (params.sort.predicate) {
			filtered = $filter('orderBy')(filtered, params.sort.predicate, params.sort.reverse);
		}

		var result = filtered.slice(start, start + number);

		$timeout(function () {
			deferred.resolve({
				data: result,
				numberOfPages: Math.ceil(1000 / number)
			});
		}, 1500);
		

		return deferred.promise;
	}

	return {
		getPage: getPage
	};

}]);

}) (window.ocnt = window.ocnt || {});
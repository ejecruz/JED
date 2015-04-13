(function(ocnt){

ocnt.app.factory('MovementService', ['$q', '$filter', '$timeout', function ($q, $filter, $timeout) {

	var randomsItems = [];

	function createRandomItem(id) {
		var movementNo = "SN0004/";
		var stdVal = ":00"
		var destination = ['SINHUB','ICNGTW'];
		var mfstVal = ['ALL'];
		var optValues = ['','4','5','7','10','12','T'];
		return {
			id: id,
			opt: optValues,
			mvmntNo: movementNo + Math.floor(Math.random() * 100),
			trnsptReg:'',
			trnsptType:'C',
			std:Math.floor(Math.random() * 23)+stdVal,
			dest:destination[Math.floor(Math.random() * 1)],
			mawb:'111-'+Math.floor(Math.random() * 999999999),
			mfst:'',
			cutofftime:Math.floor(Math.random() * 23) + ':'
			+Math.floor(Math.random() * 50) + "/"+Math.floor(Math.random() * 23),
			status:'IN',
			age: Math.floor(Math.random() * 1000),
			saved: Math.floor(Math.random() * 10000)
		};
	}

	for (var i = 0; i < 1000; i++) {
		randomsItems.push(createRandomItem(i));
	}

	function getPage(start, number, params) {

		var deferred = $q.defer();

		var filtered = params.search.predicateObject ? $filter('filter')(randomsItems, params.search.predicateObject) : randomsItems;

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
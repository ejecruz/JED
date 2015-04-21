(function(ocnt){

ocnt.app.factory('dataService', ['$q', '$filter', '$timeout','$http', function ($q, $filter, $timeout,$http,$scope) {
	
	var savedData = {};
	
	 function set(data) {
	   savedData = data;
	 }
	
	 function get() {
	  return savedData;
	 }

	return {
		 set: set,
		 get: get
	};

}]);

}) (window.ocnt = window.ocnt || {});
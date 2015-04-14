(function(ocnt) {

	ocnt.app = angular.module('OCNT');

	ocnt.app.controller('movementCtrl', [ '$scope', '$http','hotkeys','$state','MovementService',
			function(scope, $http,hotkeys,$state,service) {
		 var ctrl = this;

		 this.displayed = [];

		 this.callServer = function callServer(tableState) {

		 ctrl.isLoading = true;

		 var pagination = tableState.pagination;

		 var start = pagination.start || 0;   
		 var number = pagination.number || 10; 

		 service.getPage(start, number, tableState).then(function (result) {
		   ctrl.displayed = result.data;
		   tableState.pagination.numberOfPages = result.numberOfPages;
		   ctrl.isLoading = false;
		 });
		 
		};
	}]);
})(window.ocnt = window.ocnt || {}); 
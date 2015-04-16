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
			 scope.totalNoOfRec = 0;
			 service.retrievePageRecords(start, number, tableState,null).then(function (result) {
				 tableState.pagination.numberOfPages = result.totalNoOfPage;
				 tableState.pagination.numberOfRecords = result.totalNoOfRec;
				 ctrl.dest_filter = result.dest_filter;
				 ctrl.opt_filter = result.opt_filter;
				 ctrl.displayed = result.data;
				 ctrl.isLoading = false;
			 });
		 
		};
	}]);
})(window.ocnt = window.ocnt || {}); 
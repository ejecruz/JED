(function(ocnt) {
	ocnt.app = angular.module('OCNT');

	ocnt.app.controller('assignMovementCtrl', [ '$scope', '$http','hotkeys','$state','assignMovementService',
			function(scope, $http,hotkeys,$state,service) {
		 var ctrl = this;

		 this.displayed = [];

		 this.callServer = function callServer(tableState) {

			 ctrl.isLoading = true;

			 var pagination = tableState.pagination;

			 var start = pagination.start || 0;   
			 var number = pagination.number || 10; 
			 scope.totalNoOfRec = 0;
			 service.retrieveAssignMovementDetails().then(function (result) {
				 ctrl.displayed = result;
				 ctrl.isLoading = false;
			 });
		 
		};
	}]);
})(window.ocnt = window.ocnt || {}); 
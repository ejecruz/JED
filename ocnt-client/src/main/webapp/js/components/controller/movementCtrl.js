(function(ocnt) {
	ocnt.app = angular.module('OCNT');

	ocnt.app.controller('movementCtrl', [ '$scope', '$http','hotkeys','$state','MovementService','$interval',
			function(scope, $http,hotkeys,$state,service,$interval) {
		 
		 var ctrl = this;
		 this.displayed = [];
		 scope.mode = "Edit";
		 var loadMovementTimer;
		 var tableStateTemp;
		 
		 this.callServer = function callServer(tableState,refresh) {
			 tableStateTemp = tableState;
			 ctrl.isLoading = true;
			 
			 var pagination = tableState.pagination;

			 var start = pagination.start || 0;   
			 var number = pagination.number || 10; 
			 scope.totalNoOfRec = 0;
			 service.retrievePageRecords(start, number, tableState,refresh).then(function (result) {
				 tableState.pagination.numberOfPages = result.totalNoOfPage;
				 tableState.pagination.numberOfRecords = result.totalNoOfRec;
				 ctrl.dest_filter = result.dest_filter;
				 ctrl.opt_filter = result.opt_filter;
				 ctrl.displayed = result.data;
				 ctrl.isLoading = false;
			 });
		 
		};
		
		scope.switchMode = function switchMode(){
			 if(scope.mode == "Edit"){
				 scope.mode = "View";
				 scope.hideCol = true;
				 if(angular.isDefined(loadMovementTimer)){
					 return;
				 }
				 loadMovementTimer = $interval(function(){
					 ctrl.callServer(tableStateTemp,true);
				 },5000);
			 }else{
				 scope.mode = "Edit";
				 scope.hideCol = false;
				 if(angular.isDefined(loadMovementTimer)){
					 $interval.cancel(loadMovementTimer);
					 loadMovementTimer = undefined;
				 }
			 }
		 }
	}]);
})(window.ocnt = window.ocnt || {}); 
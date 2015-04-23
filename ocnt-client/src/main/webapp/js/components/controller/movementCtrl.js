(function(ocnt) {
	ocnt.app = angular.module('OCNT');

	ocnt.app.controller('movementCtrl', [ '$scope', '$http','hotkeys','$state','MovementService','dataService','$interval',
			function(scope, $http,hotkeys,$state,service,dataService,$interval) {
		 
		 var ctrl = this;
		 this.displayed = [];
		 scope.mode = "Edit";
		 var loadMovementTimer;
		 var tableStateTemp;
		 var refresh;
		 this.callServer = function callServer(tableState) {
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
					 refresh = true;
					 ctrl.callServer(tableStateTemp);
				 },5000);
			 }else{
				 scope.mode = "Edit";
				 scope.hideCol = false;
				 refresh = false;
				 if(angular.isDefined(loadMovementTimer)){
					 $interval.cancel(loadMovementTimer);
					 loadMovementTimer = undefined;
				 }
			 }
		 }
		
		scope.processOpt = function processOpt(row){
			console.log(row);
			dataService.set(row);
			//$state.go('assignMovement');
			$state.go('assignMovement', {}, {reload: true});
		}
		
		scope.searchDayRange = function searchDayRange(minusDate,plusDate){
			 ctrl.isLoading = true;
			 
			 var pagination = tableStateTemp.pagination;

			 var start = pagination.start || 0;   
			 var number = pagination.number || 10; 
			 scope.totalNoOfRec = 0;
			 service.searchDayRange(start, number, tableStateTemp, true, minusDate,plusDate).then(function (result) {
				 tableStateTemp.pagination.numberOfPages = result.totalNoOfPage;
				 tableStateTemp.pagination.numberOfRecords = result.totalNoOfRec;
				 ctrl.dest_filter = result.dest_filter;
				 ctrl.opt_filter = result.opt_filter;
				 ctrl.displayed = result.data;
				 ctrl.isLoading = false;
			 });
			
		}
	}]);
})(window.ocnt = window.ocnt || {}); 
(function(ocnt) {
	ocnt.app = angular.module('OCNT');

	ocnt.app.controller('assignMovementCtrl', [ '$scope', '$http','hotkeys','$state','assignMovementService','dataService','$interval',
			function(scope, $http,hotkeys,$state,service,dataService,$interval) {
		 
		 var ctrl = this;
		 this.displayedAllocatedData = [];
		 this.displayedNonAssignedData = [];
		 this.selected_movement_data = dataService.get();
		 this.totalNonAssignedRec = 0;
		 this.totalAllocatedRec = 0;
		 this.showMovementMessage = false;
		 scope.mode = "Edit";
		 var loadMovementTimer;
		 var tableStateTemp;
		 var refresh;

		 
		 
		 //1
		 this.callServerAllocatedData = function callServerAllocatedData(tableState) {
			 //alert("callServerAllocatedData");
			 tableStateTemp = tableState;
			 ctrl.isAllocedDataTableEmpty = true;
			 
			 var pagination = tableState.pagination;

			 var start = pagination.start || 0;   
			 var number = pagination.number || 5; 
			 scope.totalNoOfRec = 0;
			 
			 service.retrievePageRecordsAllocatedData(start, number, tableState,refresh).then(function (result) {
				 
				 var pages = 0;
				 
				 var records_per_page = 5;
				 pages = Math.ceil(result.length/records_per_page);
				 
				 tableState.pagination.numberOfRecords = result.length;
				 tableState.pagination.numberOfPages = pages;
				 
				 ctrl.totalAllocatedRec = result.length;
				 
				 //ctrl.dest_filter = result.dest_filter;
				 //ctrl.opt_filter = result.opt_filter;
				 ctrl.displayedAllocatedData = result.data;
				 
				 if(ctrl.displayedAllocatedData.length > 0){
					 ctrl.isAllocedDataTableEmpty = false;
				 }
				 else{
					 ctrl.isAllocedDataTableEmpty = true;
				 }
				 
			 });
		 
		};
		
		 //2
		 this.callServerNonAssignedData = function callServerNonAssignedData(tableState) {
			 tableStateTemp = tableState;
			 ctrl.isNonAssignedDataTableEmpty = true;
			 
			 var pagination = tableState.pagination;

			 var start = pagination.start || 0;   
			 var number = pagination.number || 5; 
			 scope.totalNoOfRec = 0;
			 
			 service.retrievePageRecordsNonAssignedData(start, number, tableState,refresh).then(function (result) {
				 
				 var pages = 0;
				 var records_per_page = 5;
				 
				 pages = Math.ceil(result.length/records_per_page);
				 
				 tableState.pagination.numberOfRecords = result.length;
				 tableState.pagination.numberOfPages = pages;
				 
				 ctrl.totalNonAssignedRec = result.length;
				 
				 //ctrl.dest_filter = result.dest_filter;
				 //ctrl.opt_filter = result.opt_filter;
				 ctrl.displayedNonAssignedData = result.data;
				 
				 if(ctrl.displayedNonAssignedData.length > 0){
					 ctrl.isNonAssignedDataTableEmpty = false;
				 }
				 else{
					 ctrl.isNonAssignedDataTableEmpty = true;
				 }
				 
			 });
		 
		};
		
		scope.processOpt = function processOpt(){
			//console.log(row);
			//dataService.set(row);
			ctrl.showMovementMessage = true;
			
			//$state.go($state.current, {}, {reload: true}); 
			//window.location.reload();
			//document.getElementsByName('opt1').options = false;
			
		}
		
		
	}]);
})(window.ocnt = window.ocnt || {}); 
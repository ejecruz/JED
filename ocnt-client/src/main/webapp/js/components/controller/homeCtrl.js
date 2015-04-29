(function(ocnt) {

	ocnt.app = angular.module('OCNT');

	ocnt.app
			.controller(
					'homeCtrl',
					[
							'$scope',
							'hotkeys',
							'$state',
							'$rootScope',
							function($scope, hotkeys, $state,$rootScope) {
								
								addDynamicTabs();
								addHotkeys();
								$rootScope.location = 'ICNGTW';
								function addDynamicTabs() {
									$scope.tabs = [
											{
												"title" : "(C)ontainerization",
												"template" : "/ocnt-client/view/modules/containerTab.html",
												"active": true
											}, {
												"title" : "(P)rint Labels",
												"template" : "/ocnt-client/view/modules/prntLblTab.html",
												"active": false
											}, {
												"title" : "Mo(v)ement",
												"template" : "/ocnt-client/view/modules/movementTab.html",
												"active": false
											}, {
												"title" : "(Q)uery",
												"template" : "/ocnt-client/view/modules/queryTab.html",
												active: false
											}, {
												"title" : "(M)aintenance",
												"template" : "/ocnt-client/view/modules/maintenanceTab.html",
												active: false
											} ];
								}
								
								function addHotkeys(){
									hotkeys.add({
										combo : 'v',
										description : 'Movement',
										callback : function() {
											$scope.tabs[2].active = true;
										}
									});
									hotkeys
											.add({
												combo : 'c',
												description : 'Containerization',
												callback : function() {
													$scope.tabs[0].active = true;
												}
											});
									hotkeys
									.add({
										combo : 'p',
										description : 'PrintLabels',
										callback : function() {
											$scope.tabs[1].active = true;
										}
									});
									hotkeys
									.add({
										combo : 'q',
										description : 'Query',
										callback : function() {
											$scope.tabs[3].active = true;
										}
									});
									hotkeys
									.add({
										combo : 'm',
										description : 'Maintenance',
										callback : function() {
											$scope.tabs[4].active = true;
										}
									});
									hotkeys.add({
										combo : '1',
										description : 'Movement Plus',
										callback : function() {
											$state.go('movementPlus');
										}
									});
								}
							} ]);
})(window.ocnt = window.ocnt || {});
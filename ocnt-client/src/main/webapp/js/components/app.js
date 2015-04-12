(function(ocnt){
angular
	.module('OCNT',['ui.router','ui.bootstrap','smart-table','cfp.hotkeys']);

ocnt.app = angular.module('OCNT');


ocnt.app.config(['$urlRouterProvider','$stateProvider',
	                         function($urlRouterProvider,$stateProvider){
	                	$urlRouterProvider.otherwise('/home');
	                	$stateProvider.state('home',{
	                		url:'/home',
	                		templateUrl: '/ocnt-client/view/modules/homeTab.html',
	                		controller: 'homeCtrl'
	                	});
	                	$stateProvider.state('movementPlus',{
	                		url:'/movementPlus',
	                		templateUrl: '/ocnt-client/view/modules/movement/movement_hu_plus.html',
	                		controller: 'movementCtrl'
	                	});
					}]);
}) (window.ocnt = window.ocnt || {});
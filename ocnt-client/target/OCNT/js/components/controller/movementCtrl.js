(function(ocnt) {

	ocnt.app = angular.module('OCNT');

	ocnt.app.controller('movementCtrl', [ '$scope', '$http',
			function($scope, $http) {
				 $scope.myData = [{name: "Moroni", age: 50},
                     {name: "Tiancum", age: 43},
                     {name: "Jacob", age: 27},
                     {name: "Nephi", age: 29},
                     {name: "Enos", age: 34}];
				 $scope.gridOptions = { data : 'myData' };
			} ]);
})(window.ocnt = window.ocnt || {});
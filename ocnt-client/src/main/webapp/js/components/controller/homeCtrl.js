(function(ocnt) {

	ocnt.app = angular.module('OCNT');

	ocnt.app.controller('homeCtrl', [ '$scope','hotkeys','$state',
			function($scope,hotkeys,$state) {
		hotkeys.add({
		    combo: 'v',
		    description: 'Movement',
		    callback: function() {
		      $('*[aria-controls="movement"]').tab('show');
		    }
		});
		hotkeys.add({
		    combo: 'c',
		    description: 'Containerization',
		    callback: function() {
		      $('*[aria-controls="containerization"]').tab('show');
		    }
		});
		hotkeys.add({
		    combo: '1',
		    description: 'Movement Plus',
		    callback: function() {
		    	$state.go('movementPlus');
		    }
		});
			} ]);
})(window.ocnt = window.ocnt || {});
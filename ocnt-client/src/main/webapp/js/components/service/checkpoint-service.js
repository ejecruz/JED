(function(wcc){
wcc.app.service('CheckpointService',
		[ '$http', function($http) {
				this.save = function(checkpoint) {
					alert("Data to be sent to webservice:"+JSON.stringify(checkpoint));
					callWebService('post', '/WCC/service/checkpoint/save.do' , checkpoint);
				};
				this.submit = function(checkpoint) {
					alert("Data to be sent to webservice:"+JSON.stringify(checkpoint));
					callWebService('post', '/WCC/service/checkpoint/submit.do' , checkpoint);
				};
				
				function callWebService(method, url , object){
					if(method == 'post'){
						$http.post(url,object).then(function(response){
							alert("Http Status:" +response.statusText+
									"Data Received from Server:"+JSON.stringify(response.data));
						})
					}else{
						$http.get(url,object).then(function(response){
							alert("Http Status:" +response.statusText+
									"Data Received from Server:"+JSON.stringify(response.data));
						})
					}
				}
		} ]);
}) (window.wcc = window.wcc || {});
function ajax(url,method,successCallback,errorCallback){

var xhr= new XMLHttpRequest();
xhr.onreadystatechange = function(){
if(this.readyState == 4 && this.status == 200){
var response = this.responseText;
successCallback(response);
}
else if(this.readyState ==4 &this.status !=200){errorCallback(this.responseText);}
}
xhr.open(method, url, true);
xhr.send();
}
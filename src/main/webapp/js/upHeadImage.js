/**
 * 
 */

$(function() {

	$("#headImageButton").click(function() {

		var headImage = $("#headImage").val();
	    var headImageIndex = headImage.substr(headImage.lastIndexOf( ".")).toUpperCase();
	    //alert(headImageIndex)
	    if(headImageIndex!=".JPG"&&headImageIndex!=".PNG"){
	    	alert("只能上传.jpg .png");
	    	return false;
	    }
	    var headImageSize = $("#headImage")[0].files[0].size;
	    //alert(headImageSize)
		if(headImageSize>1048576){
			alert("文件需小于1M");
	    	return false;
		}
		
		
		$("#shangchuan").text("上传中勿操作----")
		
		$("#headImageForm").ajaxSubmit({
			type: "POST",
			url:getRootPath()+"/fileUp/upHeadImage",
			dataType: "json",
		    success: function(data){
		    	if(data.code==100){
		    		//alert(data.extend.path);
			     	//alert(data.extend.webPath);
			     	$("#showHeadImage").attr("src",data.extend.webPath);
			     	$("#shangchuan").text("上传完成稍等图片回显")
		    	}else{
		    		alert("只能上传.jpg .png且文件小于1M");
		    	}
		     	
			}
		});

	})
});

// 得到绝对路径
function getRootPath() {
	// 获取当前网址，如： http://localhost:9527/zdss-web/login/login.do
	var curWwwPath = window.document.location.href;
	// console.log("当前网址：" + curWwwPath);

	// 获取主机地址之后的目录，如：zdss-web/login/login.do
	var pathName = window.document.location.pathname;
	// console.log("当前路径：" + pathName);

	var pos = curWwwPath.indexOf(pathName);
	// console.log("路径位置：" + pos);

	// 获取主机地址，如： http://localhost:9527
	var localhostPath = curWwwPath.substring(0, pos);
	console.log("当前主机地址：" + localhostPath);

	// 获取带"/"的项目名，如：/zdss-web
	var projectName = pathName
			.substring(0, pathName.substr(1).indexOf('/') + 1);
	console.log("当前项目名称：" + projectName);
	console.log(localhostPath + projectName);
	return localhostPath + projectName;
}

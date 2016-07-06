<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>设置基本信息</title>
<script type="text/javascript" src="resources/js/jquery-3.0.0.min.js"></script>
<script type="text/javascript">
function setInfo(){
	$.post("setInfo",
	{
		computeEP:$("#computeEP").val(),
		networkEP:$("#networkEP").val(),
		adminUsername:$("#adminUsername").val(),
		adminPassword:$("#adminPassword").val(),
		mqURL:$("#mqURL").val()
	},
	function(data, status){
		alert("Data: "+data+"\nStatus: "+status);
	});
}
</script>
 
<!-- menu -->
<ul>
<li><a href="#">设置</a></li>
</ul>
</head>
<body>

<div>
OpenStack Compute Endpoint:${computeEP}
<p><input type="text" id="computeEP" size="100"/></p>
OpenStack Network Endpoint:${networkEP}
<p><input type="text" id="networkEP" size="100"/></p>
OpenStack Admin Username:${adminUsername}
<p><input type="text" id="adminUsername" /></p>
OpenStack Admin Password:${adminPassword}
<p><input type="password" id="adminPassword"/></p>
ActiveMQ URL:${mqURL}
<p><input type="text" id="mqURL"/></p>
<button id="setInfo" onclick="setInfo()">设置</button>
</div>
</body>
</html>
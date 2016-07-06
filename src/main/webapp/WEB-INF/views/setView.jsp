<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>设置基本信息</title>
<script type="text/javascript" src="/resources/js/jquery-3.0.0.min.js"></script>
<script >
$(document).ready(function(){
  $("p").click(function(){
    $(this).hide();
  });
});
</script>
<!-- menu -->

</head>
<body>
<ul>
<li><a href="#">设置</a></li>
</ul>
<div>
OpenStack Compute Endpoint:${computeEP}
<p><input type="text" name="computeEP" size="100"/></p>
OpenStack Network Endpoint:${networkEP}
<p><input type="text" name="networkEP" size="100"/></p>
OpenStack Admin Username:${adminUsername}
<p><input type="text" name="adminUsername" /></p>
OpenStack Admin Password:${adminPassword}
<p><input type="password" name="adminPassword"/></p>
ActiveMQ URL:${mqURL}
<p><input type="text" name="mqURL"/></p>
<p><button id="setInfo">设置</button></p>
</div>
<p>如果您点击我，我会消失。</p>
<p>点击我，我会消失。</p>
<p>也要点击我哦。</p>


<script>
document.write("<h1>This is a heading</h2>");
</script>
</body>
</html>
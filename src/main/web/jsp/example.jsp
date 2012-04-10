<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">
<html>
<head>
<META http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Example Gradle AMP</title>
<link href="../css/example.css" rel="stylesheet" type="text/css">
</head>
<%@ page import="com.example.ampgradleexample.MyMessage" %>
<% MyMessage myMessage = new MyMessage(); %>
<body>
	<div id="logo">
		<img src="../images/app-logo.png"/>
	</div>

	<div id="wrapper">
		<div id="content">
			<h2><span class="label">Message:</span> <%=myMessage.getMessage()%></h2>
		</div>
	</div>
</body>
</html>
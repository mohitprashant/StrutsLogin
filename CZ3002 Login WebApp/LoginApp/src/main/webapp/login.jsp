<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head></head>
<body>
	<h3>Login Page</h3>

	<s:form action="login">
		<s:textfield name="user" label="Username" />
		<s:password name="pass" label="Password" />
		
		<s:submit />
	</s:form>

</body>
</html>
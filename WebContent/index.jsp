<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!doctype html>
<html>
<head></head>

<body>

<form action="${pageContext.request.contextPath }/Login/login" method="post">
<div><span>用户名：</span><span><input type="text" name="userName" /></span></div>
<div><span>密码：</span><span><input type="password" name="passWord" /></span></div>
<div>
	<input type="submit" value="提交"  />
</div>
</form>
<div style="color:red;font-size: 20px;"><s:fielderror /></div>
</body>
</html>

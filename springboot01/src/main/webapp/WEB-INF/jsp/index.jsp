<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:forEach items="${lu }" var="l">
		<span>用户名${l.uname }</span>
		<span>密码${l.upwd }</span>
		<br>
	</c:forEach>

</body>
</html>
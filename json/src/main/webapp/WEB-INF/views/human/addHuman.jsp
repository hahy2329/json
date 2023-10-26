<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="${contextPath }/resources/css/bootstrap.css">
<title>사용자 작성</title>
<script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
<script src="${contextPath }/resources/js/bootstrap.js"></script>
</head>
<body>
	
	<form action="${contextPath }/human/addHuman" method="post">		
			<input type="text" name="username" placeholder="이름"/>
			<input type="text" name="userage" placeholder="나이"/>
			<input type="text" name="usergender" placeholder="성별"/>
			<input type="text" name="useremail" placeholder="이메일"/>
		<button type="submit">작성</button>
	</form>
</body>
</html>
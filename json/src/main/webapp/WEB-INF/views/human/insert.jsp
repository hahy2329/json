<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="${contextPath }/resources/css/bootstrap.css">
<title>JSP AJAX</title>
<script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
<script src="${contextPath }/resources/js/bootstrap.js"></script>
<script>
	
		
		function searchFunction(){
			
			var url = "${contextPath}/human/insert";
			url+="?username=" + $("#username").val();
			
			location.href=url;
			
		}
		
	


</script>
</head>
<body>
	<br>
	<div class="container">
		<div class="form-group row pull-right">
			<div class="col-xs-8">
				<input class="form-control" id="username" name="username" onkeyPress="searchFunction();" type="text" size="20">
			</div>
			<div class="col-xs-2">
				<button class="btn btn-primary" onclick="searchFunction();" type="button">검색</button>
			</div>
		</div>
		<table class="table" style="text-align: center; border: 1px solid #ddddd">
			<thead>
				<tr>
					<th style="background-color: #fafafa; text-align: center; ">이름</th>
					<th style="background-color: #fafafa; text-align: center; ">나이</th>
					<th style="background-color: #fafafa; text-align: center; ">성별</th>
					<th style="background-color: #fafafa; text-align: center; ">이메일</th>
				</tr>
			</thead>
			<tbody id="ajaxTable">
				<c:forEach var="userDTO" items="${userList }" >
					<tr>
						<td>${userDTO.username }</td>
						<td>${userDTO.userage }</td>
						<td>${userDTO.usergender }</td>
						<td>${userDTO.useremail }</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<br>
		<a href="${contextPath }/human/addHuman"><button  type="button" style="color: blue; text-align: right;">데이터 추가</button></a>
	</div>
</body>
</html>
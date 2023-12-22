<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSTL 라이브러리 2 </title>
</head>
<body>
	<h1>1. 조건문 (c:choose, c:when, c:otherwise)</h1>
	<c:set var="weight" value="65" />
	
	<c:choose>
		<c:when test="${weight < 60}">
			치맥먹자! <br>
		</c:when>
		
		<c:when test="${weigth < 70}">
			샐러드 먹자! <br>
		</c:when>
		<c:otherwise>
			굶자 <br>
		</c:otherwise>
	</c:choose>
	
	<h1>2. 반복문 (c:forEach)</h1>
	<c:forEach begin="0" end="5" step="1" var="i">
		${i} <br>
	</c:forEach>
	
	<%-- 16~20 : 5번 --%>
	<c:forEach begin ="16" end="20" step="1" var="i" varStatus="status">
		var: ${i} 
		current: ${status.current}
		first: ${status.first}
		last : ${status.last}
		index : ${status.index}
		count : ${status.count}
		<br>
	</c:forEach>
	${fruits} <br>
	
	<%-- 서버에서 가져온 List<String> 출력 --%>
	<c:forEach items="${fruits}" var="fruit" varStatus="status">
		${fruit} :::  index:${status.index} ::: count:${status.count} <br>
	</c:forEach>
	
	<%-- 서버에서 가져온 List<Map> 테이블 출력 --%>
	<table border="1">
		<thead>
			<tr>
				<th>번호</th>
				<th>이름</th>
				<th>나이</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${users}" var="user" varStatus="status">
			<tr>
				<td>${status.count}</td>
				<td>${user.name}</td>
				<td>${user.age}</td>
			</tr>
			</c:forEach>
		</tbody>
	
	</table>
	
</body>
</html>
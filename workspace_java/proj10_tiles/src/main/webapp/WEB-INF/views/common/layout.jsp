<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>layout</title>
<style>
	#side{
		display: inline-block;
		width: 30%;
		border: 1px solid green;
	}
	
	#content{
		display: inline-block;
		width: 39%;
		border: 1px solid black;
		vertical-align: top;
	}
	

</style>
</head>
<body>
	<!-- 얘가 진짜 홈페이지 느낌 -->

	<div>

		<%-- 		<%@import%> --%>
		<%-- 		<jsp:include page=""></jsp:include> --%>

		<tiles:insertAttribute name="header" />

	</div>

	<!-- side -->

	<div id="side">
		<tiles:insertAttribute name="side" />
	</div>

	<!-- content -->

	<div id="content">
		<tiles:insertAttribute name="content" />
	</div>

	<!-- footer -->

	<div>
		<tiles:insertAttribute name="footer" />
	</div>

	${serverTime}

</body>
</html>
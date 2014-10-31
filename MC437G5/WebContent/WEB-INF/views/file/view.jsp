<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
	<head>
	<title>MC437 Grupo 5</title>
	<link href="<c:url value="/resources/css/style.css"/>" rel="stylesheet" type="text/css" />
	</head>
	<body>
	<div class="container">
		<div id="header">
			<div id="logo">&nbsp;</div>
			<ul id="menu">
				<li class="menu-item">Submiss&otilde;es</li><li class="menu-item">Minha conta</li>
			</ul>
		</div>
		<div class="main">
			<h1 class="pagetitle">Arquivos de Teste</h1>
			<div id="uploadlink">
				<h2> Upload </h2>
				<a href="upload">Faça o upload de um novo arquivo</a>
			</div>
		</div>
		<div class="main">
			<jsp:include page="list.jsp" />
		</div>
		</div>
	</body>
</html>

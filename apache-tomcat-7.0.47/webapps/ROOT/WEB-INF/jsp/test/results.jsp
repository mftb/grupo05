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
	<h1 class="pagetitle">Resultados dos testes de mutação para o arquivo ${fileName}</h1>

	<table>
	<thead>
		<tr>
	    	<th> Conjunto de teste <th> 
			<th> Caso de teste <th> 
			<th> Total de dados de teste <th> 
			<th> Operador de mutação <th> 
			<th> Mutante <th> 
			<th> Vivo <th> 
	    </tr>
	</thead>
	<tbody>
		<c:forEach var="testResult" items="${testResultList}">
			<tr>
				<td> ${testResult.testSet} </td>
				<td> ${testResult.testCase} </td>
				<td> ${testResult.dataTestCount} </td>
				<td> ${testResult.mutationOperator} </td>
				<td> ${testResult.mutant} </td>
				<td> ${testResult.alive} </td>
	        </tr>
		</c:forEach>	
	</tbody>
</table>
</div>
</div>
</body>
</html>
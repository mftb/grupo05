<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Resultados dos testes</title>
</head>
<body>
	<h1>Resultados dos testes de mutação para o arquivo ${fileName}</h1>

	<table>
		<thead>
			<tr>
				<th>Conjunto de teste
				<th>
				<th>Caso de teste
				<th>
				<th>Total de dados de teste
				<th>
				<th>Operador de mutação
				<th>
				<th>Mutante
				<th>
				<th>Vivo
				<th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="testResult" items="${testResultList}">
				<tr>
					<td>${testResult.testSet}</td>
					<td>${testResult.testCase}</td>
					<td>${testResult.dataTestCount}</td>
					<td>${testResult.mutationOperator}</td>
					<td>${testResult.mutant}</td>
					<td>${testResult.alive}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>
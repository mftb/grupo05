<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<div id="header">
	<ul id="menu">
		<a href="view"><li class="menu-item">Home</li></a>
		<a href="list"><li class="menu-item">Submiss&otilde;es</li></a>
		<a href="upload"><li class="menu-item">Upload</li></a>
		<a href="faq"><li class="menu-item">FAQ</li></a>
	</ul>
</div>
<div class="mainview">
	<div class="breadcrumb">
		<a href="view">Home</a> &gt; <a href="list">Resultados do teste</a>
	</div>
	<br>
	<h1 class="pagetitle">Resultados dos Testes de mutação para o arquivo com ID = ${result.fileTitle} </h1>	
	<div id="files-owned-list">
	<table>
		<thead>
			<tr>
		    	<th> Teste ID <th> 
				<th> Codigo do teste <th> 
				<th> Nome do caso de teste <th> 
				<th> Operador de mutação <th> 
				<th> Vivo? <th> 
				<th> Falhou? <th> 
		    </tr>
		</thead>
		<tbody>
			<c:forEach var="testResult" items="${result.mutantList}">
				<tr>
					<td> ${testResult.testId} </td>
					<td> ${testResult.testCode} </td>
					<td> ${testResult.testCaseName} </td>
					<td> ${testResult.mutationOperators} </td>
					<td> ${testResult.isAlive} </td>
					<td> ${testResult.hasFailed} </td>
		        </tr>
			</c:forEach>	
		</tbody>
	</table>
	</div>
</div>
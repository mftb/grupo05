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
<div class="main">
	<div class="breadcrumb">
		<a href="view">Home</a> &gt; <a href="list">Minhas
			submiss&otilde;es</a>
	</div>
	<br>
	<h1 class="pagetitle">Seus arquivos</h1>
	<div id="files-owned-list">
		<table>
			<thead>
				<tr>
					<th>Arquivo</th>
					<th>Adicionado em</th>
					<th>Ações</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="ownedFile" items="${ownedFilesList}">
					<tr>
						<td>${ownedFile.name}</td>
						<td>${ownedFile.addTs}</td>
						<td><a href="../test/results"> Visualizar </a> | <a href="">
								Compartilhar </a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</div>
<div class="main">
	<h1 class="pagetitle">Arquivos compartilhados com você</h1>
	<div id="files-shared-list">
		<table>
			<thead>
				<tr>
					<th>Arquivo</th>
					<th>Adicionado por</th>
					<th>Adicionado em</th>
					<th>Ações</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="sharedFile" items="${sharedFilesList}">
					<tr>
						<td>${sharedFile.name}</td>
						<td>${sharedFile.owner}
						<td>${sharedFiles.addTs}</td>
						<td><a href="../test/results"> Visualizar </a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</div>
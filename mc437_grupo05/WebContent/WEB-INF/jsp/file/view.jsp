<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<div class="container">
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
			<a href="view">Home</a>
		</div>
		<br>
		<h1 class="pagetitle">Arquivos de Teste</h1>
		<div id="uploadlink">
			<h2>Upload</h2>
			<a href="upload">Faça o upload de um novo arquivo</a>
		</div>
	</div>
	<div class="main">
		<h1 class="pagetitle">Seus arquivos</h1>
		<div id="files-owned-list">
			<table>
				<thead>
					<tr>
						<th>Arquivo&nbsp;</th>
						<th>Adicionado em&nbsp;</th>
						<th>Ações&nbsp;</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="ownedFile" items="${ownedFilesList}">
						<tr>
							<td>${ownedFile.name}&nbsp;</td>
							<td>${ownedFile.addTs}&nbsp;</td>
							<td><a href="../test/results">Visualizar&nbsp;</a><a href="">Compartilhar&nbsp;</a></td>
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
						<th>Arquivo&nbsp;</th>
						<th>Adicionado por&nbsp;</th>
						<th>Adicionado em&nbsp;</th>
						<th>Ações&nbsp;</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="sharedFile" items="${sharedFilesList}">
						<tr>
							<td>${sharedFile.name}&nbsp;</td>
							<td>${sharedFile.owner}&nbsp;</td>
							<td>${sharedFiles.addTs}&nbsp;</td>
							<td><a href="../test/results">Visualizar&nbsp;</a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>
</div>

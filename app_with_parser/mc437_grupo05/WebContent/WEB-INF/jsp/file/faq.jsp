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
	<div class="faq">
		<div class="breadcrumb">
			<a href="view">FAQ</a>
		</div>
		<br>
		<h1 class="pagetitle">FAQ - Guia do Usu&aacute;rio</h1>
		<div id="uploadlink">
			<h2 class="faqquestion">Como posso fazer upload de XML?</h2>
			<p class="faqanswer">
			1) V&aacute; para a <a href='upload'>tela de upload</a>.<br>
			2) Clique no bot&atilde;o "Browse" para selecionar o arquivo desejado para upload.<br>
			3) Clique no bot&atilde;o "Submeter" para fazer o upload do arquivo.<br><br>
			Vale lembrar que &eacute; poss&iacute;vel acessar a interface de upload atrav&eacute;s da <a href='view'>home</a>.
			</p>
			<br><br>
			<h2 class="faqquestion">Onde posso visualizar meus arquivos salvos?</h2>
			<p class="faqanswer">
			Suas submiss&otilde;es, ou seja, seus arquivos salvos, podem ser visualizados atrav&eacute;s
			da <a href='list'>interface de submiss&otilde;es</a>, ou diretamente na <a href='view'>home</a>.
			</p>
		</div>
	</div>
</div>
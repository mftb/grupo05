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
			<a href="view">Home</a> &gt; <a href="upload">Nova submiss&atilde;o</a> &gt;<a href="#">Submiss&atilde;o conclu&iacute;da</a> 
		</div>
		<br>
		<h1 class="pagetitle">Upload de arquivo</h1>
		<br><br>
		<h2>O Upload foi conclu&iacute;do com ${result.success}!</h2>
	</div>
</div>


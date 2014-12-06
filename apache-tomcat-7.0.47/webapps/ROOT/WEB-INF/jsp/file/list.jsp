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
		<a href="view">Home</a> &gt; <a href="list">Minhas
			submiss&otilde;es</a>
	</div>
	<br>
	<h1 class="pagetitle">Seus arquivos</h1>
	<div id="files-owned-list">
		${result}
	</div>
</div>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
	<title>Upload de arquivos</title>
	
	<script src="<c:url value="/resources/js/jquery-2.1.1.min.js"/>"></script>
	<script src="<c:url value="/resources/js/jquery-ui-1.10.3/ui/jquery.ui.widget.js"/>"></script>
	<script src="<c:url value="/resources/js/jquery.iframe-transport.js"/>"></script>
	<script src="<c:url value="/resources/js/jquery.fileupload.js"/>"></script>
	<script src="<c:url value="/resources/js/bootstrap.js"/>"></script>
	
	<link href="<c:url value="/resources/css/bootstrap/bootstrap.min.css"/>" type="text/css" rel="stylesheet" />
	
	<script src="<c:url value="/resources/js/upload.js"/>"></script>
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
			<div class="breadcrumb"><a href="#">Home</a> > <a href="#">Minhas submiss&otilde;es</a> > <a href="#">Nova submiss&atilde;o</a></div><br>
			<h1 class="pagetitle">Upload de arquivo</h1><br>
			<!-- <form action="#" method="get">
				Endere&ccedil;o: <input type="file" name="path" style="display: inline-block;"><br><br>
				<input type="submit" value="Submeter">
			</form> -->
			<div style="width:500px;padding:20px">
			 
			    <input id="fileupload" type="file" name="files[]" data-url="rest/controller/upload" multiple>
			 
			    <div id="dropzone">Arraste o arquivo aqui</div>
			 
			    <div id="progress">
			        <div style="width: 0%;"></div>
			    </div>
			 
			    <table id="uploaded-files">
			        <tr>
			            <th>File Name</th>
			            <th>File Size</th>
			            <th>File Type</th>
			            <th>Download</th>
			        </tr>
			    </table>
			 
			</div>
		</div>
	</div>
</body>
</html>

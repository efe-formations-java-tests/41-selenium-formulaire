<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>	
	
	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Liste des livres</title>
	<link rel="stylesheet" href="css/style.css">

</head>
<body>
	<h1>Liste des livres</h1>
	<h2>Nombre de livre<c:if test="listeL.size() > 0">s</c:if> en base : ${listeL.size() }</h2>
	
	<ul>
		<c:forEach items="${listeL}" var="l">
			<li>${l.titre } de ${l.auteur } - <a href="suppr?id=${l.id }">x</a></li>
		</c:forEach>
	</ul>
	<footer>
		<a href="index.html">Retour menu principal</a>
	</footer>
</body>
</html>
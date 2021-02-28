<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ajout d'un livre</title>
	<link rel="stylesheet" href="css/style.css">
</head>
<body>
	<h1>Ajout d'un livre</h1>
	
	<form action = "ajout" method="post">
		<p>
			<label for="auteur">Auteur :</label>
			<input id="auteur" name="auteur">
		</p>
		<p>
			<label for="titre">Titre :</label>
			<input id="titre" name="titre">
		</p>
		<p>
			<button>Ajouter</button>
		</p>
	
	</form>
	
	<footer>
		<a href="index.html">Retour menu principal</a>
	</footer>
</body>
</html>
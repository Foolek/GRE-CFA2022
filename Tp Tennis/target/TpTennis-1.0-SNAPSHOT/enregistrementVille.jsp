<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html lang="fr">
<head>
    <link href="css/style.css" rel="stylesheet">
    <meta charset="utf-8">
    <title>enregistrement d'une nouvelle ville</title>
</head>

<body>
<p>enregistrement d'une ville</p>
<h3>  Liste des villes deja inserees</h3>
<ul>
    <c:forEach var="ville" items="${list}">
        <li>${ville}</li>
    </c:forEach>
</ul>

<form  action="CtlVille" method="post">
    <p>
        <label>Nom de la ville</label>
        <input type='text' name='txNomVille' required  >
    </p>
    <input type='submit'  value="insertion ville " ></input>
</form>


<span class="erreur">${requestScope.msgInsert}</span>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>

<script type="text/javascript" src="js/fadeOut.js"> </script>
</body>
</html>
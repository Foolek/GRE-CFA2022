<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html lang="fr">
    <head>
        <meta charset="utf-8">
        <title>Ajout de ville</title>
        <link rel="stylesheet" href="css/insertVille.css">
        <link rel="preconnect" href="https://fonts.googleapis.com">
        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
        <link href="https://fonts.googleapis.com/css2?family=Square+Peg&display=swap" rel="stylesheet">
    </head>

    <header>
        <h1>enregistrement d'une ville</h1>
    </header>

    <body>
        <article>
            <div>
                <h3>  Liste des villes deja inserees</h3>
                <ul>
                    <c:forEach var="ville" items="${list}">
                        <li>${ville}${id}</li>
                    </c:forEach>
                </ul>

                <form  action="PlaceCtrl" method="post">
                    <p>
                        <label>Nom de la ville</label>
                        <input type='text' name='txNomVille' required  >
                    </p>
                    <input type='submit'  value="insertion ville " ></input>
                </form>
            </div>
        </article>



        <span class="erreur">${requestScope.msgInsert}</span>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
        <script type="text/javascript" src="js/fadeOut.js"> </script>
    </body>
</html>
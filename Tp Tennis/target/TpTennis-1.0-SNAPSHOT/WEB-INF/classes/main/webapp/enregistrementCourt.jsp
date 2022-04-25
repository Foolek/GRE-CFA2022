<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html lang="fr">
  <head>
  	<link href="css/style.css" rel="stylesheet">
    <meta charset="utf-8">
    <title>enregistrement d'un court de tennis</title>
  </head>

  <body>
       <p>enregistrement d'un court</p>
       <h3>  Liste de courts déjà insérés </h3>
        <ul>
         	<c:forEach var="court" items="${list}">
        		<li>${court}</li>
        	</c:forEach>
        </ul>

	    <form  action="CtlCourt" method="post">
			<p>
				<label>Nom du court</label>
				<input type='text' name='txNomCourt' required  >
			</p>
			<input type='submit'  value="insertion court " ></input>
		</form>
      
      
       	<span class="erreur">${requestScope.msgInsert}</span>
           <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
       
        <script type="text/javascript" src="js/fadeOut.js"> </script>
  </body>
</html>
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
	<head>
		<meta charset="UTF-8">
		<title>>enregistrement voyage</title>
	</head>
	<body>
        <p>enregistrement  voyage </p>
       <h3>  Liste de voyage d�j� ins�r�s </h3>
        <ul>
         	<c:forEach var="voyage" items="${list}">
        		<li>${voyage}</li>
        	</c:forEach>
        </ul>

         <form  action="TripCtrl" method="post">
			<p>
	
	          <!-- ajouter un liste des villes de depart   -->
	         <p>
				<label>insertion ville de depart</label>
				
				<select name="cbVilleDep"  id="cbVilleDep" size="1" >
							
					<c:forEach var="voyage" items="${list2}">
        		        <option>${voyage.depart}</option>
        	      </c:forEach>
		    	</select>
			</p>
	          
	          <!-- ajouter un liste des villes de destination   -->
	         <input type='submit'  value="insertion trip " ></input>
			</form>


		<span class="erreur">${requestScope.msgInsert}</span>
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
		<script type="text/javascript" src="js/fadeOut.js"> </script>

	</body>
</html>
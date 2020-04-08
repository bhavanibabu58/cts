<%@ page language="java" isELIgnored="false"
	contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="/css/mystyle.css">
<meta charset="ISO-8859-1">
<title>Show</title>
</head>
<body>




	
		<section class="bodyblocklist">

	<h2>Food and Accommodation</h2>

	<a class="alist" href="/">Home</a>
	<a class="alist" href="showCustomerForm">Show Customer Form</a>     
	<table class="listtable" border="1" cellpadding="5">
		        
		<tr class="listtr">
			            
			<th class="listth">Tourist ID</th>             			
			<th class="listth">Location</th>             
			<th class="listth">Hotel Name</th>    
			<th class="listth">Room No</th> 
			<th class="listth">Room Type</th> 
			<th class="listth">Preferred Food</th> 
			<th class="listth">Exp. Arrival Date</th> 
			<th class="listth">Exp. Departure Date</th> 
		</tr>
		<c:forEach items="${touristPojoListObj}" var="touristpo">
        <tr class="listtr">
				            
				 
				
				
				<td class="listtdstay">${touristpo.id}</td>             	   
				<td class="listtdstay">${touristpo.location}</td>   
				<td class="listtdstay">${touristpo.hotelname}</td>  
				<td class="listtdstay">${touristpo.roomno}</td>   
				<td class="listtdstay">${touristpo.roomtype}</td>
				<td class="listtdstay">${touristpo.preffered_food}</td>  
				<td class="listtdstay">${touristpo.arrdate}</td> 
				<td class="listtdstay">${touristpo.depdate}</td> 
				    
				<td class="listtdstay">               
				<a class="alist" href="/showEditForm?id=${touristpo.id}">Edit</a>&nbsp;&nbsp;&nbsp;               					        
				</td>         
			</tr>
        </c:forEach>

</section>

	

</body>
</html>
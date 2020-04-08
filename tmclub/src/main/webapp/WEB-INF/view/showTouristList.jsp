<%@ page language="java" isELIgnored="false"
	contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="/css/mystyle.css">
<meta charset="ISO-8859-1">
<title>Tourist List</title>
</head>
<body>



	<section class="bodyblocklist">
		
	<center><h2>List of Tourists</h2></center>
	


	<form:form name="searchCompanyForm" method="POST"
		action="/searchBYCompanyName" modelAttribute="touristPojo">
             <table>
			<tr>
				<td><form:label path="cname">Search by Tourist Name :</form:label></td>
				<td><form:input path="cname" /></td>
				<td><input type="submit" value="Search" /></td>
			</tr>
		</table>
        </form:form>

	<a class="alist" href="/">Home</a>
	<a class="alist"  href="showCustomerForm">Show Customer Form</a>     
	<table class="listtable" 
     border="1" cellpadding="5">
		        
		<tr class="listtr">
			            
			<th class="listth">Tourist ID</th>             
			<th class="listth">First Name</th>  
			          
			<th class="listth">Age</th> 
			<th class="listth">Gender</th>
			<th class="listth">Contact no.1</th>
			<th class="listth">Contact no.2</th>
			<th class="listth">Email</th>
			<th class="listth">Id Proof No.</th>
			 <th class="listth">Destination.</th>  
			
			          
			
			
			
		</tr>
		<c:forEach items="${touristPojoListObj}" var="touristpo">
        <tr class="listtr">
				<td class="listtd">${touristpo.id}</td>             
				<td class="listtd">${touristpo.cname}</td>   
				         
				<td class="listtd">${touristpo.age}</td>
				<td class="listtd">${touristpo.gender}</td>
				<td class="listtd">${touristpo.pcontact}</td> 
				<td class="listtd">${touristpo.scontact}</td> 
				<td class="listtd">${touristpo.email}</td>
				<td class="listtd">${touristpo.idno}</td>
				<td class="listtd">${touristpo.destination}</td>    	    
				<td class="listtdlast"> 
				<a class="alist" href="/staymg">Stay</a> &nbsp;&nbsp;&nbsp;
				<a  class="alist"href="/health">Health</a> &nbsp;&nbsp;&nbsp;    
			    <a class="alist" href="/showEditForm?id=${touristpo.id}">Edit</a>&nbsp;&nbsp;&nbsp;  
				<a class="alist" href="/deleteCompany?id=${touristpo.id}">Delete</a> 	 &nbsp;&nbsp;&nbsp; 	       
				</td>         
			</tr>
        </c:forEach>
</table>
</section>

	

</body>
</html>
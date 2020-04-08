<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Search By Id</title>

</head>

<body background="/image/tname.jpg">

<center><table class="listtable" 
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
		
        <tr class="listtr">
				<td class="listtd">${touristPojo.id}</td>             
				<td class="listtd">${touristPojo.cname}</td>   
				         
				<td class="listtd">${touristPojo.age}</td>
				<td class="listtd">${touristPojo.gender}</td>
				<td class="listtd">${touristPojo.pcontact}</td> 
				<td class="listtd">${touristPojo.scontact}</td> 
				<td class="listtd">${touristPojo.email}</td>
				<td class="listtd">${touristPojo.idno}</td>
				<td class="listtd">${touristPojo.destination}</td></center>    	    
				
</body>
</html>
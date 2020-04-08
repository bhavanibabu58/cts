<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="/css/mystyle.css">
<script src="/js/login.js"></script>

<meta charset="ISO-8859-1">
<title>Log In</title>
</head>
<body>
<header class="headerblocklog">
		<%@ include file="header.jsp"%>
	</header>


	
		<section class="bodyblocklog">

		
<form:form name="LoginForm" onsubmit="return validateloginForm()"
			 method="POST"
			action="/loginUser" modelAttribute="loginPojo">
             <table class="logintable">	
			<caption style="font-size:20pt;"><h2>User Login</h2></caption>

<th class="loginth">
				<tr rowspan="2">
					<td  class="logintd"><form:label path="uname">User Name</form:label></td>
					<td class="logintd"><form:input style="height:50px;width:150px;font-size:20pt;" path="uname" /></td>
					
				</tr>
		
				
				
				<tr>
					<td class="logintd"><form:label path="pw">Password</form:label></td>
					<td class="logintd"><form:input style="height:50px;width:150px;font-size:20pt;" path="pw"/></td>
				</tr>
				<tr></tr><tr></tr><tr></tr>
				<tr class="logintd"><td></td>
				 <td><input type="submit" value="submit"  /></td></center>
				</tr>
</th>
			</table>
			
        </form:form>
</section>

	<footer class="footerblock">
		<%@ include file="footer.jsp"%>
	</footer>

</body>
</html>
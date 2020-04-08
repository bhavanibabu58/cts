<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Tourism</title>
<link rel="stylesheet" type="text/css" href="/css/mystyle.css">
<script src="/js/myscript.js"></script>



</head>
<body>

	<header class="headerblockw">
		<%@ include file="header.jsp"%>
	</header>

	<section class="bodyblockw">
	<section class="quotew">
	
<pre>
	..Take only memories..
		Leave only footprints..
		
				--Chief Seattle--
</pre>
</section>
	<div class="menuboxw">
	<ul><li><form action="search">
	Search By Id <input type="text" name="id">
	<input type = "submit" value="search">
	
	</form></li></ul>
<section class="gap"></section>
		<ul><li> <a href="showCustomerForm">Enroll new tourist</a></li></ul>
		<ul><li>	 <a href="listCompany">List of tourists</a></li></ul>
		
	</div>
	
	</section>

	<footer class="footerblock">
		<%@ include file="footer.jsp"%>
	</footer>

</body>
</html>
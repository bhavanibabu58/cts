function validateloginForm() {
	var uname= document.forms["LoginForm"]["uname"].value;
	var pw=document.forms["LoginForm"]["pw"].value;
	var formStatus = true;
	
	
 if (uname!="cts") {
		formStatus = false;
		alert("invalid username");
	}else if (pw!="chnaj2019") {
		formStatus = false;
		alert("invalid password");
		
	}else {
			if (formStatus) {
				alert("valid form");
			}
		}

		return formStatus;

}

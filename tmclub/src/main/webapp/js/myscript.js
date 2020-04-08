/**
 * 
 */



function validateTouristRegistrationForm() {

	var cname = document.forms["touristRegistrationForm"]["cname"].value;
	var age = document.forms["touristRegistrationForm"]["age"].value;
	
	var pcontact = document.forms["touristRegistrationForm"]["pcontact"].value;
	var idno = document.forms["touristRegistrationForm"]["idno"].value;
	var emergencyContact = document.forms["touristRegistrationForm"]["emergencyContact"].value;
	var bloodgroup = document.forms["touristRegistrationForm"]["bloodgroup"].value;
	var gender = document.forms["touristRegistrationForm"]["gender"].value;
	var formSubmittionStatus = true;

	if (cname == "") {
		formSubmittionStatus = false;
		alert("tourist name must be filled");
	} else if(cname.length<2){
		formSubmittionStatus = false;
		alert("first name length must be more than 2 ");
	}else if(cname.length>30){
		formSubmittionStatus = false;
		alert("maximum allowed length is 30");
	}else if (age = "") {
		formSubmittionStatus = false;
		alert("age must be filled");
	}else if(gender[0].checked === false && gender[1].checked === false) {
		formSubmittionStatus = false;
        alert('Choose your gender');
	}else if (pcontact.length!=10) {
		formSubmittionStatus = false;
		alert("Primary contact details must contain 10 numbers");
	} 

	 else {
		if (formSubmittionStatus) {
			alert("valid form");
		}
	}

	return formSubmittionStatus;

}
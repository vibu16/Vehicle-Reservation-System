function validate()
{

	var userIdPattern = /^[0-9a-zA-Z]+$/;
	if(!userIdPattern.test(registerForm.userId.value))
	{
		alert("User Id should be alphanumeric !");
		registerForm.userId.focus();
		return false;
	}
	
	var namePattern = /^[A-Za-z ]+$/;
	if(!namePattern.test(registerForm.firstName.value)){
		alert("Name should contain only alphabets and cannot be empty !");
		registerForm.firstName.focus();
		return false;
	}
	
	var agePattern = /(^[1-9]?[0-9]{1}$|^120$)/;
	if(!agePattern.test(registerForm.age.value))
	{
		alert("Age should contain only numbers & Age limit should be 1-120");
		registerForm.age.focus();
		return false;
	}
	
	var selectValue=document.forms["registerForm"]["gender"].value;
	if(selectValue==0)
	{
	alert("Please select gender");
	registerForm.gender.focus();
	return false;
	}	
		
	var contact = /^\d{10}$/;
	if(!contact.test(registerForm.number.value))
	{
		alert("Contact number is invalid");
		registerForm.number.focus();
		return false;
	}
	
	var emailPattern = /^\w+@[a-zA-Z_]+?\.[a-zA-Z]{2,3}$/; 
	if(!emailPattern.test(registerForm.emailId.value))
	{
		alert("Email Id format should be abc@gmail.com");
		registerForm.emailId.focus();
		return false;
	}
		
	if(registerForm.password.value != registerForm.cpassword.value)
	{
		alert("Password does not match!");
		registerForm.password.focus();
		return false;
	}
	
	if ((registerForm.password.value.length < 6) || (registerForm.password.value.length > 12)) {
        alert("Password should have atleast 6 to 12 characters.");
        registerForm.password.focus();
        return false;
    }
	
}

function ValidateAddVehicle()
{
	var veh_name = document.forms["addVehicle"]["vehiname"].value;
	                                                if(veh_name == "")
		{
		alert("Vehicle Name cannot be empty");
		document.addVehicle.vehiname.focus();
		return false;
		}
	if((vehi_name.length <2) || (vehi_name.length > 30))
		 {
		 alert("Vehicle Name Length should between 2-65");
		 alert("Vehicle Name cannot be empty");
		 return false;
		 }
	var vehi_number = document.forms["addVehicle"]["vehinum"].value;
	if(vehi_num == "")
		{
		alert("Vehicle Number cannot be empty");
		document.addVehicle.vehinum.focus();
		return false;
		}
	
}



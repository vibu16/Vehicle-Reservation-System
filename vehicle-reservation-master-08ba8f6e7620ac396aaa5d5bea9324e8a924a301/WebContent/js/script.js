// Register Form


function register(form)
{

       var userIdPattern = /^[0-9a-zA-Z]+$/;
       if(!userIdPattern.test(form.userId.value))
       {
              alert("User Id should be alphanumeric !");
              form.userId.focus();
              return false;
       }
       
       var namePattern = /^[A-Za-z ]+$/;
       if(!namePattern.test(form.firstName.value)){
              alert("Name should contain only alphabets and cannot be empty !");
              form.firstName.focus();
              return false;
       }
       
       var agePattern = /(^[1-9]?[0-9]{1}$|^120$)/;
       if(!agePattern.test(form.age.value))
       {
              alert("Age should contain only numbers & Age limit should be 1-120");
              form.age.focus();
              return false;
       }
       
       var selectValue=document.forms["form"]["gender"].value;
       if(selectValue==0)
       {
       alert("Please select gender");
       form.gender.focus();
       return false;
       }      
              
       var contact = /^\d{10}$/;
       if(!contact.test(form.number.value))
       {
              alert("Contact number is invalid");
              form.number.focus();
              return false;
       }
       
       var emailPattern = /^\w+@[a-zA-Z_]+?\.[a-zA-Z]{2,3}$/; 
       if(!emailPattern.test(form.emailId.value))
       {
              alert("Email Id format should be abc@gmail.com");
              form.emailId.focus();
              return false;
       }
              
       if(form.password.value != form.cpassword.value)
       {
              alert("Password does not match!");
              form.password.focus();
              return false;
       }
       
       if ((form.password.value.length < 6) || (form.password.value.length > 12)) {
        alert("Password should have atleast 6 to 12 characters.");
        form.password.focus();
        return false;
    }
       
}

// Login form validation


function loginCheck(form)
{
     var modelPattern = /^[0-9a-zA-Z]+$/;
     if(!modelPattern.test(form.id.value))
     {
           alert( "Id should not contain special charaters and cannot be empty!" );
           form.id.focus();
           return false;
     }
     if(form.password.value.length < 6 || form.password.value.length > 12)
     {
        alert("Password should have atleast 6 to 12 characters.");
        form.password.focus();
        return false;
    }

}


// Edit form validation

function validate(form)
{
     var vehiseat=/^[0-9]+$/;
     var modelPattern = /^[0-9a-zA-Z]+$/;
     var letters=/^[A-Za-z]+$/;
     var reDate = /(?:0[1-9]|[12][0-9]|3[01])\/(?:0[1-9]|1[0-2])\/(?:19|20\d{2})/;
     if(form.vehiname.value=="")
     {
           alert( "Please provide vehicle name!" );
           form.vehiname.focus();
        return false;
     }
     if(!letters.test(form.vehimod.value))
     {
           alert("should not contain special characters and  vehicle model cannot be empty!!!");
           form.vehimod.focus();
           return false;
     }
     if(!modelPattern.test(form.vehinum.value))
     {
           alert("vehicle number cannot be empty");
           form.vehinum.focus();
           return false;
     }
     if(form.vehinum.value=="")
     {
           alert( "Please provide vehicle number!" );
           form.vehiname.focus();
        return false;
     }
     if(!vehiseat.test(form.capacity.value))
     {
           alert( "Please provide valid no of seating capacity!" );
           form.capacity.focus();
        return false;
     }
     if(form.capacity.value=="")
     {
           alert( "capacity cannotbe empty!" );
           form.capacity.focus();
        return false;
     }
     if(form.vehicolor.value=="")
     {
           alert( "Please provide vehicle color!" );
           form.vehicolor.focus();
           return false;
     }
     
     if(!modelPattern.test(form.vehibranch.value))
     {
           alert( "please enter the branch!" );
           form.vehibranch.focus();
           return false;
     }
     if(form.vehibranch.value=="")
     {
           alert( "Please provide vehicle branch!" );
           form.vehibranch.focus();
           return false;
     }
     if(!reDate.test(form.year.value))
     {
           alert( "Please provide the valid insurance date ( correct format dd/mm/yyyy)" );
           form.year.focus();
           return false;
     }
     if(!reDate.test(form.vehirenewal.value))
     {
           alert( "Please provide valid vehirenewal date ( correct format dd/mm/yyyy)" );
           form.vehirenewal.focus();
           return false;
     }
     if(!reDate.test(form.lastdate.value))
     {
           alert( "Please provide valid Last Service date ( correct format dd/mm/yyyy)" );
           form.lastdate.focus();
           return false;
     }
     if(!reDate.test(form.nextservice.value))
     {
           alert( "Please provide valid Next Service date ( correct format dd/mm/yyyy)" );
           form.nextservice.focus();
           return false;
     }
     if(!reDate.test(form.nextavailable.value))
     {
           alert( "Please provide Next Available Date ( correct format dd/mm/yyyy)!" );
           form.year.focus();
           return false;
     }
     
}



// Add vehicle form validation


function checkForm(form)
{
     var vehiseat=/^[0-9]+$/;
     var modelPattern = /^[0-9a-zA-Z]+$/;
     var letters=/^[A-Za-z]+$/;
     if(form.vehiname.value=="")
     {
           alert( "Please provide vehicle name!" );
           form.vehiname.focus();
        return false;
     }
     if(!modelPattern.test(form.vehimod.value))
     {
           alert("should not contain special characters and  vehicle Type cannot be empty!!!");
           form.vehimod.focus();
           return false;
     }
     if(!modelPattern.test(form.vehinum.value))
     {
           alert("vehicle number cannot be empty");
           form.vehinum.focus();
           return false;
     }
     if(form.vehinum.value=="")
     {
           alert( "Please provide vehicle number!" );
           form.vehiname.focus();
        return false;
     }
     if(form.vehicolor.value=="")
     {
           alert( "Please provide vehicle color!" );
           form.vehicolor.focus();
           return false;
     }
     if(!vehiseat.test(form.vehiseat.value))
     {
           alert( "Please provide valid no of seating capacity!" );
           form.vehiseat.focus();
        return false;
     }
     if(form.vehiseat.value=="")
     {
           alert( "capacity cannotbe empty!" );
           form.vehiseat.focus();
        return false;
     }
     
     if(!modelPattern.test(form.vehibranch.value))
     {
           alert( "please enter the branch!" );
           form.vehibranch.focus();
           return false;
     }
     if(form.vehibranch.value=="")
     {
           alert( "Please provide vehicle branch!" );
           form.vehibranch.focus();
           return false;
     }
     if(form.year.value=="")
     {
           alert( "Please provide the  insurance date" );
           form.year.focus();
           return false;
     }
     if(form.vehirenewal.value=="")
     {
           alert( "Please provide vehirenewal date" );
           form.vehirenewal.focus();
           return false;
     }
     if(form.lastdate.value=="")
     {
           alert( "Please provide Last Service date" );
           form.lastdate.focus();
           return false;
     }
     if(form.nextservice.value=="")
     {
           alert( "Please provide Next Service date" );
           form.nextservice.focus();
           return false;
     }
     
}



// Credit card validation



function cardCheck(bookingform)
{
     var cardNo = /^\d{16}$/;
     if(!cardNo.test(bookingform.num.value))
     {
           alert("Provide valid 16 digit card number");
           bookingform.num.focus();
           return false;
     }
     var regMonth = /^02|03|04|05|06|07|08|09|10|11|12$/;
    var regYear = /^2020|2021|2022|2023|2024|2025|2026|2027|2028|2029|2030|2031$/;
     
     if(bookingform.date.value=="" )
     {
           alert( " Expiry Month and Year cannot be empty!!!!" );
           return false;
     }
     
     if(!regMonth.test(bookingform.month.value))
     {
           alert("Provide valid Month");
           bookingform.month.focus();
           return false;
     }
     
     if(!regYear.test(bookingform.year.value))
     {
           alert("Provide valid year");
           bookingform.year.focus();
           return false;
     }
     var cvCode = /^\d{3}$/;
     if(!cvCode.test(bookingform.code.value))
           {
                alert("Provide valid cv Code");
                bookingform.code.focus();
                return false;
           }
}





//  Booking Vehicle


function bookVehicle(bookingform){
	if(bookingform.from.value=="" )
    {
          alert( " Please select your from date" );
          return false;
    }
	
	if(bookingform.to.value=="" )
    {
          alert( " Please select your to date" );
          return false;
    }
}


function GetDays() {
    var dropdt = new Date(document.getElementById("drop_date").value);
    var pickdt = new Date(document.getElementById("pick_date").value);
    return parseInt((dropdt - pickdt) / (24 * 3600 * 1000));
}

function cal() {
    if (document.getElementById("drop_date")) {
           document.getElementById("numdays2").value = GetDays();
    }
}

function add() {
     var val1 = document.getElementById('numdays2').value;
     var val2 = document.getElementById('price').value;
     var result = parseInt(val1) * parseInt(val2);
     if(!isNaN(result)){
           document.getElementById('amount').value = result;
     }
}

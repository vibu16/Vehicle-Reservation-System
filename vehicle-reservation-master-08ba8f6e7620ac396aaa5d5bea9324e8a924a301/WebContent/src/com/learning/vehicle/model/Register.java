package com.cognizant.vehicle.model;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;

public class Register {
<<<<<<< HEAD
	private String id;
	private String firstName;
	private String lastName;
	private int age;
	private String gender;
	private int contactNumber;
	private String email;
	private String userType;
	private String password;
	private String securityQuestion;
	private String branch;
	private String status;
	public Register() {
	       super();
	       // TODO Auto-generated constructor stub
	}
	public Register(String id, String firstName, String lastName, int age, String gender, int contactNumber, String email,
	              String userType, String password, String securityQuestion, String branch, String status) {
	       super();
	       this.id = id;
	       this.firstName = firstName;
	       this.lastName = lastName;
	       this.age = age;
	       this.gender = gender;
	       this.contactNumber = contactNumber;
	       this.email = email;
	       this.userType = userType;
	       this.password = password;
	       this.securityQuestion = securityQuestion;
	       this.branch = branch;
	       this.status = status;
	}
	public String getId() {
	       return id;
	}
	public void setId(String id) {
	       this.id = id;
	}
	public String getFirstName() {
	       return firstName;
	}
	public void setFirstName(String firstName) {
	       this.firstName = firstName;
	}
	public String getLastName() {
	       return lastName;
	}
	public void setLastName(String lastName) {
	       this.lastName = lastName;
	}
	public int getAge() {
	       return age;
	}
	public void setAge(int age) {
	       this.age = age;
	}
	public String getGender() {
	       return gender;
	}
	public void setGender(String gender) {
	       this.gender = gender;
	}
	public int getContactNumber() {
	       return contactNumber;
	}
	public void setContactNumber(int contactNumber) {
	       this.contactNumber = contactNumber;
	}
	public String getEmail() {
	       return email;
	}
	public void setEmail(String email) {
	       this.email = email;
	}
	public String getUserType() {
	       return userType;
	}
	public void setUserType(String userType) {
	       this.userType = userType;
	}
	public String getPassword() {
	       return password;
	}
	public void setPassword(String password) {
	       this.password = password;
	}
	public String getSecurityQuestion() {
	       return securityQuestion;
	}
	public void setSecurityQuestion(String securityQuestion) {
	       this.securityQuestion = securityQuestion;
	}
	public String getBranch() {
	       return branch;
	}
	public void setBranch(String branch) {
	       this.branch = branch;
	}
	public String getStatus() {
	       return status;
	}
	public void setStatus(String status) {
	       this.status = status;
	}
	public Register(String status2) {
	       super();
	   
	    this.status = status2;
	}
	public Register(String id, String status) {
	       super();
	       this.id = id;
	    this.status = status;
	}
	}

=======
<<<<<<< HEAD

=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> f1ccdc709f6b4ecab41ab736a3084a8ed6945a9c
>>>>>>> bb1936e2e7a87ca1c84fbf196c98685e420094e6
private String id;
private String firstName;
private String lastName;
private int age;
private String gender;
<<<<<<< HEAD
private long contactNumber;
=======
<<<<<<< HEAD
private long contactNumber;
=======
private int contactNumber;
>>>>>>> f1ccdc709f6b4ecab41ab736a3084a8ed6945a9c
>>>>>>> 5d26f199f709f7d2627db4bbe2ac7b9ec34af443
private String email;
private String userType;
private String password;
private String securityQuestion;
private String branch;
private String status;
<<<<<<< HEAD
private String answer;

public Register() {
                super();
                // TODO Auto-generated constructor stub
}

public Register(String status) {
                super();
                this.status = status;
}

public Register(String id, String firstName, String lastName, int age, String gender, long contactNumber, String email,
                                String userType, String password, String securityQuestion, String branch, String answer) {
                super();
                this.id = id;
                this.firstName = firstName;
                this.lastName = lastName;
                this.age = age;
                this.gender = gender;
                this.contactNumber = contactNumber;
                this.email = email;
                this.userType = userType;
                this.password = password;
                this.securityQuestion = securityQuestion;
                this.branch = branch;
                this.answer = answer;
}

=======
<<<<<<< HEAD
private String answer;

public Register() {
	super();
	// TODO Auto-generated constructor stub
}

public Register(String status) {
	super();
	this.status = status;
}

public Register(String id, String firstName, String lastName, int age, String gender, long contactNumber, String email,
		String userType, String password, String securityQuestion, String branch, String answer) {
	super();
	this.id = id;
	this.firstName = firstName;
	this.lastName = lastName;
	this.age = age;
	this.gender = gender;
	this.contactNumber = contactNumber;
	this.email = email;
	this.userType = userType;
	this.password = password;
	this.securityQuestion = securityQuestion;
	this.branch = branch;
	this.answer = answer;
}

>>>>>>> 5d26f199f709f7d2627db4bbe2ac7b9ec34af443
public String getId() {
                return id;
}

public void setId(String id) {
                this.id = id;
}

public String getFirstName() {
                return firstName;
}

public void setFirstName(String firstName) {
                this.firstName = firstName;
}

public String getLastName() {
                return lastName;
}

public void setLastName(String lastName) {
                this.lastName = lastName;
}

public int getAge() {
                return age;
}

public void setAge(int age) {
                this.age = age;
}

public String getGender() {
                return gender;
}

public void setGender(String gender) {
                this.gender = gender;
}

public long getContactNumber() {
<<<<<<< HEAD
                return contactNumber;
}

public void setContactNumber(long contactNumber) {
                this.contactNumber = contactNumber;
=======
	return contactNumber;
}

public void setContactNumber(long contactNumber) {
	this.contactNumber = contactNumber;
>>>>>>> 5d26f199f709f7d2627db4bbe2ac7b9ec34af443
}

public String getEmail() {
                return email;
}

public void setEmail(String email) {
                this.email = email;
}

public String getUserType() {
                return userType;
}

public void setUserType(String userType) {
                this.userType = userType;
}

public String getPassword() {
                return password;
}

public void setPassword(String password) {
                this.password = password;
}

public String getSecurityQuestion() {
                return securityQuestion;
}

public void setSecurityQuestion(String securityQuestion) {
                this.securityQuestion = securityQuestion;
}

public String getBranch() {
                return branch;
}

public void setBranch(String branch) {
<<<<<<< HEAD
                this.branch = branch;
}

public String getStatus() {
                return status;
=======
	this.branch = branch;
}

public String getStatus() {
	return status;
}

public void setStatus(String status) {
	this.status = status;
}

public String getAnswer() {
	return answer;
}

public void setAnswer(String answer) {
	this.answer = answer;
}

@Override
public String toString() {
	SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");
	NumberFormat box = NumberFormat.getInstance();
	box.setGroupingUsed(true);
	return String.format(id,firstName,lastName,box.format(age),gender,box.format(contactNumber),email,userType
			,password,securityQuestion,branch,status,answer);
}



=======
public Register() {
       super();
       // TODO Auto-generated constructor stub
}
public Register(String id, String firstName, String lastName, int age, String gender, int contactNumber, String email,
              String userType, String password, String securityQuestion, String branch, String status) {
       super();
       this.id = id;
       this.firstName = firstName;
       this.lastName = lastName;
       this.age = age;
       this.gender = gender;
       this.contactNumber = contactNumber;
       this.email = email;
       this.userType = userType;
       this.password = password;
       this.securityQuestion = securityQuestion;
       this.branch = branch;
       this.status = status;
}
public String getId() {
       return id;
}
public void setId(String id) {
       this.id = id;
}
public String getFirstName() {
       return firstName;
}
public void setFirstName(String firstName) {
       this.firstName = firstName;
}
public String getLastName() {
       return lastName;
}
public void setLastName(String lastName) {
       this.lastName = lastName;
}
public int getAge() {
       return age;
}
public void setAge(int age) {
       this.age = age;
}
public String getGender() {
       return gender;
}
public void setGender(String gender) {
       this.gender = gender;
}
public int getContactNumber() {
       return contactNumber;
}
public void setContactNumber(int contactNumber) {
       this.contactNumber = contactNumber;
}
public String getEmail() {
       return email;
}
public void setEmail(String email) {
       this.email = email;
}
public String getUserType() {
       return userType;
}
public void setUserType(String userType) {
       this.userType = userType;
}
public String getPassword() {
       return password;
}
public void setPassword(String password) {
       this.password = password;
}
public String getSecurityQuestion() {
       return securityQuestion;
}
public void setSecurityQuestion(String securityQuestion) {
       this.securityQuestion = securityQuestion;
}
public String getBranch() {
       return branch;
}
public void setBranch(String branch) {
       this.branch = branch;
}
public String getStatus() {
       return status;
>>>>>>> 5d26f199f709f7d2627db4bbe2ac7b9ec34af443
}

public void setStatus(String status) {
<<<<<<< HEAD
                this.status = status;
}

public String getAnswer() {
                return answer;
}

public void setAnswer(String answer) {
                this.answer = answer;
}

@Override
public String toString() {
                SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");
                NumberFormat box = NumberFormat.getInstance();
                box.setGroupingUsed(true);
                return String.format(id,firstName,lastName,box.format(age),gender,box.format(contactNumber),email,userType
                                                ,password,securityQuestion,branch,status,answer);
}



=======
       this.status = status;
}
<<<<<<< HEAD
=======
public Register(String status2) {
       super();
   
    this.status = status2;
>>>>>>> 5d26f199f709f7d2627db4bbe2ac7b9ec34af443
}
public Register(String id, String status) {
       super();
       this.id = id;
    this.status = status;
=======
	private String vendorId;
	private String firstName;
	private String lastName;
	private int age;
	private String gender;
	private int contactNumber;
	private String email;
	private String password;
	private String securityQuestion;
	private String answer;
	private String branch;
	private String status;
	public Register() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Register(String vendorId, String firstName, String lastName, int age, String gender, int contactNumber,
			String email, String password, String securityQuestion, String answer, String branch, String status) {
		super();
		this.vendorId = vendorId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.gender = gender;
		this.contactNumber = contactNumber;
		this.email = email;
		this.password = password;
		this.securityQuestion = securityQuestion;
		this.answer = answer;
		this.branch = branch;
		this.status = status;
	}
	public String getVendorId() {
		return vendorId;
	}
	public void setVendorId(String vendorId) {
		this.vendorId = vendorId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(int contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getSecurityQuestion() {
		return securityQuestion;
	}
	public void setSecurityQuestion(String securityQuestion) {
		this.securityQuestion = securityQuestion;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
>>>>>>> 3e62fd4945994d03a13a2bb4d6e9c5e40a7c952c
}
>>>>>>> f1ccdc709f6b4ecab41ab736a3084a8ed6945a9c
}
>>>>>>> bb1936e2e7a87ca1c84fbf196c98685e420094e6

}
>>>>>>> 50a4cc2512b2c01fa927af4590fcd17127a6cf58

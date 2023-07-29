package emailapp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private int mailBoxCapacity=500;
	private String alternateEmail;
	private int defaultPasswordLength=10;
	private String email;
	private String companySuffix="XYZcompany.com";
	
	//constructor to receive the first name and last name
	public Email(String firstName,String lastName) {
		this.firstName=firstName;
		this.lastName=lastName;
//		System.out.println("Email Created   : " + this.firstName + " "+ this.lastName);
		
		//call a method for asking department + return the department
		this.department=setDepartment();
		System.out.println("Department is   : " + this.department);
		
		
		//call a method that returns random password
         this.password=randomPassword(defaultPasswordLength);
         System.out.println("Your password is   : " + this.password);
         
         //combine elements to generate email
         email=firstName.toLowerCase() +"."+lastName.toLowerCase() +"@" +department +"."+ companySuffix;
//         System.out.println("Your email is   : " +email);
         
		
	}
	
	
	//ask for the department
	
	private String setDepartment() {
		System.out.println("New Employee\n"+ "Department Codes\n1 for Sales\n2 for Development\n3 for Accounting\n0 for None\n Enter Department Code");
		Scanner in=new Scanner(System.in);
		int depChoice=in.nextInt();
		if(depChoice==1) {
			return "sales";
		}else if(depChoice==2) {
			return "dev";
		}else if(depChoice==3) {
			return "acct";
		}else {
			return "";
		}
		
	}
	
	//generate random password
	private String randomPassword(int length) {
		String passwordSet="ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*";
		char[] password=new char[length];
		for(int i=0;i<length;i++) {
			int rand= (int) (Math.random()*passwordSet.length());
			password[i]=passwordSet.charAt(rand);
		}
		return new String(password);
	}
	
	//set the mail box capacity
	public void setMailBoxCapacity(int capacity) {
		this.mailBoxCapacity=capacity;
	}
	
	//set alternate email
	public void setAlternateEmail(String altEmail) {
		this.alternateEmail=altEmail;
	}
	
	//change the password
	public void changePassword(String password) {
		this.password=password;
	}
	
	public int getMailBoxCapacity(){
		return mailBoxCapacity;
	}
	
	public String getAlternateEmail() {
		return alternateEmail;
	}
	public String getPassword() {
		return password;
	}
	public String showInfo() {
		return "Display Name : " + firstName +" "+ lastName +"   "+ "\nCompany-Email : " +"   "+ email+ "\nMailBoxCapacity : "+ mailBoxCapacity+"mb";
	}
	
	

}


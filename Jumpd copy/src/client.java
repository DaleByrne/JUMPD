//import java.util.Date;

/*
 * Client Class which takes in a clients details 
 * Dev ops 
 * Dale Byrne
 * 2017
 */



public class client {
	
	private String title;
	private String Fname;
	private String Lname;
	private String Email;
	private String address;
	private String address2;
	private String town;
	private String county;
	//private date dob;
	private char gender;
	
	 
	 //Constructor for Client - kept crashing when adding gender & date 
	public client (String title, String Fname, String Lname, String Email, String address, 
			String address2, String town, String county, char gender)
	{
		this.title = title;
		this.Fname = Fname;
		this.Lname = Lname;
		this.Email = Email;
		this.address = address;
		this.address2 = address2;
		this.town = town;
		this.county = county;
		this.gender = gender;
		
	}
	
	// List of getter a setter methods
	
	public String getTitle()
	{
		return title;
	}
	
	public String getFristName()
	{
		return Fname;
	}
	
	public String getLastName()
	{
		return Lname;
	}
	
	public String getEmail()
	{
		return Email;
	}
	
	public String getAddress()
	{
		return address;
	}
	
	public String getAddress2()
	{
		return address2;
	}
	
	public String getTown()
	{
		return town;
	}
	
	public String getCounty()
	{
		return county;
	}
	
	public char getGender()
	{
		return gender;
	}
	
	
	/*
	 * will add an equals method later
	
	public boolean equals()
	{
		
	}
	*/
	
	// toString method to print out the the information 
	
	public String toString ()
	{
		return " \n " 
				+  "Client "+ "\n" + "\n" + "(" + title + "," + Fname + "," + Lname + "," + Email + "," + address + ","
				+ address2 + "," + town + "," + county + "," + gender + "\n";
	}
	
	
}

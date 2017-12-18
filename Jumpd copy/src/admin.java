
public class admin extends client {
	
	
	private Boolean b;
	
	//Constructor for the admin which is calling from the super client class
	public admin ( String string, String title, String Fname, String Lname, String Email, String address, 
			String address2, String town, char c, boolean b )
	{
		super("Mrs", "jackie", "chan", "jackieChan@yahoo", "walk street",
				"ballybay", "ballybay", "Monaghan", 'F');
		this.b = b;

		
	}
	
	// List of getter a setter methods 
	

	public Boolean isAnAdmin()
	{
		return b;
	}
	
	// toString to set how the information is printed out

	public String toString ()
	{
		return  "****  Is user an admin   ****"
				+ "" +  " \n "  +  " \n " + b +  " \n "  + super.toString() + ")" +  " \n " ;
	}
	


}

package testproject;

public class Holiday {
	
     int day;
	String name;
	String month;
	//Parameterized constructor
	public Holiday(int day, String name, String month) {
		super();
		this.day = day;
		this.name = name;
		this.month = month;
	}
	
       public void insamemonth(){
    	   boolean same= (month==month);
    	   if(same)
    	   {
    		   System.out.println(true);
    	   }else
    	   {
    		   System.out.println(false);
    	   }
    	   

       }
       
		 
	 
 }
 
	
    


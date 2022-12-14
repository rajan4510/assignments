package testproject;

public  class Holiday {
	
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
    	   String m ="january1";
    	   boolean same= (month==m);
    	   if(same)
    	   {
    		
    	 System.out.println(true);
    	   }else
    	   {
    		   System.out.println(false);
    	   }
    	   

       }
       
		 
	 
 }
 
	
    


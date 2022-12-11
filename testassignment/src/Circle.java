package testproject;

public class Circle {
	
	// fields 0r instances variable or non static variables
	   int radius;
	   float pi;
	// static varible
//final static float pi = 3.14f;
	//
	// default constructor
//public Circle() {	
//}
// paramterized constructor

    public Circle(int radius, float pi) {
		super();
		this.radius = radius;
	     this.pi = pi;
	}

  //  behavoir or function
 public void calculatearea()
 {
	 //object
         float area = (radius*radius)*pi; // method
         System.out.println("Area =" +area);
                
 
 }
 // behavoir or function 
  public void calculateCircumference()
  {           //object
	   float circumference = 2*pi*radius;
	  System.out.println("Circumference = " + circumference);
  }
 
 }


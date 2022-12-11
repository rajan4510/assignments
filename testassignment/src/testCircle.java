package testproject;

public class testCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//
	
       Circle circle = new Circle(5, 3.14f);// using non static instances 
      // Circle circle = new Circle(5); using static 
         circle.calculatearea();
         circle.calculateCircumference();
         
         
         Circle circle1 = new Circle(5, 3.14f);
         
         circle1.calculatearea();
         circle1.calculateCircumference();
	}     
}
//
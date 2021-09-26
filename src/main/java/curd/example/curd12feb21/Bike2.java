class Vehicle{  
 final int speed;
 
 {
	 speed=90;
 }
  //defining a method  
  void run(){System.out.println("Vehicle is running");} 
public static void staticTest()
{
	System.out.println("Hello static methods");
}

  
}  
//Creating a child class  
class Bike2 extends Vehicle{  
  //defining the same method as in the parent class  
  void run(){System.out.println("Bike is running safely with "+speed+" Km/h.");}  
  
  public static void main(String args[]){  
  Bike2 obj = new Bike2();//creating object  
  obj.run();//calling method  
  Vehicle.staticTest();
  }  
}  
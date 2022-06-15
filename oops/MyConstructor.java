package oops;

class vehicle {
int wheels , headlights;
String colour;
//vehicle(){                                           no arg Contructor
//	wheels = 4;
//}
     vehicle(){
	 
     }
     
   vehicle(int wheels){
	this.wheels = wheels;
	   headlights = 2 ;
   }
   
   vehicle(int wheels,String colour){
	   this.wheels = wheels;
	   headlights = 2 ;
	   this.colour = colour;
   }
}
public class MyConstructor {
   MyConstructor(){
	   System.out.println("Object is now created");
   }
	public static void main(String[] args) {
		
      MyConstructor obj= new MyConstructor();
      
      vehicle car = new vehicle (4,"red");
      vehicle scooty = new vehicle (2);
      vehicle random = new vehicle();
      System.out.println(car.headlights+" headlights , "+car.wheels + " wheels & colour " + car.colour);
      System.out.println(scooty.headlights +" headlights & " + scooty.wheels + " wheels");
	}
	
	

}

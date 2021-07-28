package This_super;

class Animals{  
  String color="white"; 
  void eat(){
	  System.out.println("eating grass...");
  }
 }  

  class Dogs extends Animals{  
 String color="black";  
  void printColor(){  
  System.out.println(color);//prints color of Dog class  
  System.out.println(super.color);//prints color of Animal class
  
 }
  void eat(){
 System.out.println("eating bone...");
  }
  void display() {
eat();
super.eat();  
 }  
 }

 public class Super_method{  
 public static void main(String args[]){  
 Dogs d=new Dogs();  
 d.printColor();  
 d.display();

 }}  



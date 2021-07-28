package Inheritance;

abstract class A 
{ 
private int num;
private void display() 
 { 
 System.out.println("Calling private METHOD outside the class ");
}
public void privatecall(int Num) {
	this.num=Num;
	this.display();
	System.out.println("Calling private MEMBER outside the class "+this.num);
}

}
class  B extends A{} //as class A is abstract so it must be extended by some class to call by main method

public  class AM1 { 
public static void main(String args[])  { 

 B obj = new B(); 
 //trying to access private method of another class 
 obj.privatecall(45); 

 } 

} 


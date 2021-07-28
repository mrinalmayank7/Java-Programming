package Access_modifier;

import Inheritance.AM1 ; // AM1 is usable only after import in line 26 
class A{
	 protected String a;
	  void display(String a)
	{
	System.out.println(a);	
	}
	 
}


class AM2 
{ 
static   void display() 
	 { 
	 System.out.println("Calling static method ");
	}




public static void main(String args[])  { 
display();
A O = new A();
AM1 O1 =new AM1();
O.display("Calling protected member ");

 } }





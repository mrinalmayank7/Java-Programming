package Overloading;


class Chandigarh{
	   public void myMethod()
	   {
		System.out.println("This is an Overridden method");
	   }	   
	}
public	class OVERRIDE_WITHsuper extends Chandigarh{
	   public void myMethod(){
		super.myMethod(); //This will call the myMethod() of parent class
		System.out.println("This is an Overriding method");
	   }
	   public static void main( String args[]) {
		   OVERRIDE_WITHsuper  obj = new OVERRIDE_WITHsuper();
		obj.myMethod();
	   }
	}


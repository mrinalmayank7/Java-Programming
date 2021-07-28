package Overloading;



//Can we override java main method?
//No, because the main is a static method.

//Can we overload java main method?
//yes
public class OVERLOAD_MAINmethod
{ 
	public static void main(int num) {
		System.out.println("int * 5 = " +  ( num*5) );
	}
	public static void main(int num, float var) {
		System.out.println("int * float = " +  ( num*var) );
	}
	public static void main(String[] args) {   
		// execution always starts from this main method
		main(45);
		main(45, 5.0f);
	
	}
}


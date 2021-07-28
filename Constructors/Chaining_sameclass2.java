package Constructors;

public class Chaining_sameclass2 {
	Chaining_sameclass2(){
		System.out.println("Default");
	}
	Chaining_sameclass2(int i){
		this();
		System.out.println(i);
	}
	Chaining_sameclass2(int i , int j){
		this(9);
		System.out.println(i+j);
	}
	public static void main(String args[]) {
		System.out.println("O U T P U T 1");
		Chaining_sameclass2 O = new Chaining_sameclass2(65,88);
		System.out.println("O U T P U T 2");
		Chaining_sameclass2 O2 =new Chaining_sameclass2(); 
		System.out.println("O U T P U T 3");
		Chaining_sameclass2 O3 =new Chaining_sameclass2(6);      
	}
	


}

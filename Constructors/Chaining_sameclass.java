package Constructors;

public class Chaining_sameclass {
	Chaining_sameclass(){
		this(7);
		System.out.println("Default");
	}
	Chaining_sameclass(int i){
		this(8,45);
		System.out.println(i);
	}
	Chaining_sameclass(int i , int j){
		System.out.println(i+j);
	}
	public static void main(String args[]) {
		System.out.println("O U T P U T 1 ");
		Chaining_sameclass O = new Chaining_sameclass(65,88);
		System.out.println("O U T P U T 2 ");
		Chaining_sameclass O2 =new Chaining_sameclass();
		System.out.println("O U T P U T 3 ");
		Chaining_sameclass O3 =new Chaining_sameclass();
		
	}
	


}

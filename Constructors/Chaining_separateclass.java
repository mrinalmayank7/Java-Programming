package Constructors;
class Super_class{
	String name ;
    Super_class(String name){
		this.name = name;   //we can also remove "this " or remove the whole line 
		System.out.println(name +" Superclass");
		
	}
}
public class Chaining_separateclass extends Super_class  {
	Chaining_separateclass(String name){
		super(name);
	System.out.println(name + " Derieved class");
	
	}
    public static void main (String args[]) {
    	Chaining_separateclass O = new Chaining_separateclass("Mrinal");
    }
}


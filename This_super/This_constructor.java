package This_super;



class product{
	// data member
	int pid;
	String Name;
	// default constructor
	public product (   ){
		System.out.println("This is default const.....");
		pid = 0;
		Name = null;
	}
	
	//parameterized Constructor
	public product(int pid, String Name ){
		this(  );    ///  this will make a call to the default constructor, as no parameters
			System.out.println("This is parameterized const....");
			this.pid = pid;
			this.Name = Name;
	}
	// constructor that accept object as a parameter
	public product( product temp ){
		this(temp.pid, temp.Name);   /// this will make a call to parameterized const....
		System.out.println(" This is const..   that accepts object as parameter");
		this.pid = temp.pid;
		this.Name = temp.Name;
	}
	
}  // end of class product

public class This_constructor {
	public static void main(String[] args) {   
	
		// create object of product class
product obj1;  // reference variable that can refer to objects of product class or its sub class
obj1 = new product( );

System.out.println("Product id:: " + obj1.pid);
System.out.println("Product Name:: " + obj1.Name);
System.out.println("==============================");

product obj2 = new product(101, "Laptop");
System.out.println("Product id:: " + obj2.pid);
System.out.println("Product Name:: " + obj2.Name);
System.out.println("==============================");

product obj3 = new product(obj2);
System.out.println("Product id:: " + obj3.pid);
System.out.println("Product Name:: " + obj3.Name);

		
	}
}


package This_super;

class Super_class {
	  int num = 20;

	  public void display() {
	     System.out.println("This is the display method of superclass");
	  }
	}

	public class Super_inherit extends Super_class {
	  int num = 10;
	  public void display() {

	     System.out.println("This is the display method of subclass");
	  }



	  public void my_method() {
		  Super_inherit sub = new Super_inherit();
	     sub.display();
	     super.display();

	     System.out.println("value of the variable named num in sub class:"+ sub.num);
	     System.out.println("value of the variable named num in super class:"+ super.num);

	  }

	  public static void main(String args[]) {
		  Super_inherit obj = new Super_inherit();

	     obj.my_method();

	  }

	}

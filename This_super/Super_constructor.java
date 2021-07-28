package This_super;


class Superclass {
	  int age;

	  Superclass(int age) {
	     this.age = age;           

	   }
	 public void getAge() {
	     System.out.println("The value of the variable named age in super class is: " +age);
	  }}

	public class Super_constructor  extends Superclass {
		Super_constructor (int age) {
	     super(age);

	  }

	  public static void main(String args[]) {
		  Super_constructor  s = new Super_constructor (24);
	     s.getAge();
}
}


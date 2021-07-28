package Class_objects;

class Calculator{
static int powerInt(int num1,int num2){
		// return num1 to the power of num2 
		System.out.println("power Int Mtd::");
		int result = (int)Math.pow(num1, num2);
		return result;
	}
static double powerDouble(double num1,int num2){
	// return num1 to the power of num2
	System.out.println("power Double Mtd::");
	double result = Math.pow(num1, num2);
	return result;
}
}
public class Test_CALCULATOR{
	public static void main(String[] args) {
		System.out.println(Calculator.powerInt(2,5));
		System.out.println(Calculator.powerDouble(2.5,5));
	}
}


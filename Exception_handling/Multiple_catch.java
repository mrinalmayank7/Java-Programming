package Exception_handling;
import java.util.*;
class Math{
int count = 0 , sum = 0,X,i;
void operation() throws ArithmeticException{

	for(i = 0; i < X; i++){
		
		Scanner o = new Scanner(System.in);
		System.out.println("Enter size of an array:");
		X = o.nextInt();
		int a[]  = new int[X];
		System.out.println("Write the elements of an array:");
		        for(i =0; i < X; i++){
		            a[i] = o.nextInt();
		        }
       
        	count++;
        	sum= sum +a[i];
    
    }
    System.out.println("Sum  is :"+sum);
    System.out.println("Average  is :"+sum/count);

}

}
public class Multiple_catch {
public static void main(String[] args) throws Exception {
	Math o = new Math();
	o.operation();
		
	}

}
package Exception_handling;


public class RUNTIME_EXCEPTION{  
public static void main(String args[]){  
   try{
      int data=100/0;}
   catch(ArithmeticException e){
	   System.out.println("It is an Arithmentc exception : " + e);
	   } 
   
   try{
	  String s=null;  
	  System.out.println(s.length());}
   catch(NullPointerException a){
	   System.out.println("It is Null pointer  exception : " + a);
	   } 
   
   try{
	 String s="abc";  
	 int  i=Integer.parseInt(s); }
   catch(NumberFormatException b){
	   System.out.println("It is a Number format exception : " + b);
	   } 
     
   try{
	   int a[]=new int[5];  
	   a[10]=50; }
	   catch(ArrayIndexOutOfBoundsException   c){
		   System.out.println("It is a Array Index Out Of Bounds Exception   : " + c);
		   } 
   try{
	   String str = "My name is khan.";
	      System.out.println("Length of the String is: " + str.length());
	      System.out.println("Length of the substring is: " + str.substring(30));
	   }
	   catch(StringIndexOutOfBoundsException   d){
		   System.out.println("It is a String Index Out Of Bounds Exception   : " + d);
		   } 
  }}  

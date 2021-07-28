package This_super;

class Student{  
	 int rollno;  
	 String name;  
	 float fee;  

	 Student(int rollno,String name,float fee){  
	 this.rollno=rollno;  
	 this.name=name;  
	 this.fee=fee;  
	   }  

	void display(){
	System.out.println(rollno+" "+name+" "+fee);
	}}  

	public  class This_keyword{ 
		 int a,b;
		 This_keyword()
		 {
		 this(10,20);
		 System.out.println("Inside default");
		 }
		
		 This_keyword(int a, int b)
		 {
		 this.a=a;
		 this.b=b;
		 System.out.println("inside paramatrized"+a+","+b);
		 }
		 
		
	 public static void main(String args[]){ 
	This_keyword O =  new This_keyword();
	 Student s1=new Student(111,"ankit",5000f);  
	 Student s2=new Student(112,"sumit",6000f);  
	 s1.display();  
	 s2.display();  

	}}  

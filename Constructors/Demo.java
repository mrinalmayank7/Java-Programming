package Constructors;

class Demo{
    int v1;
    int v2;
     Demo(){
       v1 = 10;
       v2 = 20;  //DEFAULT CONSTRUCTOR
   }
     
     Demo(int a){
           v1 = a;   //PARAMATRIZED CONSTRUCTOR
   	   }

   	   Demo(int a,int b){
   	   v1 = a;
   	   v2 = b;
   	  
   	  }
   	   
   public void display(){
      System.out.println("first "+v1);  //CONSTRUCTOR OVERLOADING  WITH DIFFERENT PAPRAMETER 
      System.out.println("second "+v2);
  }
   
 public static void main(String args[]){
     Demo d1 = new Demo();
     Demo d2 = new Demo(30);
    Demo d3 = new Demo(30,40);
     System.out.println("Default constructor");
     d1.display();
     System.out.println("Paramatrized*1 constructor");
     d2.display();
     System.out.println("Paramatrized*2 constructor");
    d3.display();

}

}




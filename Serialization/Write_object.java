package Serialization;
import java.io.*;
import Serialization.Student;
public  class Write_object{  
public static void main(String args[]){  
try{  

Student s1 =new Student(1549,"Ukshit");  
 FileOutputStream fout=new FileOutputStream("class1.txt");  
ObjectOutputStream out=new ObjectOutputStream(fout);  
out.writeObject(s1);  
out.close();  
System.out.println("success");  
}catch(Exception e){

System.out.println(e);
}   }  }
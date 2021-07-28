package Serialization;

import java.io.*;  


class Read_object {  
public static void main(String args[]){  
try{  

FileInputStream fin =new FileInputStream("class1.txt");  
ObjectInputStream ois =new ObjectInputStream(fin);  
Student s=(Student)ois.readObject();  
System.out.println(s.id+" "+s.name);  
ois.close();  

System.out.println("success");  
}catch(Exception e){
System.out.println(e);
}   }  }
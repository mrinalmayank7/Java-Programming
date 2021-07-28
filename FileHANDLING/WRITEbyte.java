package FileHANDLING;

import java.io.FileOutputStream;

public class WRITEbyte {  
public static void main(String args[]){    
try{    
FileOutputStream o=new FileOutputStream("C:File1.txt");   

o.write(65);

String s="(This is the file writing in bytes.)";    
byte b[]=s.getBytes();  
o.write(b);    
o.close();    
System.out.println("SUCCESS");    
} 
catch(Exception e) {
	System.out.println(e);
}
} } 

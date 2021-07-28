package FileHANDLING;
import java.io.FileInputStream;

public class READbyte {  
public static void main(String args[]){    
try{    
 FileInputStream o= new FileInputStream("C:File1.txt");    
int i=o.read();  
System.out.print((char)i);


i=0;    
while((i=o.read())!=-1){    
System.out.print((char)i);    
  }   

o.close();    
}catch(Exception e) {
System.out.println(e);

}    } }




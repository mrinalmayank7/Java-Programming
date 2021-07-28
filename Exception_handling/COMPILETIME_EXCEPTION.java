
package Exception_handling;
import java.io.*;
public class COMPILETIME_EXCEPTION {
   public static void main(String args[]) {  
try {
      File file = new File("name.txt");
      FileReader fr = new FileReader(file);    
   }
catch(IOException   O){
	   System.out.println("It is a IO Exception   : " + O);
	   } 
}}


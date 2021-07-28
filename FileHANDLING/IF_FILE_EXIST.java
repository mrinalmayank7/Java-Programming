package FileHANDLING;
import java.io.*;

public class IF_FILE_EXIST {
public static void main(String[] args) {
try {
	File obj= new File("C:File2.txt");
	if(obj.createNewFile()) {
System.out.println("file created: "+obj.getName());
System.out.println("Absolute Path: "+obj.getAbsolutePath());
System.out.println("Write: "+obj.canWrite());
System.out.println("Read: "+obj.canRead());
	}
	else
		System.out.println("file already exists.");
	}
catch(IOException e)
{
	System.out.println("an error occured.");
	e.printStackTrace();
}

}
}
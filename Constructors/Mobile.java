package Constructors;


public class Mobile {
public String properties;
Mobile(String a)
{
properties=a;
	}
public String getProperties()
{
return "The name of the model is : "+properties;
}
	 public static void main(String args[]){
Mobile o ; 
o=new Mobile("Redmi K20 PRO"); 
System.out.println(o.getProperties());
o=new Mobile("Redmi note 7s"); 
System.out.println(o.getProperties());

 }}


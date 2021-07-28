package Overloading;

class Kulche{
private String a ="Chole" ;
public void start(){
System.out.println(a + " Kulche");
}

public void start(String method){
this.a = method;
System.out.println(a + " Kulche");
}

}

public class METHOD_OVERLOAD{
public static void main(String[] arg){
 Kulche o = new Kulche();
o.start();
o.start("Paneer");

}

}

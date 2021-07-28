package InterfaceINjava;


interface Animal {
void eat();
void sleep();	
}
public class Bird implements Animal{
public void eat(){
System.out.println("Hey , i'm monkey loves to eat banana");
}
public void sleep(){
System.out.println("Hey , i'm monkey loves to sleep on trees");	
}
public void fly() {
System.out.println("Hey , i'm bird and love to fly in the sky ");	
}
public static void main(String[] arg) {
	Bird o = new Bird();
	o.eat();
	o.sleep();
	o.fly();
}
}


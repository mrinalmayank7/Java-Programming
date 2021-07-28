package InterfaceINjava;


interface Vehicle { 
	void changeGear(int a); 
	void speedUp(int a); 
	void applyBrakes(int a); 
	} 

	class Bicycle implements Vehicle{ 

	int speed = 3; 
	int gear; 

	public void changeGear(int newGear){ 
	gear = newGear; 
	} 

	public void speedUp(int increment){ 
	speed = speed + increment; 
	} 

	public void applyBrakes(int decrement){ 
	speed = speed - decrement; 
	} 
	
	public void printStates() { 
	System.out.println("Bicycle present state :\n"+ "speed: " + speed + " gear: " + gear); 
}} 
class Bike implements Vehicle { 
	int speed; 
	int gear; 

	public void changeGear(int newGear){ 
    gear = newGear; 
	} 

	public void speedUp(int increment){ 
	speed = speed + increment; 
	} 
	public void applyBrakes(int decrement){ 
	speed = speed - decrement; 
	} 
	public void printStates() { 
	System.out.println("Bike present state :\n"+"speed: " + speed + " gear: " + gear); 
}} 

public class StudyMaterial { 
	public static void main (String[] args) { 
	Bicycle bicycle = new Bicycle(); 
	bicycle.changeGear(2); 
	bicycle.speedUp(3); 
	bicycle.applyBrakes(1);
	bicycle.printStates(); 

	Bike bike = new Bike(); 
	bike.changeGear(1); 
	bike.speedUp(4); 
	bike.applyBrakes(1); 
	bike.printStates(); 

	} 

	} 




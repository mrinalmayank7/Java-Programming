package InterfaceINjava;


interface Pizza{
void VegPizza();
void NonVegPizza();
}
interface Sides extends Pizza{
void Snacks();
}
interface Offers extends Sides{
void Select();
}
public class Dominos implements Offers{
	public void VegPizza() {
		System.out.println("Veg Pizza : Farmhouse , Paneer Makhni , Peppy Paneer , Veg Loaded ");
	}
	public void NonVegPizza()
	{
		System.out.println("Non Veg Pizza : Non Veg Loaded , Chicken Dominator , Pepper Barbecue");
	}
	public void Snacks()
	{
		System.out.println("Snacks : Chicken wings , Burger , White Sauce Pasta , Shots  ");
	}
	public void Select()
	{
	System.out.println(" Everyday Value offers : 2 regular@199 each ");	
	}

	public static void main(String[] args) {
		Dominos o = new Dominos();
		o.VegPizza();
		o.NonVegPizza();
		o.Snacks();
		o.Select();
		

	}

}


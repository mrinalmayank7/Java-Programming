package InterfaceINjava;


interface Veg{
	void PaneerTikka();
}
interface NonVeg {
	void ChickenTikka();
	void Biryani();
	void PaneerTikka();
}
public class BBQnation implements NonVeg , Veg {

	public void ChickenTikka() {
		System.out.println("Eating Chicken Tikka");
	}
	public void Biryani() {
		System.out.println("Eating Biryani");
	}
	public void PaneerTikka() {
		System.out.println("Eating Paneer  Tikka");
	}
	public void Dessert() {
		System.out.println("Eating Choco Lava Cake");
	}
	public static void main(String[] arg) {
		BBQnation o = new BBQnation();
		o.ChickenTikka();
		o.PaneerTikka();
		o.Biryani();
		o.Dessert();
	}
}


//methods are public / abstract /void by default and variables are public/ static / final

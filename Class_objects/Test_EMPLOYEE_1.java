package Class_objects;

class Employee1 {
	private int Eid;
	private String Name;
	
	public int getEid() {
		return Eid;
	}
	public String getName() {
		return Name;
	}
	public void setEid(int eid) {
		Eid = eid;
	}
	public void setName(String name) {
		Name = name;
	}
	public String toString() {
		return "Eid = " + Eid + " and Name = " + Name;
	}
	//Factory Methods  (static and return the object of same class)
//static	Employee1 getInstance(){
			//Employee1 tmp = new Employee1();
		//	return tmp;
	//}
	
} // end of Employee class
public class Test_EMPLOYEE_1{
	public static void main(String[] args) {
Employee1 e1 = new Employee1();
e1.setEid(123);
e1.setName("Joe");
System.out.println(e1);

Employee1 e2 = new Employee1();
e2.setEid(456); e2.setName("John");
System.out.println(e2);
	}
}




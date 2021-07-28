package Class_objects;


class Employee {
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
}
public class Test_EMPLOYEE{
	public static void main(String[] args) {
Employee e1 = new Employee();
e1.setEid(123);
e1.setName("Joe");
System.out.println(e1);
System.out.println(e1.getEid());
System.out.println(e1.getName());
System.out.println(e1.toString());
	}
}


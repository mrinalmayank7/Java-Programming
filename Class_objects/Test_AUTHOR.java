package Class_objects;

class Author {
	private  String name;
	private String email ;
	private char gender;
Author(String name, String email , char gender){
	this.name = name;  this.email = email; this.gender = gender;
}
public String getName() {
	return name;
}
public String getEmail() {
	return email;
}
public char getGender() {
	return gender;
}
public void setName(String name) {
	this.name = name;
}
public void setEmail(String email) {
	this.email = email;
}
public void setGender(char gender) {
	this.gender = gender;
}
} // end of author class

class Book {
 private String name;
 private Author  author;
 private double price;
 private int qtyInStock;
Book(String name, Author  author, double price,int qtyInStock){
this.name = name;
this.author = author; 
this.price = price;
this.qtyInStock = qtyInStock;
}
public String getName() {
	return name;
}
public Author getAuthor() {
	return author;
}
public double getPrice() {
	return price;
}
public int getQtyInStock() {
	return qtyInStock;
}

public void setPrice(double price) {
	this.price = price;
}
public void setQtyInStock(int qtyInStock) {
	this.qtyInStock = qtyInStock;
}
}// end of book class
public class Test_AUTHOR{
	public static void main(String[] args) {
Book book_obj = new Book("Java - The Complete Reference", 
		new Author("Hebert Schildt", "HS@gmail.com", 'M'), 566, 10);
//1. Printing the book name, price and 
//qtyInStock from a Book instance. (Hint: aBook.getName())
System.out.println("Name = " + book_obj.getName());
System.out.println("Price = " + book_obj.getPrice());
System.out.println("Number of books in stock = " + book_obj.getQtyInStock());

//		2. After obtaining the “Author” object, print the Author 
		//(name, email & gender) of the book.
Author tmp = book_obj.getAuthor();
System.out.println("Author Information::");
System.out.println("Name = " + tmp.getName());
System.out.println("Email = " + tmp.getEmail());
System.out.println("Gender = " + tmp.getGender());
	
	}
}



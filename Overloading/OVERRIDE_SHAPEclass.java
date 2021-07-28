package Overloading;

class Shape{
	void draw() {
	System.out.println("Drawing the shape!");}
	void erase(){
	System.out.println("Erasing the shape!");}
}

class Triangle extends Shape{
	void draw() {
	System.out.println("Drawing Triangle!");}
	void erase(){
	System.out.println("Erasing Triangle!");}
}

class Square extends Shape{
	void draw() {
	System.out.println("Drawing Square!");}
	void erase(){
	System.out.println("Erasing Square!");}
}

class Circle extends Shape{
	void draw(){
	System.out.println("Drawing Circle!");}
	void erase(){
	System.out.println("Erasing Circle!");}
}

public class OVERRIDE_SHAPEclass {
	public static void main(String[] args){
	Shape t = new Triangle();
    t.draw();
    t.erase();
    Shape s = new Square();
    s.draw();
    s.erase();
    Shape c = new Circle();
    c.draw();
    c.erase();
	}}


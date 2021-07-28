package Overloading;

class Paneer{

public void start(){

System.out.println("I love paneer tikka");

}

}

class Chicken extends Paneer {

public void start(){

System.out.println("I love chicken tikka ");

}

}

public class METHOD_OVERRIDE{
public static void main(String[] arg){

Paneer o = new Chicken();
Paneer o1 = new Paneer();
o1.start();
o.start();

}

}
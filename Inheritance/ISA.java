package Inheritance;

class Animal2 {

}
class Mammal extends Animal2 {
}

class Reptile extends Animal2 {

}

public class ISA extends Mammal {
 public static void main(String args[]) {
     Animal2 a = new Animal2();
     Mammal m = new Mammal();
     ISA d = new ISA();


     System.out.println(m instanceof Animal2);
     System.out.println(d instanceof Mammal);
     System.out.println(d instanceof Animal2);
     System.out.println(a instanceof Mammal);

  }

}

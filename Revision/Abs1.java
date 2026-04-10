abstract class Parent{
    Parent(){
        System.out.println("abstract class constructor");
    }
    void display(){
        System.out.println("Abstract class concrete method");
    }
    abstract void dummy();
}

class Child extends Parent{
    Child(){
        super();
        System.out.println("child class constructor");
    }
    void display(){
        super.display();
        System.out.println("child class display");
    }

    void dummy(){
         // super.dummy(); is errenous - because parent dummy is empty!
        System.out.println("this is mandatory...");
    }
}

public class Abs1 {
    public static void main(String[] args) {
        Child c = new Child();
        c.display();
        c.dummy();
    }
}

class Parent{
    Parent(){
        System.out.println("Parent class default constructor");
    }

    void display(){
        System.out.println("parenting");
    }

}

class Child extends Parent{
    Child(){
        super();
        System.out.println("Childclass default constructor");
    }
    void display(){
        super.display();
        System.out.println("childing");
    }
}
public class Zuper {
    public static void main(String[] args) {
        Child c = new Child();
        c.display();
    }
}

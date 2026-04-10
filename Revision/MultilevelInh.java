class Grandparent{
    void GP(){
        System.out.println("This is the grandparent");
    }
}
class Parent extends Grandparent{
    void P(){
        System.out.println("This is the parent class. It inherits features from the grandparent.");
    }
}

class Child extends Parent{
    void C(){
        System.out.println("Child class inherits features from parent and grandparent");
    }
}
public class MultilevelInh {
    public static void main(String[] args) {
        Child c = new Child();
        c.GP();
        c.P();
        c.C();
    }
}

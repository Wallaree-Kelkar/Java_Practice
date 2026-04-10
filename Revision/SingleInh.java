class Parent{
    void P(){
        System.out.println("Parent class method");
    }
}

class Child extends Parent {
    void C(){
        System.out.println("Child class extends parent");
    }
}
public class SingleInh {
    public static void main(String[] args){
        Child c = new Child();
        c.P();
        c.C();
    }
}

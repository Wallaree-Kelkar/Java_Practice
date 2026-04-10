final class Arrow {
    void p(){
        System.out.println("Tis class can't be extended. No children");
    }
}

class Dog{
    final int n1 = 20; // value of n1 cannot be changed.
    final void d(){
        System.out.println("this method cannot be overridden.");
    }
}

class Puppy extends Dog{
    void d1(){
        System.out.println("this is simply a child class method, nothing new here.");
    }
}
public class Final1 {
    public static void main(String[] args) {
        Arrow a = new Arrow();
        a.p();
        Dog tommy = new Dog();
        tommy.d();
        Puppy p1 = new Puppy();
        p1.d();
        p1.d1();
    }
}

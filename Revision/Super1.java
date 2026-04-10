class SuperParent{
    SuperParent(int a){
        System.out.println("This is superclass constructor which is parameterized. "+ a);
    }
    void display(){
        System.out.println("this is a parent class method");
    }
}

class SuperKid extends SuperParent{
    SuperKid(){
        super(10);
        System.out.println("kid class constructor called");
    }
}
public class Super1 {
    public static void main(String[] args) {
        SuperKid k = new SuperKid();
        k.display();
    }
}

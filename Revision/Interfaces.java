interface Mom{
    void p1(); //{
        //System.out.println("this is 1st parent");
    //}
    int n1 = 200;
}

interface Dad{
    void p2(); // {
        //System.out.println("this is 2nd parent");
    //}
    int n2 = 300;
}

class Child implements Mom, Dad{
    public void p1(){
        System.out.println("this is 1st parent's method");
    }
    public void p2(){
        System.out.println("this is 2nd parent's method");
    }
    void p3(){
        System.out.println("this is child class method");
        System.out.println(n1);
        System.out.println(n2);
    }
}

public class Interfaces {
    public static void main(String[] args) {
        Child c = new Child();
        c.p1();
        c.p2();
        c.p3();
    }
}

package package_practice;

public class Suitcase {
    private int num1 = 100;
    public int num2 = 200;
    int num3 = 300;
    protected int num4 = 400;
    public static void main(String[] args){
        System.out.println("Hello from the suitcase. The suitcase file is stored inside package called package practice");
        Suitcase o = new Suitcase();
        System.out.println(o.num1);
        System.out.println(o.num2);
        System.out.println(o.num3);
        System.out.println(o.num4);

        Bag b = new Bag();
        // System.out.println(b.num1); //will give compile time error because num1 is private to parent class
        System.out.println(b.num2);
        System.out.println(b.num3);
        System.out.println(b.num4);

        Pouch p = new Pouch();
        //System.out.println(p.num1);
        p.check();

    }
}

class Bag extends Suitcase {
    
}

class Pouch {
    void check(){
        Suitcase s1 = new Suitcase();
        //System.out.println(s1.num1); // will give compile time error
        System.out.println(s1.num2);
        System.out.println(s1.num3);
        System.out.println(s1.num4);
    }
}
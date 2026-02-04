class Grandpa {
    void display(){
        System.out.println("Grandparent class method");
    }
}

class Parent extends Grandpa {
    void display(){
        super.display();
        System.out.println("Immediate parent class method");
    }
    void meme(){
        System.out.println("this is a meme. Laugh.");
    }
}

class Child extends Parent{
    void display(){
        //super.super.display(); 
        super.display();
        System.out.println("Child class method");
    }
    void meme(){
        super.meme();
        System.out.println("This is the child's meme");
    }
}


public class SuperEg {
    public static void main(String[] args){
        Child c = new Child();
        c.display();
        c.meme();
    }
}

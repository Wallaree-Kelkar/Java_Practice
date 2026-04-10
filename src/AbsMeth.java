abstract class Animal {
    abstract void sound();
    void eat(){
        System.out.println("Animal eats food");
    }
}

class Dog extends Animal {
    void sound(){
        System.out.println("Dog barks");
    }
    void drool(){
        System.out.println("Dog drools");
    }
}



public class AbsMeth {
    public static void main(String[] args){
        Animal a = new Dog();
        a.sound();
        a.eat();
        //a.drool(); comp error
        Dog d = new Dog();
        d.drool();
    }
}

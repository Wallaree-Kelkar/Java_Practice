class Alive{
    void exist(){
        System.out.println("An earthly being is born.");
    }
}

class Animal extends Alive{
    void eat(){
        System.out.println("AN animal needs to eat.");
    }
    void drink(){
        {System.out.println("Animals normally drink water...");}
    }
}

class Dog extends Animal{
    void bark(){
        System.out.println("A dog is an animal who barks");
    }
    void treats(){
        System.out.println("Dogs like treats");
    }
}

class Goldie extends Dog{
    void friendly(){
        System.out.println("Golden Retrievers are friendly");
    }
}

class PitBull extends Dog{
    void aggressive(){
        System.out.println("PitBulls are dangerous, beware!!!");
    }
}

public class Inheritance {
    public static void main(String[] args){
        Dog d = new Dog();
        d.exist();
        d.eat();
        d.bark();
        d.treats();
        d.drink();
        //d.friendly();
        Goldie millie = new Goldie();
        millie.friendly();
        PitBull bozo = new PitBull();
        bozo.aggressive();
        bozo.bark();
    }
}


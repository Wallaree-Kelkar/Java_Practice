class Animal {
    void fur(){
        System.out.println("All animals typically have fur.");
    } 
}

class Cat extends Animal {
    @Override
    void fur(){
        System.out.println("Egyptian sphinx cats don't have fur. THey bald.");
    }

}

class Dog extends Animal {
    @Override
    void fur(){
        System.out.println("You may shave your dog's fur to make it look funny...But the dog may not enjoy it.");
    }
}

public class OverridingAnimals {
    public static void main(String args[]){
        Animal a;
        a = new Cat();
        a.fur();
        a = new Dog();
        a.fur();
    }
}

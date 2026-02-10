class Car{
    void broomBroom(){
        System.out.println("Cars have four wheels");
    }
}

class Mercedes extends Car {
    @Override
    void broomBroom(){
        System.out.println("It has an extra wheel.");
    }
}

public class OverridingCars {
    public static void main(String args[]){
        Car c = new Mercedes();
        c.broomBroom();
    }
}

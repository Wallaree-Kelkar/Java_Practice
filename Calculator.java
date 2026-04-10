class Person{
    String name;

    void display(){
        System.out.println("Name: "+name);
    }
}

public class Calculator {
    static int add(int a, int b){
        return a+b;
    }

    public static void main(String[] args){
        System.out.println("Sum: "+Calculator.add(10,20));
        Person p = new Person();
        p.name = "Vansh";
        p.display();
    }
}

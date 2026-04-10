//this is an example of inheriting constructors using super

/*class Parent {
    Parent(){
        System.out.println("This is the parent class constructor");
    }
}

class Child extends Parent {
    Child(){
        super();
        System.out.println("This is the child class constructor");
    }
}*/

//this is an example of final method

class Parent{
    final void display(){
        System.out.println("Final method in parent");
    }
}

class Child extends Parent {
    //void display() {}
}

public class ConstructorSuper {
    public static void main(String[] args){
        child c = new Child();
        c.display();
    }
}

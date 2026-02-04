class Demonstrate {
    String msg;
    Demonstrate(){
        this("Default constructor");
    }
    Demonstrate(String msg){
        this.msg = msg;
        System.out.println(msg);
    }
}

public class Demo {
    public static void main(String[] args){
       // new Demonstrate();
       //new Demonstrate("This is a message!\n");
       //new Demonstrate("this message is being called with the this keyword!");
       Demonstrate d = new Demonstrate("does this work???");
    }
}

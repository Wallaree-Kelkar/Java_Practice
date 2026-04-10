class P{
    void d(){
        System.out.println("something");
    }
}

class C extends P{
    void d(){
        //super.disp();
        System.out.println("something else");
    }
}

public class Superduper {
    public static void main(String args[]){
        C c = new C();
        c.d();
    }
}

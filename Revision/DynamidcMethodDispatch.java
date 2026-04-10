class Dog{
    void Bark(){
        System.out.println("boom boom");
    }
}

class Pup extends Dog{
    void Bark(){
        System.out.println("Yip yap");
    }
}

public class DynamidcMethodDispatch {
    public static void main(String[] args) {
        Dog d = new Pup();
        d.Bark();
    }
}

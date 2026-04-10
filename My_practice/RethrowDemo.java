
class ThrowingSomething {
    void Method(){
    try {
    int n1 = 0;
    int n2 = 4;
    int n3 = n2/n1;
    System.out.println(n3);
    }
    catch (ArithmeticException exep){
        System.out.println("Cannot divide by zero");
        throw exep;
    }
}
}
public class RethrowDemo {
    public static void main(String[] args) {
         try {
            ThrowingSomething t = new ThrowingSomething();
            t.Method();
         }
         catch(ArithmeticException exep) {
            System.out.println("Gotcha.");
         }
    }
}

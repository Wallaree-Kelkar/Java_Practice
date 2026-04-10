public class ThrowDemo {
    public static void main(String[] args){
        try{
            System.out.println("before throwing exception - in the try block now");
            throw new ArithmeticException();
            //System.out.println("Will thhis be printed?"); - this causes compilation error
        }
        catch(ArithmeticException exp) {
            System.out.println("Caught!");
        }
    }
}

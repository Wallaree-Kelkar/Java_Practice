public class TryCatchExample {
    public static void main(String[] args){
        int n1 = 10, n2 = 0;
        /*try {
            int result = n1/n2;
            System.out.println("result: "+result);
        }
        catch (ArithmeticException e){
            System.out.println("Can't divide by zero!!!");
            System.out.println("Exception message: "+e.getMessage());
        }
        System.out.println("Program continues after exception handling");*/
        int result = n1/n2;
        System.out.println(result);
    }
}

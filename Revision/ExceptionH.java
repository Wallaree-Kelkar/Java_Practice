public class ExceptionH {
    public static void main(String[] args) {
        try{
            System.out.println("this gets printed");
            int n = 10, m = 0;
            int r = n/m;
            System.out.println(r);
            System.out.println("this doesn't");
        }
        catch(ArithmeticException e){
            System.out.println("Cannot divide by zero!");
        }
        finally{
            System.out.println("this is bound to get printed");
        }
    }
}

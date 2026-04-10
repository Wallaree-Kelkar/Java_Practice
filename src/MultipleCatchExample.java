public class MultipleCatchExample {

    public static void main(String[] args) {

        try {
            String str = null;
            System.out.println(str.length());   // This will throw NullPointerException
        }

        catch (NullPointerException e) {
            System.out.println("Error: Null Pointer Exception!");
        }

        catch (Exception e) {
            System.out.println("Some other error occurred.");
        }

    }
}
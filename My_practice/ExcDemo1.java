public class ExcDemo1 {
    public static void main(String[] args){
        int[] nums = new int[4];
        try {
            System.out.println("Before generating exception");
            nums[0] = 3;
            System.out.println("This won't be displayed.");
        }
        catch (ArrayIndexOutOfBoundsException exc){
            System.out.println("Index is out of bounds, what you reeeeeee");
        }
        System.out.println("After catch statement");
    }
}
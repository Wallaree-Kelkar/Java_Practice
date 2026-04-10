class ExcTest {
    static void genExc(){
        int nums[] = new int[4];
        System.out.println("Before exception is generated - now let's try adding 2 statements in our exception");
        System.out.println("Here we tried 2 problematic statements - but only 1 gotcha caught came out.");
        nums[7] = 2;
        nums[8] = 5;
    }
}
public class ExcDemo2 {
    public static void main(String[] args){
        try {
            ExcTest.genExc();}
            catch (ArrayIndexOutOfBoundsException exc){
            System.out.println("Gotcha!!! caught!!!");
        }
        System.out.println("Caught and all...now let's get back to work.");
    }
}

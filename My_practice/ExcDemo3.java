public class ExcDemo3 {
    public static void main(String[] args){
        int num[] = {1,2,3,4,5,6,7,8,9,10};
        int denom[] = {0,12,13,13,15};
        for (int i=0; i<9; i++){
        try {
            
                float res = (float)num[i]/denom[i];

                if (denom[i] == 0)
                    throw new ArithmeticException();

                System.out.println(res);
            }
        // multiple catches can be there
        catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("Array index is out of bounds!!!");
        }
        catch (ArithmeticException exc){
            System.out.println("Can't divide by zero!!!");
        }
        catch (Throwable excp){ //superclass exception - written after the subclass exception
            System.out.println("Some other error occured.");
        }   
    }
}
}


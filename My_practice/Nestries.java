public class Nestries {
    public static void main(String[] args){
        int num[] = {1,2,3,4,5,6,7,8,9};
        int dem[] = {10,20,30,40,50,60};
        try {
            for(int i=0;  i<10; i++){
                try {
                System.out.println(num[i]/dem[i]);
                }
                catch (ArithmeticException ex){
                System.out.println("Cannot divide by zero");
            }
            }
        } 
        catch(ArrayIndexOutOfBoundsException ex) {
            System.out.println("the array index is outta bounds");
        }
    }
}

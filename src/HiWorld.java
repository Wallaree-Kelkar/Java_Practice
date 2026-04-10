public class HiWorld {
    public static void main(String[] args){
        System.out.println("hello World!");
        //Printing number pattern
        for(int i=1; i<12; i++){
            for(int j=1; j<i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
        for(int i=12; i>0; i--){
            for(int j=1; j<i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
public class StarPattern {
    public static void main(String[] args){
        for(int i=1; i<6; i++){
            for(int j=1; j<i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    
    for(int i=6; i>0; i--){
            for(int j=1; j<i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    
    System.out.println("Pyramid pattern with stars");
    for(int i=1; i<7; i++){
        for(int j=1; j<i; j++){
            if(j%2!=0){
                System.out.print("*");
            }
        }
        System.out.println();
    }

}
}


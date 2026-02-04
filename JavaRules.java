public class JavaRules {
    public static void main(String args[]){
        System.out.println("Java rules:-");
        System.out.println("Every java program starts execution from 'public static void main(String args[])'");
        System.out.println("Java is case-sensitive and all methods end with a semicolon;");
        System.out.println();
        System.out.println("Pattern printing:");
        System.out.println("Pattern 1: ");
        for(int i=1; i<6; i++){
            System.out.print("*");
        }
        System.out.println();
        for(int i=1; i<=3; i++){
            System.out.println("*   *");
            //System.out.println();
        }
        for(int i=1; i<6; i++){
            System.out.print("*");
        }
        System.out.println("\n");
        System.out.println("Pattern 2: "); 
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (j == i || j == 5 - i - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }


        System.out.println("Pattern 3:");
        int n = 2;  
        for (int i = 0; i <= n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= 2 * i; j++) {
                if (j == 0 || j == 2 * i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

        for (int i = n - 1; i >= 0; i--) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= 2 * i; j++) {
                if (j == 0 || j == 2 * i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
            System.out.println();


            System.out.println("pattern 4: ");
            for (int i = 1; i <= 4; i++) {

            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


        System.out.println("pattern 5: ");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {

                if (i == 0 || i == 5 - 1 || j == 0 || j == 5 - 1) {
                    System.out.print("1");
                }
                else if (i == 1 || i == 5 - 2 || j == 1 || j == 5 - 2) {
                    System.out.print("2");
                }
                else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
            System.out.println();
            System.out.println("Pattern 6: ");

        for (int i = 1; i <= 5; i++) {

            // spaces
            for (int j = i; j < 5; j++) {
                System.out.print(" ");
            }

            // stars
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (i == 5 || j == 1 || j == 2 * i - 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

        System.out.println();
        for (int i = 5; i >= 1; i--) {

            // spaces
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }

            // stars
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (i == 5 || j == 1 || j == 2 * i - 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        
        }
    }


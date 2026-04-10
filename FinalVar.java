import java.util.Scanner;
public class FinalVar {
    public static void main(String args[]){
        //gives error because a can't be reassigned
        
        /*final int a = 20;
        //a = 22;
        //string concatenation
        String fName = "SIT";
        String lName = "COllege";
        String fullName = fName+lName;
        System.out.println(fullName);

        //printing stuff on the screen
        String studentName = "Raksha";
        int studentID = 15;
        int stuAge = 23;
        float studentFee = 75.42f;
        System.out.println("Student name: " +studentName+ "\nStudent ID: " +studentID+ "\nStudent Age: " +stuAge);

        //area of a circle
        final float pi = 3.14f;
        int r = 14;
        double area = pi*r*r;
        System.out.println("Area of a circle: "+area);*/

        //narrowing and widening casting
        //narrowing
        /*double doo = 9.78d;
        int i = (int)doo;

        System.out.println(doo);

         System.out.println(i);

         //widening

         //difference between pre-increment and post-increment
         int a = 20;
         int b = 20;
         int c = a++;
         int d = ++b;
        System.out.println("Post increment: value of a: "+a+"\nValue of c: "+c);
         System.out.println("Value of b: "+b+ "\nValue of d: "+d);


         int x = 3, y = 2;
         System.out.println(x>y);
         System.out.println(y>x);*/

         //Operators 
        System.out.println(0&15);
         System.out.println(0|1);
          System.out.println(3<<4);
           System.out.println(12>>2);
            System.out.println(1>>>4);

        //Taking input from user
        Scanner obj = new Scanner(System.in);
        int age = obj.nextInt();
        int sal = obj.nextInt();
        int sum = age + sal;
        System.out.println(sum);
    }
}


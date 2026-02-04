public class Sound {
    public static void main(String args[])
    throws java.io.IOException{
            char inp;
            int count = 0;
            do{
            System.out.println("Enter a character: ");
            inp = (char) System.in.read();
            count++;
            }while(inp!='.');
            System.out.println("No of spaces is: "+count);
        }
        
    }
//when is a number prime? a number is prime when it has no other factors than 1 and itself
//here we have to check for each number if it mod all numbers less than it gives output zero, if yes then print

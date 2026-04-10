class  Nonintres extends Exception {
    int n,d;
    Nonintres(int i, int j){
        n = i;
        d = j;
    }
    public String toString() {
        return "non-integer!!!";
    }
}
public class CustomExpDemo {
    public static void main(String[] args){
        int i=120, j = 12;
        try {
            if (i%j!=0)
                throw new Nonintres(i, j);
            System.out.println(i/j);
        }
        catch (Nonintres exp){
            System.out.println("the result is fractional, not integral");
        }
        catch (Exception e){
            System.out.println("Some other error occured");
        }
    }
}

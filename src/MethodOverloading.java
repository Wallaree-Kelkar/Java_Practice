class Addition {
    int add(int a, int b ){
        return a + b;
    }
    double add(double a, double b){
        return a + b;
    }
    int add(int a, int b, int c){
        return a + b + c;
    }

}

class Subtraction {
    int sub(int a, int b){
        return a - b;
    }
    double sub(double a, double b){
        return a - b;
    }
}

class Multiplication {
    int mul(int a, int b){
        return a*b;
    }
    int mul(int a, int b, int c){
        return a*b*c;
    }
}

public class MethodOverloading {
    public static void main(String args[]){
        Addition a = new Addition();
        int b = a.add(12,13);
        System.out.println("sum is: "+b);
        double c = a.add(12.45,13.69);
        System.out.println("sum is: "+c);
        int d = a.add(67,89,102);
        System.out.println("sum is: "+d);

        Subtraction s = new Subtraction();
        int diff = s.sub(56,14);
        System.out.println("difference is "+diff);
        double dif = s.sub(122.3456, 555.001);
        System.out.println("difference is"+dif);

        Multiplication m = new Multiplication();
        int mul = m.mul(diff, b);
        System.out.println("product is"+mul);
        int mi = m.mul(123,45,0);
        System.out.println("Product is"+mi);
    }
}

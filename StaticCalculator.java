public class StaticCalculator {
    public static void main(String args[]){
        Add a = new Add(2,3);
        int ans;
        ans = a.Add(2,3);
        Subtract s = new Subtract(7,4);
        Multiply m = new Multiply(5,6);
        Divide d = new Divide(4,4);
        System.out.println("sum:" + ans);
    }
}

class Add{
    Add(int x, int y){
        int sum = x + y;
    }
}

class Subtract{
    Subtract(int x, int y){
        int diff = x - y;
    }
}

class Multiply{
    Multiply(int x, int y){
        int pro = x*y;
    }
}

class Divide{
    Divide(int x, int y){
        float quo = x/y;
    }
}

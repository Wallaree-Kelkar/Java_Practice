class DifferentMethods{
    void d(int n1, String n2){
        System.out.println(n1+n2);
    }
    void d(String n2, int n1){
        System.out.println(n2+n1);
    }
}


public class Overload {
    public static void main(String[] args) {
        DifferentMethods dom = new DifferentMethods();
        dom.d("Salmon",2);
        dom.d(4,"Banana");
    }
}

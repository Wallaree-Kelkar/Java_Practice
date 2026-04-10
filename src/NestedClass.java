public class NestedClass {
    class Outer {
        class Inner{
            void display(){
                System.out.println("Inner class method");
            }
        }
    }

    public static void main(String[] args){
        NestedClass.Outer.Inner obj = new NestedClass().new Outer().new Inner();
        obj.display();
    }
}

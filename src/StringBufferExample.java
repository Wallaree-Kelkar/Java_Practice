public class StringBufferExample {
    public static void main(String args[]){
        StringBuffer s = new StringBuffer("hello");
        s.append("world");
        System.out.println("After append: "+s);
        s.insert(6,"java");
        System.out.println("After insert: "+s);
        s.replace(0,5,"hi");
        System.out.println("After replace: "+s);
        s.delete(2,5);
        System.out.println("After delete: "+s);
        s.reverse();
        System.out.println("After reverse: "+s);
    }
}

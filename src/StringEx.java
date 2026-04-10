public class StringEx {
    public static void main(String[] args){
        String s1 = "Hello?";
        String s2 = new String("Java");
        System.out.println(s1);
        System.out.println(s2);
        s2.concat("Zumba");
        System.out.println(s2.length());
        System.out.println(s2.compareTo(s1));
    }
}


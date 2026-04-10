public class Tokiening {
    public static void main(String[] args) {
        String s = "A,b,c,d,e";
        StringTokenizerEx st = new s(s,",");
        while(st.hasMoreTokens()){
        System.out.println(st.nextToken());
        }
    }
}

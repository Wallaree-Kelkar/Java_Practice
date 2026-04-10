class Exception {
    static void fun() {
        try {
            throw new NullPointerException("demo");
        }
        catch (NullPointerException e) {
            System.out.println("Caught inside fun().");
            throw e;
        }
    }
    public static void main(String args[]){
        fun();
        /*try {
            fun();
        }
        catch (NullPointerException e){
            System.out.println("Caught in main!");
        }*/
    }
}

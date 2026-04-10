public class ArrayExample {
    public static void main(String[] args){
        int[] numbers = {10,20,30,40,50};

        for(int i=0; i<numbers.length;i++){
            System.out.print(numbers[i]+ " ");
        }

        for(int num : numbers){
            System.out.println(num);
        }

        int[] mumble = {1,2,3,4,5};
        for (int mum : mumble){
            System.out.print(mum+" ");
        
        }

        char[] canI = {'a','A','B','b'};
        for(char m : canI){
            System.out.print(m+" ");
        }

    }
}

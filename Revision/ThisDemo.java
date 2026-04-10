class Demo{
    Demo(){
        this("Default constructor, now calling paramed constructor");
    }

    Demo(String msg){
        System.out.println(msg);
    }
}
public class ThisDemo {
    public static void main(String[] args){
    Demo d = new Demo("Will this get printed or thaat?");
    }
}

class Shape{
    void draw(){
        System.out.println("Shapeas are drawn with a pencil.");
    }
}

class Triangle extends Shape{
    void be(){
        System.out.println("Pythagoras");
    }
}

class RightTriangle extends Triangle{
    void ninety(){
        System.out.println("Right angled triangle has a 90 degrees angle in it");
    }
}

public class Inh2 {
    public static void main(String[] args){
        RightTriangle r = new RightTriangle();
        r.draw();
        r.be();
        r.ninety();
    }
}

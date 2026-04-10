class Red{
    void colour(){
        System.out.println("Red iss a colour");
    }
}

class Orange extends Red{
    void light(){
        System.out.println("Orange is a shade of red");
    }
}

class Maroon extends Red{
    void dark(){
        System.out.println("Maroon is a darker shade of red");
    }
}
public class HierarchicalInh {
    public static void main(String[] args) {
        Orange o = new Orange();
        Maroon m = new Maroon();
        o.colour();
        o.light();
        m.colour();
        m.dark();
    }
}

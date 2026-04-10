package pp2;
import package_practice.Suitcase;
public class Penguin extends Suitcase {
    public static void main(String[] args){
    Suitcase pu = new Suitcase();
    //System.out.println(pu.num1); //not accessible outside package
    System.out.println(pu.num2);
    // this num2 is public, so it is accessible in this different package which is a non-subclass of Suitcase
    //System.out.println(pu.num3); //not accessible outside package
    //System.out.println(pu.num4); //not accessible when object is of parent class (parent class object pu)
    Penguin p = new Penguin();
    System.out.println(p.num4); //accessible when object is child class object p
    }
}

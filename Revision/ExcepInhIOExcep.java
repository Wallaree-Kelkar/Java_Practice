import java.io.IOException;
import java.io.FileNotFoundException;
class Parent {
    void readFile() throws IOException{
        System.out.println("Reading file in parent");
    }
}

class Child extends Parent {
    @Override
    void readFile() throws FileNotFoundException {
        System.out.println("File not found in child");
    }
}
public class ExcepInhIOExcep {
    public static void main(String[] args){
        Parent obj = new Child();   // polymorphism (upcasting)

        try {
            obj.readFile();
        } 
        catch (FileNotFoundException e) {
            System.out.println("Handled FileNotFoundException in main");
        }
        catch (IOException e) {
            System.out.println("Handled IOException in main");
    }    
}

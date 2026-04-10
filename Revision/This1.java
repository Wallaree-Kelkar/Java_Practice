class Student{
    String s;
    Student(String s){
        this.s = s;
    }
    void display(){
        System.out.println("Name of the student is: "+this.s);
    }
}

public class This1 {
    public static void main(String[] args) {
        Student a = new Student("Greenie");
        a.display();
    }
}

class Student{
    String name;
    int Age;
    Student(String n,int a){
        name = n;
        Age = a;
    }
    void display(){
        System.out.println("Name and Age of the student are: "+name+" "+Age);
    }
}

class Counter{
    static int count = 0;
    Counter(){
        count++;
        System.out.println("Object created. Current count: " +count);
    }
}

public class Loops {
    public static void main(String args[]){
        //running for loop in Java: similarly Java also has while, do while, switch case, if else
        /*for(int i=1; i<6; i++){
            System.out.println("Java is fun!");
        }*/
       Student s = new Student("Xander", 21);
       s.display();
       s.name = "Yash";
       s.Age = 71;
       s.display();
       Counter o1 = new Counter();
       Counter o2 = new Counter();
       Counter o3 = new Counter();
       Counter o4 = new Counter();
    }
}

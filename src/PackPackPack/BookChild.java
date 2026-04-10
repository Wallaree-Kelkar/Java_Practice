package PackPackPack;
import bookpack.Book;
public class BookChild extends Book{
    //public static void main(String[] args){
    public void display(){
        System.out.println("accessing number: "+nummer);
        showing();
    }
    public static void main(String args[]){
        BookChild o = new BookChild();
        o.display();
    }
}
//}

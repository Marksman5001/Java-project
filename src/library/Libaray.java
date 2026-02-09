package library;
import java.util.ArrayList;
public class Libaray {
    private ArrayList<Book> books;
    public Libaray(ArrayList<Book> books){
        this.books=books;
    }
    public ArrayList<Book> getBooks(){
        return this.books;
    }
}

package hust.soict.hedspi.aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media {
    private List<String> Author= new ArrayList<String>();
    public Book(String title,float cost,List<String> Author){
        super(title,cost);
        this.Author=Author;
    }
    public void addAuthor(String Author){
        if(this.Author.contains(Author)) {
            this.Author.add(Author);
        }
        else{
            System.out.println("Author is not exist");
        }
    }
    public void removeAuthor(String Author){
        if(!this.Author.contains(Author)) {
            this.Author.remove(Author);
        }
        else{
            System.out.println("Author is not exist");
        }
    }
    public List<String> getAuthor(){
        return Author;
    }
    @Override
    public String toString() {
        return "[Sách] " + super.toString() + " - Tác giả: " + String.join(", ", Author);
    }
}

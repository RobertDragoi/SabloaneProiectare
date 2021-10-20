import java.util.ArrayList; 
public class Book {
    String title;
    Author author;
    ArrayList<Chapter> chapters=new ArrayList<Chapter>();
    public Book(String title) {
        this.title = title;
    }
    public void addAuthor(Author author) {
        this.author = author;
    }
    public int createChapter(String title){
        Chapter c=new Chapter(title);
        this.chapters.add(c);
        return chapters.indexOf(c);
    }
    public Chapter getChapter(int index){
        return chapters.get(index);
    }
    public void print(){
        System.out.println(this.title);
    }
}

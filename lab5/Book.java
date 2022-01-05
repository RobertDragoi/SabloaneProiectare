package lab5;
import java.util.ArrayList; 
public class Book {
    String title;
    Author author;
    ArrayList<Element> elements=new ArrayList<Element>();
    public Book(String title) {
        this.title = title;
    }
    public void addAuthor(Author author) {
        this.author = author;
    }
    public void addContent(Element element) {
        this.elements.add(element);
    }
    // public int createChapter(String title){
    //     Chapter c=new Chapter(title);
    //     this.chapters.add(c);
    //     return chapters.indexOf(c);
    // }
    // public Chapter getChapter(int index){
    //     return chapters.get(index);
    // }
    public void print(){
        System.out.println("Book: "+this.title+"\n");
        System.out.println("Authors:");
        this.author.print();
        this.elements.forEach(e -> e.print());
    }
}

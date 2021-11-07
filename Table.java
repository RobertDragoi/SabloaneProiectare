import java.util.ArrayList; 
public class Table implements Element{
    String title;
    ArrayList<Element> elements=new ArrayList<Element>();
    public Table(String title) {
        this.title =title;
    }
    public void add(Element element) {
        this.elements.add(element);
    }
    public void print(){
        System.out.println("Table with title: "+this.title);
    }
}

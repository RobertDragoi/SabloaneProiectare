package lab23;
import java.util.ArrayList; 
public class Section implements Element {
    public String title;
    ArrayList<Element> elements=new ArrayList<Element>();
public Section(String title) {
    this.title = title;
}
public void add(Element element) {
    this.elements.add(element);
}
    public void print(){
        System.out.println(this.title);
        this.elements.forEach(e -> e.print());
    }
}
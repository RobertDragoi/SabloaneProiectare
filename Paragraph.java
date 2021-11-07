import java.util.ArrayList; 
public class Paragraph implements Element {
    String text;
    ArrayList<Element> elements=new ArrayList<Element>();
    public Paragraph(String text) {
        this.text =text;
    }
    public void add(Element element) {
        this.elements.add(element);
    }
    public void print(){
        System.out.println("Paragraph: "+this.text);
    }
}

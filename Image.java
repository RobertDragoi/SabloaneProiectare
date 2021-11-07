import java.util.ArrayList; 

public class Image implements Element{
    String imageName;
    ArrayList<Element> elements=new ArrayList<Element>();
    public Image(String imageName) {
        this.imageName =imageName;
    }
    public void add(Element element){
        this.elements.add(element);
    }
    public void print(){
        System.out.println("Image with name: "+this.imageName);
    }
}

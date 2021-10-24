import java.util.ArrayList; 
public class SubChapter {
    String name;
    ArrayList<Element> elements=new ArrayList<Element>();

    public SubChapter(String name) {
        this.name = name;
    }
    public void createNewParagraph(String text){
        Paragraph paragraph=new Paragraph(text);
        this.elements.add(paragraph);
    }
    public void createNewImage(String imageName){
        Image image=new Image(imageName);
        this.elements.add(image);
    }
    public void createNewTable(String title){
        Table table=new Table(title);
        this.elements.add(table);
    }

    public void print(){
        System.out.println("Subchapter: "+this.name);
        elements.forEach((Element element)->{
            element.print();
        });
    }
}

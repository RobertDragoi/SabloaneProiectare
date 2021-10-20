import java.util.ArrayList; 
public class SubChapter {
    String name;
    ArrayList<Paragraph> paragraphs=new ArrayList<Paragraph>();
    ArrayList<Image> images=new ArrayList<Image>();
    ArrayList<Table> tables=new ArrayList<Table>();

    public SubChapter(String name) {
        this.name = name;
    }
    public void print(){
        System.out.println(this.name);
    }
}

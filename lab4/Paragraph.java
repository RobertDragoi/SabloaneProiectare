package lab4;
public class Paragraph implements Element {
    String text;
    public Paragraph(String text) {
        this.text =text;
    }
    public void print(){
        System.out.println("Paragraph: "+this.text);
    }
}

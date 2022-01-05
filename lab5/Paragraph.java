package lab5;
public class Paragraph implements Element {
    String text;
    private AlignStrategy alignStrategy;
    public Paragraph(String text) {
        this.text =text;
        this.alignStrategy = null;
    }
    public void setAlignStrategy(AlignStrategy alignStrategy) {
        this.alignStrategy = alignStrategy;
    }
    public String getText() {
        return this.text;
    }
    public void print(){
        if (alignStrategy == null) {
            System.out.println("Paragraph: "+this.text);
            return;
        }
        alignStrategy.render(this);
        
    }
}

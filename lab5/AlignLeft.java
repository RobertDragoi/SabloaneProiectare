package lab5;

public class AlignLeft implements AlignStrategy{
    public void render(Paragraph paragraph) {
        System.out.println(paragraph.getText() + " <- left");
    }
}

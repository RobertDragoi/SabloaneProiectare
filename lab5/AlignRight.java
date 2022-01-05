package lab5;

public class AlignRight implements AlignStrategy{
    public void render(Paragraph paragraph) {
        System.out.println(paragraph.getText() + " <- right");
    }

}

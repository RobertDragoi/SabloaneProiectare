package lab56;

public class AlignRight implements AlignStrategy{
    public void render(Paragraph paragraph) {
        System.out.println(paragraph.getText() + " <- right");
    }

}

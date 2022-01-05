package lab56;

public class AlignCenter implements AlignStrategy {
    public void render(Paragraph paragraph) {
        System.out.println(paragraph.getText() + " <- center");
    }
}

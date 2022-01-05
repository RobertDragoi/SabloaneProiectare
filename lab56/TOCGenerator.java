package lab56;
import java.util.stream.Collectors;
public class TOCGenerator implements Visitor<String> {
    private int sectionDepth = 0;
    private int sectionWidth = 0;

    public String visit(Book book) {
        return String.format(
                "%s, by %s\n%s",
                book.title,
                String.join(", ", book.author.name,book.author.surname),
                String.join("\n", book.elements.stream().map((child) -> {
                    sectionWidth++;
                    return child.accept(this);
                }).collect(Collectors.joining("\n"))));
    }

    
    public String visit(Section section) {
        sectionDepth++;
        String returnString = String.format(
                "%s%s\n%s",
                " ".repeat(sectionDepth),
                section.title,
                section.elements.stream().map((child) -> {
                    sectionWidth++;
                    return child.accept(this);
                }).collect(Collectors.joining("\n")));
        sectionDepth--;
        sectionWidth = 0;
        return returnString;
    }

    
    public String visit(TableOfContents toc) {
        return formatted("Table of Contents");
    }

    
    public String visit(Paragraph paragraph) {
        return formatted("Paragraph " + paragraph.getText());
    }

    
    public String visit(ImageProxy imageProxy) {
        return formatted("Image " + imageProxy.url);
    }

    
    public String visit(Image image) {
        return formatted("Image " + image.imageName);
    }

    
    public String visit(Table table) {
        return formatted("Table " + table.title);
    }

    private String formatted(String in) {
        return String.format("%s%d.%s", " ".repeat(sectionDepth), sectionWidth, in);
    }
}

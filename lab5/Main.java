package lab5;
public class Main {
    public static void Printing(){
        DocumentManager.getInstance().getBook().print();
        }
public static void main(String[] args) 
{
     Book book = new Book("O carte");
        TableOfContents toc = new TableOfContents(book);
        book.addContent(toc);
        Paragraph p1 = new Paragraph("Paragraph 1");
        book.addContent(p1);
        Paragraph p2 = new Paragraph("Paragraph 2");
        book.addContent(p2);
        Paragraph p3 = new Paragraph("Paragraph 3");
        book.addContent(p3);
        Paragraph p4 = new Paragraph("Paragraph 4");
        book.addContent(p4);
        book.addContent(new ImageProxy("ImageOne"));
        book.addContent(new Image("ImageTwo"));
        book.addContent(new Paragraph("Some text"));
        book.addContent(new Table("Table 1"));

        BookStatistics stats = new BookStatistics();
        book.accept(stats);
        stats.printStatistics();

        book.print();
}
}

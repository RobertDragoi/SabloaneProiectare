package lab56;
public class Table implements Element{
    String title;
    public Table(String title) {
        this.title =title;
    }
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(this);
    }
    public void print(){
        System.out.println("Table with title: "+this.title);
    }
}

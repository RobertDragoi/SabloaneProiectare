package lab5;
public interface Element {
    public <T> T accept(Visitor<T> visitor);
    public void print();
}

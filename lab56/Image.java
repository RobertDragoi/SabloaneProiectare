package lab56;
import java.util.concurrent.TimeUnit;
public class Image implements Element{
    String imageName;
    public Image(String imageName) {
        this.imageName =imageName;
        try {
            TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
            e.printStackTrace();
            }
    }
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(this);
    }
    public void print(){
        System.out.println("Image with name: "+this.imageName);
    }
}

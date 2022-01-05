package lab56;

public class ImageProxy implements Element {
    public Image realImage;
    public String url;
    public ImageProxy(String url){
        this.url = url;
    }
    Image loadImage(){
        if(realImage == null){
            realImage = new Image(this.url);
        }
        return realImage;
    }
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(this);
    }
    public void print(){  
        loadImage();
        realImage.print();
    }
}

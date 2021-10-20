import java.util.ArrayList; 
public class Chapter {
    String name;
    ArrayList<SubChapter> subChapters=new ArrayList<SubChapter>();
    public Chapter(String name) {
        this.name = name;
    }
    public int createSubChapter(String title){
        SubChapter sc=new SubChapter(title);
        this.subChapters.add(sc);
        return subChapters.indexOf(sc);
    }
    public SubChapter getSubChapter(int index){
        return subChapters.get(index);
    }
    public void print(){
        System.out.println(this.name);
    }
}

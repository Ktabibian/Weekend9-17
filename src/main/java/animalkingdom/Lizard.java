package animalkingdom;

public class Lizard extends Pets{
    public Lizard(String name) {
        super(name, "bugs");
    }

    public String speak(){
        return "hissss";
    }
}

package animalkingdom;

public class Cat extends Pets{

    public Cat(String name) {
        super(name, "fish");
    }

    public String speak(){
        return "meow meow";
    }
}

package animalkingdom;

public class Dog extends Pets{

    public Dog(String name) {
        super(name, "steak");
    }

    public String speak(){
        return "woof woof";
    }
}

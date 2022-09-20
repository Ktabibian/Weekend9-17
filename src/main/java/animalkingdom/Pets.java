package animalkingdom;

public class Pets {

    private String name;
    private String food;

    public Pets(String name, String food) {
        this.name = name;
        this.food = food;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String speak(){
        return "pet noise";
    }

}

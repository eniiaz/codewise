package liveCoding;

public abstract class Chair {

    // model, weight, color
    public String model;
    public double weight;
    public String color;

// void sit, void stepOnIt
    public abstract void sit();

    public abstract void stepOnIt();

    public void changeColor(String color){
        this.color = color;
    }

}

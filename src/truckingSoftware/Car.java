package truckingSoftware;

public class Car {

    String tires;
    String wheel;
    String window;
    String lights;
    String color;
    String type;
    double year;
    double price;

    public void drives () {
        System.out.println(color + " " + type + " " + "of " + year + " year " + " with " + wheel + " wheel, " + tires + " tires, " + window + " window, " + lights + " lights that costs $"+price + "," + " is driving. ");
    }

    public void stops (){
        System.out.println(color + " " + type + " " + "of " + year + " year " + " with " + wheel + " wheel, " + tires + " tires, " + window + " window, " + lights + " lights that costs $"+price + "," + " is stopping. ");
    }

    public void heats (){
        System.out.println(color + " " + type + " " + "of " + year + " year " + " with " + wheel + " wheel, " + tires + " tires, " + window + " window, " + lights + " lights that costs $"+price + "," +  " is heating. ");
    }

    public void cools (){
        System.out.println(color + " " + type + " " + "of " + year + " year " + " with " + wheel + " wheel, " + tires + " tires, " + window + " window, " + lights + " lights that costs $"+price + "," +  " is cooling. ");
    }

    public void playsMusic (){
        System.out.println(color + " " + type + " " + "of " + year + " year " + " with " + wheel + " wheel, " + tires + " tires, " + window + " window, " + lights + " lights that costs $"+price + "," +  " is playing music. ");
    }

    public boolean isExpensive () {System.out.println(color + " " + type + " " + "of " + year + " year " + " with " + wheel + " wheel, " + tires + " tires, " + window + " window, " + lights + " lights that costs $"+price + "," + " is very expensive. ");

        return true;
    }


}
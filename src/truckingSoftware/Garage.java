package truckingSoftware;

public class Garage {
    public static void main ( String []args ){

        Car Mercedes = new Car();
        Car RangeRover = new Car();
        Car Lexus = new Car();
        Car Toyota = new Car();

        Mercedes.tires = "winter";
        Mercedes.wheel = "amg";
        Mercedes.window = "dark";
        Mercedes.lights = "red";
        Mercedes.color = "black";
        Mercedes.type = "sedan";
        Mercedes.year = 2023;
        Mercedes.price = 115000;

        Mercedes.drives();
        Mercedes.stops();
        Mercedes.heats();
        Mercedes.cools ();
        Mercedes.playsMusic();
        Mercedes.isExpensive();



        RangeRover.tires = "summer";
        RangeRover.wheel = "sport";
        RangeRover.window = "tinted";
        RangeRover.lights = "bright";
        RangeRover.color = "grey";
        RangeRover.type = "crossover";
        RangeRover.year = 2022;
        RangeRover.price = 80000;

        RangeRover.drives();
        RangeRover.stops();
        RangeRover.heats();
        RangeRover.cools ();
        RangeRover.playsMusic();
        RangeRover.isExpensive();

        Lexus.tires = "seasonal";
        Lexus.wheel = "platinum";
        Lexus.window = "clear";
        Lexus.lights = "tail";
        Lexus.color = "white";
        Lexus.type = "coupe";
        Lexus.year = 2020;
        Lexus.price = 60000;

        Lexus.drives();
        Lexus.stops();
        Lexus.heats();
        Lexus.cools ();
        Lexus.playsMusic();
        Lexus.isExpensive();

        Toyota.tires = "drift";
        Toyota.wheel = "custom";
        Toyota.window = "laminated";
        Toyota.lights = "brake";
        Toyota.color = "red";
        Toyota.type = "hatchback";
        Toyota.year = 2019;
        Toyota.price = 230000;

        Toyota.drives();
        Toyota.stops();
        Toyota.heats();
        Toyota.cools ();
        Toyota.playsMusic();
        Toyota.isExpensive();



    }

}
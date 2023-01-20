package polymorphism;

public class Circle extends Shape{

    @Override
    public void draw(){
        System.out.println("Drawing the Circle");
    }

    public void color(){
        System.out.println("Coloring the circle");
    }

    public void color(String color){
        System.out.println("coloring the circle: " + color);
    }

}

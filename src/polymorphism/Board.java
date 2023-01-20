package polymorphism;

public class Board {

    public static void main(String[] args) {

        // I can create an object from child classes with reference type
        // of parent class
        Shape shape1 = new Circle();
        Shape shape2 = new Hexagon();
        Shape shape3 = new Square();

        shape1.draw();
        shape2.draw();
        shape3.draw();

        ((Circle)shape1).color();


    }
}

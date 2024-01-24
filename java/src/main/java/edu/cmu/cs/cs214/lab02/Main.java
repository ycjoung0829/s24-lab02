package edu.cmu.cs.cs214.lab02;

import edu.cmu.cs.cs214.lab02.shapes.Circle;
import edu.cmu.cs.cs214.lab02.shapes.Rectangle;
import edu.cmu.cs.cs214.lab02.shapes.Square;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(2, 3);
        Circle circle = new Circle(3);
        Square square = new Square(4);

        Renderer renderer = new Renderer(rectangle);
        Renderer renderer1 = new Renderer(circle);
        Renderer renderer2 = new Renderer(square);

        renderer.draw();
        renderer1.draw();
        renderer2.draw();
    }
}

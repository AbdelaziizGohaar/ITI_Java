//import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

import CShapes.*;

public class Main {
    
    public static void drawShapes(List<? extends Shape> shapes) {
        for (Shape shape : shapes) {
            shape.Draw(); // a3ml Call le elll draw method for each shape 3andy 
        }
    }
    public static void main(String[] args) {

         // Create a list of Rectangles
        List<Rectangle> rectangles = new ArrayList<>();
        rectangles.add(new Rectangle(4, 6));
        rectangles.add(new Rectangle(5, 7));

        // Create a list of Circles
        List<Circle> circles = new ArrayList<>();
        circles.add(new Circle(3));
        circles.add(new Circle(4.5));

        // Draw all shapes in the rectangles list
        System.out.println("Drawing Rectangles:");
        drawShapes(rectangles);

        System.out.println();

        // Draw all shapes in the circles list
        System.out.println("Drawing Circles:");
        drawShapes(circles);
        
    }
}

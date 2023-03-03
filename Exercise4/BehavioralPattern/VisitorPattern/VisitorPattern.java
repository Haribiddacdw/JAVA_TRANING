package BehavioralPattern.VisitorPattern;
/*@author Hari Prasath V
 *  @version 1.0
 */

import java.util.ArrayList;
import java.util.List;

//the ShapeVisitor interface with visit() methods declared for all the shape classes Square, Circle, and Rectangle.
//VISITOR
interface ShapeVisitor {
    void visit(Circle circle);
    void visit(Square square);
    void visit(Rectangle rectangle);
}

//CONCRETE VISITOR 
class AreaVisitor implements ShapeVisitor {
    private double area;

    @Override
    public void visit(final Circle circle) {
        area = Math.PI * Math.pow(circle.getRadius(), 2);
    }

    @Override
    public void visit(final Square square) {
        area = 2 * square.getLength();
    }

    @Override
    public void visit(final Rectangle rectangle) {
        area = rectangle.getLength() * rectangle.getWidth();
    }

    public double get() {
        return this.area;
    }
}



//Shape interface with a single method, accept().
//to perform an operation on a group of similar kind of Objects
interface Shape{
    void accept(ShapeVisitor visitor);
}

//CONCRETE ELEMENT
class Circle implements Shape {
    private final double radius;

    public Circle(final double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

// Accept operation that takes a visitor as an argument.
    @Override
    public void accept(ShapeVisitor visitor) {
        visitor.visit(this);
    }


}

//CONCRETE ELEMENT
class Square implements Shape {
    private final double length;

    public Square(final double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }
// Accept operation that takes a visitor as an argument.
    @Override
    public void accept(final ShapeVisitor visitor) {
        visitor.visit(this);
    }
}
//CONCRETE ELEMENT
 class Rectangle implements Shape {
    private final double length;
    private final double width;

    public Rectangle(final double length, final double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

// Accept operation that takes a visitor as an argument.
    @Override
    public void accept(final ShapeVisitor visitor) {
        visitor.visit(this);
    }
}



public class VisitorPattern{
    /**
     * @param args
     */
    public static void main(String[] args) {
        final List<Shape> shapes = new ArrayList<>();

        shapes.add(new Circle(10));
        shapes.add(new Square(10));
        shapes.add(new Rectangle(10, 2));
       
        final AreaVisitor areaVisitor = new AreaVisitor();
 

        for (Shape shape: shapes) {
            shape.accept(areaVisitor);
            final double area = areaVisitor.get();

            System.out.printf(
                "Area of %s: %.2f%n", 
                shape.getClass().getSimpleName(), 
                area
            );
        }
    }
}

//Visitor design patterns have a few core participants such as Visitor, Concrete Visitors, Element, Concrete Elements, etc.

//Visitor The visitor interface declares a set of visit() methods that take concrete elements as arguments.
// E.g.: ShapeVisitor

// Concrete Visitor Concrete Visitors implement the Visitor interface and override the visit() method with respective operations.
// Eg: AreaVisitor, PerimeterVisitor.

// Element Element interface declares an accept() method that takes the Visitor interface as an argument.
// E.g.: Shape

// Concrete Element Concrete Elements implement the Element interface and override the accept() method. The only purpose of the accept() method is to call the visit() method of the concrete visitor that it takes as the argument.
// E.g.: Circle, Square, Rectangle.

// Client Client is responsible for creating the concrete visitor instances and passing them to the accept() method of the concrete element instances.


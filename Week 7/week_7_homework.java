// Author: Julia Green
// This program is a simple class hierarchy of different shapes;

class Shape {
    void draw() {
		//Draws Shape
    }
} // end Shape class 

class Rectangle extends Shape {
	void redraw() {
		System.out.println("Drawing a rectangle.");
		System.out.println();
	}
} // end Rectangle Class

class Square extends Rectangle {
	void redraw() {
		System.out.println("Drawing a square.");
		System.out.println();
	}
} // end Square Class

class Ellipsis extends Shape {
	void redraw() {
		System.out.println("Drawing an ellipsis.");
		System.out.println();
	}
} // end Ellipsis Class

class Circle extends Ellipsis {
		void redraw() {
		System.out.println("Drawing a circle.");
		System.out.println();
	}
} // end Circle Class

class Triangle extends Shape {
	void redraw() {
		System.out.println("Drawing a triangle.");
		System.out.println();
	}
} // end Triangle Class

public class TestClass {
    public static void main(String[] args) {
		Circle circle = new Circle();
		circle.redraw();
		
		Triangle triangle = new Triangle();
		triangle.redraw();

		Rectangle rectangle = new Rectangle();
		rectangle.redraw();

		Ellipsis ellipsis = new Ellipsis();
		ellipsis.redraw();

		Square square = new Square();
		square.redraw();
	} // end main
} // end TestClass Class
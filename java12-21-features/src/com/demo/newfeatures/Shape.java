package com.demo.newfeatures;

public interface Shape {

	public static double getPerimeter(Shape shape) throws IllegalArgumentException{
		/*
		 * if (shape instanceof Rectangle) { Rectangle r = (Rectangle) shape; return 2 *
		 * r.getLength() + 2 * r.getWidth(); } else if (shape instanceof Circle) {
		 * Circle c = (Circle) shape; return 2 * c.getRadius() * Math.PI; } else { throw
		 * new IllegalArgumentException("Unrecognized shape"); }
		 */
		
		if (shape instanceof Rectangle r) {
           return 2 * r.getLength() + 2 * r.getWidth();
        } else if (shape instanceof Circle c) {
            return 2 * c.getRadius() * Math.PI;
        } else {
            throw new IllegalArgumentException("Unrecognized shape");
        }

	}
}

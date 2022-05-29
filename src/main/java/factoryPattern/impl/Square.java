package factoryPattern.impl;

import factoryPattern.mapper.Shape;

/**
 * @author ginger
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}

package factoryPattern.impl;

import factoryPattern.mapper.Shape;

/**
 * @author ginger
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}

package abstractFactoryPattern.impl.shape;

import abstractFactoryPattern.mapper.Shape;

/**
 * @author ginger
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}

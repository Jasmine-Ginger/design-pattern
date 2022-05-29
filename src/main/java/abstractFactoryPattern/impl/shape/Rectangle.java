package abstractFactoryPattern.impl.shape;

import abstractFactoryPattern.mapper.Shape;

/**
 * @author ginger
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}

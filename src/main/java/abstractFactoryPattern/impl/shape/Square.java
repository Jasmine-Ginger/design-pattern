package abstractFactoryPattern.impl.shape;

import abstractFactoryPattern.mapper.Shape;

/**
 * @author ginger
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}

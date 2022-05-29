package abstractFactoryPattern;

import abstractFactoryPattern.impl.shape.Circle;
import abstractFactoryPattern.impl.shape.Rectangle;
import abstractFactoryPattern.impl.shape.Square;
import abstractFactoryPattern.mapper.Color;
import abstractFactoryPattern.mapper.Shape;

/**
 * @author ginger
 */
public class ShapeFactory implements AbstractFactory {
    @Override
    public Color getColor(String color) {
        return null;
    }

    @Override
    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }

        if ("CIRCLE".equalsIgnoreCase(shapeType)) {
            return new Circle();
        } else if ("RECTANGLE".equalsIgnoreCase(shapeType)) {
            return new Rectangle();
        } else if ("SQUARE".equalsIgnoreCase(shapeType)) {
            return new Square();
        }

        return null;
    }
}

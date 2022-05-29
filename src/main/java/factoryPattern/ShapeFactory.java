package factoryPattern;

import factoryPattern.impl.Circle;
import factoryPattern.impl.Rectangle;
import factoryPattern.impl.Square;
import factoryPattern.mapper.Shape;

/**
 * @author ginger
 */
public class ShapeFactory {

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

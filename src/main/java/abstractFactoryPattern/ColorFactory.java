package abstractFactoryPattern;

import abstractFactoryPattern.impl.color.Blue;
import abstractFactoryPattern.impl.color.Green;
import abstractFactoryPattern.impl.color.Red;
import abstractFactoryPattern.mapper.Color;
import abstractFactoryPattern.mapper.Shape;

/**
 * @author ginger
 */
public class ColorFactory implements AbstractFactory{
    @Override
    public Color getColor(String color) {
        if (color == null) {
            return null;
        }

        if ("RED".equalsIgnoreCase(color)) {
            return new Red();
        } else if ("GREEN".equalsIgnoreCase(color)) {
            return new Green();
        } else if ("BLUE".equalsIgnoreCase(color)) {
            return new Blue();
        }

        return null;
    }

    @Override
    public Shape getShape(String shapeType) {
        return null;
    }
}

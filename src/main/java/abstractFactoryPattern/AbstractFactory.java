package abstractFactoryPattern;

import abstractFactoryPattern.mapper.Color;
import abstractFactoryPattern.mapper.Shape;

/**
 * @author ginger
 */
public interface AbstractFactory {

    public abstract Color getColor(String color);

    public abstract Shape getShape(String shapeType);
}

package builderPattern.mealImpl;

import builderPattern.BurgerImpl.ChickenBurger;
import builderPattern.BurgerImpl.VegBurger;
import builderPattern.coldDrinkImpl.Coke;
import builderPattern.coldDrinkImpl.Pepsi;

/**
 * 7.膳食生成器
 * @author ginger
 */
public class MealBuilder {

    public Meal prepareVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}

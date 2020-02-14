package pizza.abstrct;

import ingredientfactory.ChicagoPizzaIngredientFactory;
import ingredientfactory.abstrct.IngredientFactory;

public abstract class ChicagoPizza extends Pizza{
    @Override
    IngredientFactory setIngredientFactory() {
        return new ChicagoPizzaIngredientFactory();
    }
}

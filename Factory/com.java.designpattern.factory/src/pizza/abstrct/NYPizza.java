package pizza.abstrct;

import ingredientfactory.NYPizzaIngredientFactory;
import ingredientfactory.abstrct.IngredientFactory;

public class NYPizza extends Pizza {
    @Override
    IngredientFactory setIngredientFactory() {
        return new NYPizzaIngredientFactory();
    }
}

package ingredientfactory;

import ingredient.MarinaraSauce;
import ingredient.ReggianoCheese;
import ingredient.ThinCrustDough;
import ingredient.abstrct.*;
import ingredientfactory.abstrct.IngredientFactory;

public class NYPizzaIngredientFactory implements IngredientFactory {
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[0];
    }

    @Override
    public Clams createClams() {
        return null;
    }
}

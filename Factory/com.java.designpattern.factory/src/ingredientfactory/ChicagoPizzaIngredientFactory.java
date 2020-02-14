package ingredientfactory;

import ingredient.FrozenClams;
import ingredient.MozzarellaCheese;
import ingredient.PlumTomatoSauce;
import ingredient.ThickCrustDough;
import ingredient.abstrct.*;
import ingredientfactory.abstrct.IngredientFactory;

public class ChicagoPizzaIngredientFactory implements IngredientFactory {
    public Dough createDough() { return new ThickCrustDough(); }
    public Cheese createCheese() { return new MozzarellaCheese(); }
    public Sauce createSauce() { return new PlumTomatoSauce(); }
    public Veggies[] createVeggies() { return new Veggies[0]; }
    public Clams createClams() { return new FrozenClams(); }
}

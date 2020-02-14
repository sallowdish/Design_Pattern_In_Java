package ingredientfactory.abstrct;

import ingredient.abstrct.*;

public interface IngredientFactory {
    public Dough createDough();
    public Cheese createCheese();
    public Sauce createSauce();
    public Veggies[] createVeggies();
    public Clams createClams();
}

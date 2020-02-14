import ingredient.FrozenClams;
import ingredient.MozzarellaCheese;
import ingredient.PlumTomatoSauce;
import ingredient.ThickCrustDough;
import ingredient.abstrct.*;

public class ChicagoPizzaIngredientFactory implements IngredientFactory {
    public Dough createDough() { return new ThickCrustDough(); }
    public Cheese createCheese() { return new MozzarellaCheese(); }
    public Sauce createSauce() { return new PlumTomatoSauce(); }
    public Veggies[] createVeggies() { return new Veggies[] {}; }
    public Clams createClams() { return new FrozenClams(); }
}

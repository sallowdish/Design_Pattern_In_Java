package pizza.abstrct;

import ingredient.abstrct.Cheese;
import ingredient.abstrct.Dough;
import ingredient.abstrct.Sauce;
import ingredientfactory.abstrct.IngredientFactory;

public abstract class Pizza {
	private IngredientFactory ingredientFactory; // override by subclasses
	protected String description = "";
	private Dough dough;
	private Sauce sauce;
	private Cheese cheese;

	public Pizza() {
		ingredientFactory = setIngredientFactory();
	}

	abstract IngredientFactory setIngredientFactory();

	String getDescription() {
		return description;
	}

	public void prepare() {
		System.out.println("Preparing " + getDescription());
		dough = ingredientFactory.createDough();
		cheese = ingredientFactory.createCheese();
		sauce = ingredientFactory.createSauce();
		System.out.println(
				String.format(
						"We get: %s, %s and %s",
						dough.getDescription(),
						cheese.getDescription(),
						sauce.getDescription()));
	}

	public void cook() {
		System.out.println("Baking " + getDescription());
	}

	public void cut() {
		System.out.println("Cutting " + getDescription());
	}

	public void box() {
		System.out.println("Boxing " + getDescription());
	}
}
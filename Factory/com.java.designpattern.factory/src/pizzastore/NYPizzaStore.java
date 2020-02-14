package pizzastore;

import org.jetbrains.annotations.NotNull;
import pizza.NYCheesePizza;
import pizza.NYPlainPizza;
import pizza.NYVeggiePizza;
import pizza.abstrct.Pizza;
import pizzastore.abstrct.PizzaStore;

public class NYPizzaStore extends PizzaStore {
	public Pizza createPizza(@NotNull String pizzaType) {
		if (pizzaType.equals("cheese")) 
			return (new NYCheesePizza());
		else if (pizzaType.equals("veggie"))
			return (new NYVeggiePizza());
		else
			return (new NYPlainPizza());
	}
}
package pizzastore;

import pizza.*;
import pizza.abstrct.Pizza;
import pizzastore.abstrct.PizzaStore;

public class ChicagoPizzaStore extends PizzaStore {
	public Pizza createPizza(String pizzaType) {
		if (pizzaType.equals("cheese")) 
			return (new ChicagoCheesePizza());
		else if (pizzaType.equals("veggie"))
			return (new ChicagoVeggiePizza());
		else
			return (new ChicagoPlainPizza());
	}
}
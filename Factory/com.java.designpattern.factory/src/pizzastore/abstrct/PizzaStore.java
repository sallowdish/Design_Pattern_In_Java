package pizzastore;

import pizza.Pizza;

public abstract class PizzaStore {
	public void orderPizza(String pizzaType) {
		Pizza p = createPizza(pizzaType);

		p.prepare();
		p.cook();
		p.cut();
		p.box();
	}

	abstract Pizza createPizza(String pizzaType);
}
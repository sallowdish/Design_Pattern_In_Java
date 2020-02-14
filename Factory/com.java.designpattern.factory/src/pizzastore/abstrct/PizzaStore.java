package pizzastore.abstrct;

import org.jetbrains.annotations.NotNull;
import pizza.abstrct.Pizza;

public abstract class PizzaStore {
	public void orderPizza(String pizzaType) {
		Pizza p = createPizza(pizzaType);

		p.prepare();
		p.cook();
		p.cut();
		p.box();
	}

	public abstract Pizza createPizza(@NotNull String pizzaType);
}
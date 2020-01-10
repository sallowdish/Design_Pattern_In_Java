public class NYPizzaStore extends PizzaStore {
	public Pizza createPizza(String pizzaType) {
		if (pizzaType.equals("cheese")) 
			return (new NYCheesePizza());
		else if (pizzaType.equals("veggie"))
			return (new NYVeggiePizza());
		else
			return (new NYPlainPizza());
	}
}
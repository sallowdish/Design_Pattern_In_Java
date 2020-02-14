import pizzastore.abstrct.PizzaStore;
import pizzastore.*;

public class Main {
	public static void main(String[] args) {
		PizzaStore NYPizzaStore = new NYPizzaStore(), chicagoPizzaStore = new ChicagoPizzaStore(); // concrete class
		NYPizzaStore.orderPizza("cheese");
		chicagoPizzaStore.orderPizza("cheese");
		NYPizzaStore.orderPizza("veggie");
		chicagoPizzaStore.orderPizza("veggie");
		NYPizzaStore.orderPizza("whatever");
	}
}
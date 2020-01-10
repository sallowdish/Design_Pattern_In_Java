public class TestPizzaStore {
	public static void main(String[] args) {
		PizzaStore newyorkPS = new NYPizzaStore(), chicagoPS = new ChicagoPizzaStore();
		newyorkPS.orderPizza("cheese");
		chicagoPS.orderPizza("cheese");
		newyorkPS.orderPizza("veggie");
		chicagoPS.orderPizza("veggie");
		newyorkPS.orderPizza("whatever");
	}
}
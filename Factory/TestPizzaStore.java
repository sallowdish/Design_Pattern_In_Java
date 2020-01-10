public class TestPizzaStore {
	public static void main(String[] args) {
		PizzaStore ps = new NYPizzaStore();
		ps.orderPizza("cheese");
		ps.orderPizza("veggie");
		ps.orderPizza("whatever");
	}
}
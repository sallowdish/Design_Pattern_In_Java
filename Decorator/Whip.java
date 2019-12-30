public class Whip extends CondimentDecorator {
	private Beverage wrapperedObject;

	public Whip(Beverage baseBeverage) {
		this.wrapperedObject = baseBeverage;
	}

	public String getDescription() {
		return "Adding whip on top...";
	}

	public double cost() {
		return 0.10 + wrapperedObject.cost();
	}
}
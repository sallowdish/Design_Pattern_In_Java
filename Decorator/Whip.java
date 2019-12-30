public class Whip extends CondimentDecorator {
	private Beverage wrapperedObject;

	public Whip(Beverage baseBeverage) {
		this.wrapperedObject = baseBeverage;
	}

	public String getDescription() {
		return String.format("whipping cream on top of %s", wrapperedObject.getDescription());
	}

	public double cost() {
		return 0.10 + wrapperedObject.cost();
	}
}
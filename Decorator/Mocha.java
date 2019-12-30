public class Mocha extends CondimentDecorator {
	private Beverage baseBeverage;

	public Mocha(Beverage baseBeverage) {
		this.description = "some dark, thick mocha";
		this.baseBeverage = baseBeverage;
	}

	public String getDescription() {
		return String.format("%s blended in %s", this.description, baseBeverage.getDescription());
	}

	public double cost() {
		return 0.20 + this.baseBeverage.cost();
	}
}
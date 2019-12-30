public class Soy extends CondimentDecorator {
	private Beverage baseBeverage;

	public Soy(Beverage baseBeverage) {
		this.description = "some sweet sweet soy milk";
		this.baseBeverage = baseBeverage;
	}

	public String getDescription() {
		return String.format("%s mixed into %s", this.description, baseBeverage.getDescription());
	}

	public double cost() {
		return 0.15 + this.baseBeverage.cost();
	}
}
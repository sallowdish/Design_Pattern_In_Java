public class Soy extends CondimentDecorator {
	private Beverage baseBeverage;

	public Soy(Beverage baseBeverage) {
		this.description = "some sweet sweet soy milk mixed into";
		this.baseBeverage = baseBeverage;
	}

	public String getDescription() {
		return this.description + ' ' + baseBeverage.getDescription();
	}

	public double cost() {
		return 0.15 + this.baseBeverage.cost();
	}
}
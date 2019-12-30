public abstract class Beverage {
	private String description = "Some unknown beverage.";

	public String getDescription() {
		return this.description;
	}

	public abstract double cost();
}
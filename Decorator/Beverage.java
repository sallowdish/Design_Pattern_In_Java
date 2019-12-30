public abstract class Beverage {
	String description = "some unknown beverage";

	public String getDescription() {
		return this.description;
	}

	public abstract double cost();
}
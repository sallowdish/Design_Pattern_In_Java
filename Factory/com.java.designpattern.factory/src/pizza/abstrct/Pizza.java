package pizza;

public abstract class Pizza {
	protected String description = "";

	public String getDescription() {
		return description;
	}

	public void prepare() {
		System.out.println("Preparing " + getDescription());
	}

	public void cook() {
		System.out.println("Baking " + getDescription());
	}

	public void cut() {
		System.out.println("Cutting " + getDescription());
	}

	public void box() {
		System.out.println("Boxing " + getDescription());
	}
}
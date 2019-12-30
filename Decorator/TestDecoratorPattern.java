public class TestDecoratorPattern {

	public static void main(String[] args) {
		TestDecoratorPattern testInst = new TestDecoratorPattern();
		testInst.runTest();
	}

	private void runTest() {
		lazyPrint("Making a double mocha soy latte with whipping cream...");

		Beverage baseBeverage = new HouseBlend();
		lazyPrint("Grabbed a cup of HouseBlend as base...total cost is %f", baseBeverage.cost());

		Beverage whippedBeverage = new Whip(baseBeverage);
		lazyPrint("Added %s on top of %s...total cost is %f", whippedBeverage.getDescription(), baseBeverage.getDescription(), whippedBeverage.cost());
	}

	private void lazyPrint(String s) {
		System.out.println(s);	
	}

	private void lazyPrint(String s, Object ... formattArgs) {
		if (formattArgs.length > 0) {
			s = String.format(s, formattArgs);
		}
		lazyPrint(s);	
	}
}
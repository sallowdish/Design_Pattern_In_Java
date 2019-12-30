public class TestDecoratorPattern {

	public static void main(String[] args) {
		TestDecoratorPattern testInst = new TestDecoratorPattern();
		testInst.runTest();
	}

	private void runTest() {
		lazyPrint("Making a double mocha soy latte with whipping cream...");

		Beverage baseBeverage = new HouseBlend();
		lazyPrint("Grabbed a cup of %s as base...total cost is %f", baseBeverage.getDescription(), baseBeverage.cost());

		baseBeverage = addCondiment(baseBeverage, Whip.class);
		baseBeverage = addCondiment(baseBeverage,  Soy.class);

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

	private Beverage addCondiment(Beverage baseBeverage, Class<? extends CondimentDecorator> c) {
		Beverage newDrink = null;
		try 
		{
			newDrink = c.getDeclaredConstructor(Beverage.class).newInstance(baseBeverage);
		}
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
			System.exit(-1);
		}
		finally
		{
			lazyPrint("Added %s...total cost is %f", newDrink.getDescription(), newDrink.cost());
			return newDrink;
		} 
	}
}
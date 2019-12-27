public class TestObserverPatter {
	public static void main(String[] args) {
		WeatherData s = new WeatherData();

		Display currWeatherDisplay = new CurrentWeatherDisplay(s);

		currWeatherDisplay.display();

		s.setTemperature(10);

		s.setHumidity(69);
	}
}
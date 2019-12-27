public class TestObserverPatter {
	public static void main(String[] args) {
		WeatherData s = new WeatherData();

		Display currWeatherDisplay = new CurrentWeatherDisplay(s);
		Display weatherStatsDispaly = new WeatherStatsDisplay(s);

		currWeatherDisplay.display();
		weatherStatsDispaly.display();

		s.setTemperature(10);

		s.setHumidity(69);

		s.setPressure(0.8f);

		s.setTemperature(15);

		s.setPressure(1.1f);
	}
}
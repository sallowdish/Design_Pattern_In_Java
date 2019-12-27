public class WeatherStatsDisplay implements Observer, Display {
	private String id;
	private float avgTemperature;
	private int temperatureCount;
	private float avgHumidity;
	private int humidityCount;
	private float avgPressure;
	private int pressureCount;

	private Subject weatherData;

	public WeatherStatsDisplay(Subject s) {
		this.weatherData = s;
		this.id = s.register(this);
	}

	public void update(float temperature, float humidity, float pressure) {
		System.out.printf("%s:\tReceive message from subject.\n", this.id);

		if (temperature != 0.0f) {
			this.temperatureCount += 1;
			this.avgTemperature = (this.avgTemperature + temperature) / this.temperatureCount;
		}
		
		if (humidity != 0.0f) {
			this.humidityCount += 1;
			this.avgHumidity = (this.avgHumidity + humidity) / this.humidityCount;
		}

		if (pressure != 0.0f) {
			this.pressureCount += 1;
			this.avgPressure = (this.avgPressure + pressure) / this.pressureCount;
		}

		this.display();
	}

	public void display() {
		System.out.println("---\tThis is Dispaly " + this.id + "\t---");
		System.out.println("---\tWeather Stats Display\t---");
		if(this.avgTemperature != 0.0f)
			System.out.println(
				String.format(
					"---\t Avg Temperature: %.1fC over %d historical record(s)\t---", this.avgTemperature, this.temperatureCount));
		if (this.avgHumidity != 0.0f)
			System.out.println(
				String.format(
					"---\t Avg Humidity: %.1f%% over %d historical record(s)\t---", this.avgHumidity, this.humidityCount));
		if (this.avgPressure != 0.0f)
			System.out.println(
				String.format(
					"---\t Avg Pressure: %.2fPa over %d historical record(s)\t---", this.avgPressure, this.pressureCount));
		System.out.println();
	}
}
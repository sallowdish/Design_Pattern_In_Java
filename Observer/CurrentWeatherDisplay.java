public class CurrentWeatherDisplay implements Observer, Display {
	private String id;
	private float temperature;
	private float humidity;
	private Subject weatherData = null;

	public CurrentWeatherDisplay (Subject subj) {
		this.weatherData = subj;
		this.id = subj.register(this);
	}

	public void update(float temperature, float humidity, float pressure) {
		System.out.printf("%s:\tReceive message from subject.\n", this.id);
		if (temperature != 0.0f)
			this.temperature = temperature;
		if (humidity != 0.0f)
			this.humidity = humidity;
		this.display();
	}

	public void display() {
		System.out.println("---\tThis is Dispaly " + this.id + "\t---");
		System.out.println("---\tCurrent Weather Display\t---");
		if(this.temperature != 0.0f)
			System.out.println("---\tTemperature: " + this.temperature +"C\t---");
		if (this.humidity != 0.0f)
			System.out.println("---\tHumidity: " + this.humidity + "%\t---");
		System.out.println();
	}
}
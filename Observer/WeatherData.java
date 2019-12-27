import java.util.HashMap;
import java.util.UUID;

public class WeatherData implements Subject {
	private HashMap<String, Observer> listeners;
	private float temperature;
	private float humidity;
	private float pressure;

	public WeatherData() {
		this.listeners = new HashMap<String, Observer>();
	}

	public String register(Observer o) {
		String key = UUID.randomUUID().toString();
		listeners.put(key, o);
		return key;
	}

	public void unRegister(String key) {
		listeners.remove(key);
	}

	public void notifyUpdate() {
		for (Observer o : listeners.values()) {
			o.update(this.temperature, this.humidity, this.pressure);
		}
	}

	public void setTemperature(float newTemp) {
		this.temperature = newTemp;
		this.notifyUpdate();
	}

	public void setHumidity(float newHumidity) {
		this.humidity = newHumidity;
		this.notifyUpdate();
	}
}
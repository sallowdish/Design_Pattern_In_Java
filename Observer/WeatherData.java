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
		notifyUpdate(0b111);
	}

	private void notifyUpdate(int flag) {
		for (Observer o : listeners.values()) {
			o.update(
				this.temperature*(flag & 0b001), 
				this.humidity*((flag & 0b010) >> 1), 
				this.pressure*((flag & 0b100) >> 2)
				);
		}
	}

	public void setTemperature(float newTemp) {
		this.temperature = newTemp;
		this.notifyUpdate(0b001);
	}

	public void setHumidity(float newHumidity) {
		this.humidity = newHumidity;
		this.notifyUpdate(0b010);
	}

	public void setPressure(float newPressure) {
		this.pressure = newPressure;
		this.notifyUpdate(0b100);
	}
}
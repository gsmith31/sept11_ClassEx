/*
 * WeatherData.java 1.0 Sep 10, 2014
 *
 * Copyright (c) 2014 HFDP and DJP
 */
package headfirst.seniorstudent2;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

/**
 * Observable (Subject) broadcasts out pressure, temperature and humidity to all
 * Observer
 * 
 * @author dpowell2
 * @version 1.0
 * 
 */
public class WeatherData extends Observable implements Serializable {

	private float humidity;
	private transient ArrayList<Observer> observers;
	private float pressure;
	private float temperature;

	/**
	 * Initializes empty list of Observers
	 */
	public WeatherData() {
		// observers = new ArrayList<Observer>();
	}

	public float getHumidity() {
		return humidity;
	}

	public float getPressure() {
		return pressure;
	}

	public float getTemperature() {
		return temperature;
	}

	public void measurementsChanged() {
		// System.out.println(this.toString());
		setChanged();
		notifyObservers();
	}

	public void setMeasurements(float temperature, float humidity,
			float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}

	@Override
	public String toString() {
		String s = "temperature: " + temperature;
		s = s + "\n" + "humidity: " + humidity;
		s = s + "\n" + "pressure: " + pressure;
		return s;
	}
}

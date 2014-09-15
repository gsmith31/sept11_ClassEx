package headfirst.seniorstudent2;

import static org.junit.Assert.*;

import java.util.Observable;
import java.util.Observer;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class WeatherDataTest {
	
	private WeatherData data;
	private CurrentConditionsDisplay display1;
	private CurrentConditionsDisplay display2;
	private CurrentConditionsDisplay display3;
	private CurrentConditionsDisplay display4;
	private Humidity hum;
	
	public class Humidity implements Observer {
		
		private float humidity;
		
		
		public Humidity(WeatherData aData){
			aData.addObserver(this);
		}
		
		public float getHumidity(){
			return humidity;
		}

		@Override
		public void update(Observable o, Object arg) {
			 humidity = ((WeatherData) o).getHumidity();
			
			
		}
		
	}

	
	@Before
	public void runBeforeTests(){
		data = new WeatherData();
		hum = new Humidity(data);
		display1 = new CurrentConditionsDisplay(data, 10,10);
		display2 = new CurrentConditionsDisplay(data, 10,10);
		display3 = new CurrentConditionsDisplay(data, 10,10);
		display4 = new CurrentConditionsDisplay(data, 10,10);
	}
	
	@Test
	public void testSetMeasurments(){
		data.setMeasurements(10, 20, 30);
		float humidityActual = hum.getHumidity();
		assertEquals(humidityActual, 20,.000001);
	}

	@Test
	public void testAddObserver(){
		data.addObserver(display1);
		data.addObserver(display2);
		data.addObserver(display3);
		data.addObserver(display4);
		int numObservers = data.countObservers();
		assertEquals(5,numObservers,0);
	}
	@Test
	public void testDeleteObserver(){
		data.addObserver(display1);
		data.addObserver(display2);
		data.addObserver(display3);
		data.addObserver(display4);
		data.deleteObserver(display1);
		int numObservers = data.countObservers();
		assertEquals(4,numObservers);
	}
	@After 
	public void runAftertest(){
		data = null;
	}
	

	

}

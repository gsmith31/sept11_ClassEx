/*
 * CurrentConditionsDisplay.java 1.0 Sep 10, 2014
 *
 * Copyright (c) 2014 HFDP
 */
package headfirst.seniorstudent2;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class CurrentConditionsDisplay extends JFrame implements Observer{

  private JTextField humidityTextField;
  private JTextField pressureTextField;
  private JTextField temperatureTextField;
  private Observable observable;

  public CurrentConditionsDisplay(Observable obvservable, int i, int j) {
    this.setTitle("Current Conditions");
    this.observable = obvservable;
    observable.addObserver(this);
    this.setLocation(i,j);
    // Key to register his observer with Observable.
    
    createGui();
    this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    this.addWindowListener(new WindowAdapter() {
      /**
       * Remove the observer from the Subject so no attempt is made by
       * Subject to nofify a non existing instance that is closed
       */
      @Override
      public void windowClosing(WindowEvent e) {
        System.out.println("Removed observer");
        removeTheObserver();
      }
    });
    this.pack();
    this.setVisible(true);
  }




  private void createGui() {
    Container container = this.getContentPane();
    JPanel holdGrid = new JPanel();
    JPanel leftGrid = new JPanel();
    JPanel rightGrid = new JPanel();

    leftGrid.setLayout(new GridLayout(3, 1));
    leftGrid.add(new JLabel("Current Temperature ", SwingConstants.RIGHT));
    leftGrid.add(new JLabel("Current Humidity ", SwingConstants.RIGHT));
    leftGrid.add(new JLabel("Current Pressure ", SwingConstants.RIGHT));

    rightGrid.setLayout(new GridLayout(3, 1));
    rightGrid.add(temperatureTextField = new JTextField("0", 10));
    rightGrid.add(humidityTextField = new JTextField("0", 10));
    rightGrid.add(pressureTextField = new JTextField("0", 10));

    holdGrid.setLayout(new BorderLayout(5, 0));
    holdGrid.add(leftGrid, BorderLayout.WEST);
    holdGrid.add(rightGrid, BorderLayout.CENTER);
    container.add(holdGrid, BorderLayout.CENTER);
  }
  
  

  private void removeTheObserver() {
    observable.deleteObserver(this);
  }



@Override
public void update(Observable o, Object arg) {
		WeatherData data =  (WeatherData) o;
		String temp = "";
		this.temperatureTextField.setText(temp + data.getTemperature());
		this.humidityTextField.setText(temp + data.getHumidity());
		this.pressureTextField.setText(temp + data.getPressure());

		
	
	
}

}

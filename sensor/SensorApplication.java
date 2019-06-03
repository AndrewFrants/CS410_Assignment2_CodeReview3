package sensor;

import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

/**
 * @author andreyf
 * Adapted from Assigment 2
 */
public class SensorApplication extends JFrame {
	
	public SensorApplication() throws InterruptedException {
		setTitle("Sensor Tracker");
		setLayout(new GridLayout(3,1));
	
		JPanel  temperaturePnl = new JPanel();
		temperaturePnl.setBorder(new TitledBorder("Temperature"));
		add(temperaturePnl);
		
		JPanel  pressurePnl = new JPanel();
		pressurePnl.setBorder(new TitledBorder("Pressure"));
		pressurePnl.setAlignmentX(1);
		add(pressurePnl);
		
		JPanel  radiationPnl = new JPanel();
		radiationPnl.setBorder(new TitledBorder("Radiation"));
		add(radiationPnl);
		
		setPreferredSize(new Dimension(600,600));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		pack();
		
		// Three bars
		BarDrawer bar1 = new SwingBarDrawerAdapter();
		BarDrawer bar2 = new SwingBarDrawerAdapter();
		BarDrawer bar3 = new SwingBarDrawerAdapter();
		
		// Three sensors
		SensorAdapter adap1 = new TemperatureSensorAdapter();
		SensorAdapter adap2 = new PressureSensorAdapter();
		SensorAdapter adap3 = new RadiationSensorAdapter();
		
		do {
			bar1.drawBar(temperaturePnl, 1, 1, adap1.read(), 1);
			bar2.drawBar(pressurePnl,  1, 1, adap2.read(), 100);
			bar3.drawBar(radiationPnl, 1, 1, adap3.read(), 100);
			
			this.repaint();
			
			Thread.sleep(1000);
		} while (true);
	}

	public static void main(String[] args) {
		try {
			SensorApplication app = new SensorApplication();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

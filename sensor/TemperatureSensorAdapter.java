/**
 * 
 */
package sensor;

/**
 * @author andreyf
 * Adapter implementation
 */
public class TemperatureSensorAdapter implements SensorAdapter {
	
	TemperatureSensor sensor;
	
	public TemperatureSensorAdapter() {
		sensor = new TemperatureSensor();
	}

	@Override
	public double read() {

		return sensor.senseTemperature();
	}

}

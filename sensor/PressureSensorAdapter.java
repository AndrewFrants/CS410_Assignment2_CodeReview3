/**
 * 
 */
package sensor;

/**
 * @author andreyf
 * Adapter implementation
 */
public class PressureSensorAdapter implements SensorAdapter {
	
	PressureSensor sensor;
	
	public PressureSensorAdapter() {
		sensor = new PressureSensor();
	}

	@Override
	public double read() {

		return sensor.readValue();
	}

}

/**
 * 
 */
package sensor;

/**
 * @author andreyf
 * Adapter implementation
 */
public class RadiationSensorAdapter implements SensorAdapter {
	
	RadiationSensor sensor;
	
	public RadiationSensorAdapter() {
		sensor = new RadiationSensor();
	}

	@Override
	public double read() {

		return sensor.getRadiationValue();
	}

}

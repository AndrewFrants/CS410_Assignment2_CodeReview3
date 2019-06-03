/**
 * 
 */
package sensor;

/**
 * @author andreyf
 * This is the interface for a sensor adapter
 * we will have 3 concrete adapters reading the
 * data.
 */
public interface SensorAdapter {
	double read();
}

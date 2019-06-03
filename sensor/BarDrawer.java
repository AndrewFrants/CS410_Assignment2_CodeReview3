/**
 * 
 */
package sensor;

import java.awt.Color;

import javax.swing.JPanel;

/**
 * @author andreyf
 * Interface to draw a bar on JPanel
 */
public interface BarDrawer {

	void drawBar(JPanel pnl, int x, int y, double value, int multiplier);
}

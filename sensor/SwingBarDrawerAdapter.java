/**
 * 
 */
package sensor;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.*;

/**
 * @author andreyf
 * Adapter implementation for drawing on JPanel
 */
public class SwingBarDrawerAdapter extends JPanel implements BarDrawer {

   private int x;
   private int y;
   private int width;
   private int multiplier;
   private int height = 50;
   private Color color;
   
   @Override
   protected void paintComponent(Graphics g) {
	   super.paintComponent(g);
	   if (width == 0) {
		   g.setColor(color);
	   } else {
		   g.setColor(Color.black);
	   }
  
	   g.drawString("Sensor : " + width, x + 10, y + 10);
  
	   g.setColor(color);
	   g.fillRect(x + 20, y + 20, width * multiplier, height);
	}

	@Override
	public Dimension getPreferredSize() {
    	return new Dimension(500, 300);
	}

	@Override
	public void drawBar(JPanel pnl, int x, int y, double value, int multiplier) {
		
		if (value * multiplier > 400) {
			this.color = Color.red;
		}
		else if (value * multiplier >= 200) {
			this.color = Color.yellow;
		}
		else if (value * multiplier < 200) {
			this.color = Color.green;
		}
		
		this.x = x;
		this.y = y;
		this.width = (int)value; // same as floor
		this.multiplier = multiplier;
		
		pnl.add(this);
	}
}
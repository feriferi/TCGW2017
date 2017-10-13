package dessin;

import java.awt.*;
import javax.swing.*;

/* Le code de la classe JCanvas dessine un carré rouge et'un rond bleu */

public class JCanvas extends JPanel {
	
	public void paint(Graphics g) {
		super.paint(g);
		Color c = g.getColor();
		g.setColor(Color.GREEN);
		g.fillRect(10,10,80,80);
		g.setColor(Color.GRAY);
		g.fillOval(150,50,80,80);
		g.setColor(c);
	}

}
                
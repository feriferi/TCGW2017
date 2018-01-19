package dessin;

import java.awt.*;
import javax.swing.*;

/* Le code de la classe JCanvas dessine un carré rouge et'un rond bleu */

public class JCanvas extends JPanel {
	
	public void paintF(Graphics g) {
		super.paint(g);
		Color c = g.getColor();
		g.setColor(Color.GREEN);
		g.fillRect(10,10,80,80);
		g.setColor(Color.GRAY);
		g.fillOval(150,50,80,80);
		g.setColor(c);
	}
	public void paint(Graphics g) {
		super.paint(g);
		Color c = g.getColor();
		g.setColor(Color.CYAN);
		g.fillOval(10,10,80,80);
		g.setColor(Color.GRAY);
		g.fillOval(40,0,80,80);
		g.setColor(Color.CYAN);
		g.fillOval(70,10,80,80);
		g.setColor(Color.GRAY);
		g.fillOval(80,40,80,80);
		g.setColor(Color.CYAN);
		g.fillOval(70,70,80,80);
		g.setColor(Color.GRAY);
		g.fillOval(40,80,80,80);
		g.setColor(Color.CYAN);
		g.fillOval(10,70,80,80);
		g.setColor(Color.GRAY);
		g.fillOval(0,40,80,80);
		g.setColor(c);
	}

}
                
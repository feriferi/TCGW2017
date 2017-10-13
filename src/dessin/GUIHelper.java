package dessin;


import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JComponent;
import javax.swing.JFrame;

/*la classe GUIHelper, qui contient le code permettant de mettre notre panneau dans une frame, 
  et de la faire se montrer à l'écran*/

public class GUIHelper {
	
	public static void showOnFrame(JComponent component, String frameName) {
		JFrame frame = new JFrame(frameName);
		WindowAdapter wa = new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		};
		frame.addWindowListener(wa);
		frame.getContentPane().add(component);
		frame.pack();
		frame.setVisible(true);
	}

}
package dessin;

import java.awt.*;
/*un exemple de code permettant d'utiliser la classe JCanvas*/
public class Demo1 {
	
	public static void main(String[] args) {
		JCanvas jc = new JCanvas();
		jc.setBackground(Color.WHITE);
		jc.setPreferredSize(new Dimension(400,200));
		GUIHelper.showOnFrame(jc,"test");
	}

}
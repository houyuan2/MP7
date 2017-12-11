import javax.swing.*;

public class Main {
	public static void main (String [] args){
		GUIWindow theGUI = new GUIWindow ();
		theGUI.setTitle("Projectile Motion Calculator");
		theGUI.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		theGUI.pack();
		theGUI.setVisible (true);
		theGUI.init();
	}
}




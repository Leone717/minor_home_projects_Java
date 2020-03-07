package salutonswing;

import javax.swing.*;

public class SalutonSwing extends JFrame {
	public SalutonSwing() {
		super("Saluton Mondo");
		setSize(750, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] arguments) {
		SalutonSwing sal = new SalutonSwing();
	}
}
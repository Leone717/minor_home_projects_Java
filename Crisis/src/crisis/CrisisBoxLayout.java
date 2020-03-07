package crisis;

import java.awt.*;
import javax.swing.*;

public class CrisisBoxLayout extends JFrame{
	JButton panicButton = new JButton("Panic");
	JButton DontPanicButton = new JButton("Don't Panic");
	JButton blameButton = new JButton("Blame Others");
	JButton mediaButton = new JButton("Notify the Media");
	JButton saveButton = new JButton("Save Yourself");
	
	public CrisisBoxLayout() {
		super("CrisisFlowLayout");
		setSize(308,200);			//a t�rol� m�rete
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel pane = new JPanel();
		BoxLayout box = new BoxLayout(pane, BoxLayout.Y_AXIS);					//BALR�L JOBBRA RENDEZI AZ ELEMEKET
		pane.setLayout(box);	
		pane.add(panicButton);
		pane.add(DontPanicButton);
		pane.add(blameButton);
		pane.add(mediaButton);
		pane.add(saveButton);
		add(pane);
		
		setVisible(true);
	}
	
	public static void main(String[] arguments) {
		CrisisBoxLayout cr = new CrisisBoxLayout();
	}
}

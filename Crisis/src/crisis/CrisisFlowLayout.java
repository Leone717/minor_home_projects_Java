package crisis;

import java.awt.*;
import javax.swing.*;

public class CrisisFlowLayout extends JFrame{
	JButton panicButton = new JButton("Panic");
	JButton DontPanicButton = new JButton("Don't Panic");
	JButton blameButton = new JButton("Blame Others");
	JButton mediaButton = new JButton("Notify the Media");
	JButton saveButton = new JButton("Save Yourself");
	
	public CrisisFlowLayout() {
		super("CrisisFlowLayout");
		setSize(308,128);			//a t�rol� m�rete
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		FlowLayout flo = new FlowLayout();					//BALR�L JOBBRA RENDEZI AZ ELEMEKET
		setLayout(flo);	
		add(panicButton);
		add(DontPanicButton);
		add(blameButton);
		add(mediaButton);
		add(saveButton);
		setVisible(true);
	}
	
	public static void main(String[] arguments) {
		CrisisFlowLayout cr = new CrisisFlowLayout();
	}
}

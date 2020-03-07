package crisis;

import java.awt.*;
import javax.swing.*;

public class CrisisBorderLayout extends JFrame{
	JButton panicButton = new JButton("Panic");
	JButton DontPanicButton = new JButton("Don't Panic");
	JButton blameButton = new JButton("Blame Others");
	JButton mediaButton = new JButton("Notify the Media");
	JButton saveButton = new JButton("Save Yourself");
	
	public CrisisBorderLayout() {
		super("CrisisFlowLayout");
		setSize(360,128);			//a t�rol� m�rete
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		BorderLayout bord = new BorderLayout();					//A KOMPONENSEKET MEGHAT�ROZOTT HELYEKEN JELEN�TI MEG 
		setLayout(bord);	
		add(panicButton, BorderLayout.NORTH);
		add(DontPanicButton, BorderLayout.SOUTH);
		add(blameButton, BorderLayout.EAST);
		add(mediaButton, BorderLayout.WEST);
		add(saveButton, BorderLayout.CENTER);
		setVisible(true);
	}
	
	public Insets getInsets() {
		Insets squeeze = new Insets(50, 15, 5, 15);
		return squeeze;
	}
	
	public static void main(String[] arguments) {
		CrisisBorderLayout cr = new CrisisBorderLayout();
	}
}

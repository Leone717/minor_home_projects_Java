package crisis;

import java.awt.*;
import javax.swing.*;

public class CrisisGridLayout extends JFrame{
	JButton panicButton = new JButton("Panic");
	JButton DontPanicButton = new JButton("Don't Panic");
	JButton blameButton = new JButton("Blame Others");
	JButton mediaButton = new JButton("Notify the Media");
	JButton saveButton = new JButton("Save Yourself");
	
	public CrisisGridLayout() {
		super("CrisisFlowLayout");
		setSize(308,128);			//a t�rol� m�rete
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridLayout grid = new GridLayout(2, 3);					//SOROKBA �S OSZLOPOKBA RENDEZI A KOMPONENESEKET(EGYFORMA M�RET)
		setLayout(grid);	
		add(panicButton);
		add(DontPanicButton);
		add(blameButton);
		add(mediaButton);
		add(saveButton);
		setVisible(true);
	}
	
	public static void main(String[] arguments) {
		CrisisGridLayout cr = new CrisisGridLayout();
	}
}

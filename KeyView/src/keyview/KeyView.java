package keyview;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class KeyView extends JFrame implements KeyListener {
	
	JTextField keyText = new JTextField(80);
	JLabel keyLabel = new JLabel("Press any key in the text field:");
	
	KeyView() {
		super("KeyView");
		setSize(350, 100);			//a t�rol� m�rete
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		keyText.addKeyListener(this);
		BorderLayout bord = new BorderLayout();					//A KOMPONENSEKET MEGHAT�ROZOTT HELYEKEN JELEN�TI MEG 
		setLayout(bord);	
		add(keyLabel, BorderLayout.NORTH);
		add(keyText, BorderLayout.CENTER);
		setVisible(true);
	}
	
        @Override
	public void keyPressed(KeyEvent input) {		//egy billenty� BENYOM�SAKOR h�v�dik meg
		char key = input.getKeyChar();
		keyLabel.setText("You pressed " + key);
	}
	
        @Override
	public void keyReleased(KeyEvent txt) {			//egy billenty� FELENGED�SEKOR h�v�dik meg
		//nem csin�lunk semmit
	}
	
        @Override
	public void keyTyped(KeyEvent txt) {			//egy billenty� BENYOM�SA, majd FELENGED�SE ut�n
		//nem csin�lunk semmit
	}
	
	public static void main(String[] arguments) {
		KeyView frame = new KeyView();
	}
}
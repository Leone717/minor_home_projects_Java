package blanksapplet;

import java.awt.Graphics;		//import�ljuk a Graphics

public class BlanksApplet extends javax.swing.JApplet {	//�r�k�ltetj�k az JApplet tulajdons�gait(f�ggv�nyeket)
	String parameter1;	
	String parameter2;									//bevezet�nk 3db String v�ltoz�t
	String parameter3;
	
	public void init () {								//bevezet�nk egy init f�ggv�nyt mely param�terknek �rt�ket ad
		parameter1 = getParameter("adjective1");
		parameter2 = getParameter("adjective2");		//a param�tereknek "adjective" �rt�ket k�r�nk be inputban
		parameter3 = getParameter("adjective3");
	}
	
	public void paint (Graphics screen) {			// paint fgv mely haszn�lja a Graphics screen nev� objektum�t
		screen.drawString(" The " + parameter1		//screen objektumhoz a drawString fgbt h�vj�k mely ki�r 
				+ " " + parameter2 + "fox"
				+ " jumped over the "
				+ parameter3 + " dog.", 5, 50);
	}
}

package bounce;

import java.awt.*;										//import�ljuk a sz�ks�ges csomagokat
import javax.swing.*;


public class Bounce_1 extends JFrame {					//Bounce keret l�trehoz�sa
	public Bounce_1() {									//Bounce fgv l�trehoz�sa
		super("Tennis");								//Tennis lesz az ablak neve
		setSize(550, 450);								//ablak m�ret�nek meghat�roz�sa
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//ablak bez�r�s egy�b gombok meghat�roz�sa
		BouncePanel boing = new BouncePanel();			//�j Bouncepanel l�trehoz�a						**ezzel a boing BouncePanel objektummal kapcsoljuk a m�sikhoz
		add(boing);										//Panel hozz�ad�sa a kerethez
		setVisible(true);								//l�that�v� t�tel
	}
	public static void main (String[] arguments) {		//main utas�t�s
		Bounce_1 frame = new Bounce_1();					//frame Bounce objektum
	}
}

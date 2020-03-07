package player;

import java.awt.*;											//sz�ks�ges csomagok import�l�sa
import javax.swing.*;

public class Player extends JFrame {						//JFrame oszt�ly �r�kl�se/KERETHEZ
	public Player() {										//Player fgv mely be�ll�tja a keretet
		super("Player");									//c�m megad�sa
		setSize(500, 700);									//keret m�ret�nek megad�da
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		//bez�r�s gombok hozz�ad�sa
		PlayerPanel fp = new PlayerPanel();					//fp Panel l�trehoz�sa
		add(fp);											//fp panel hozz�ad�a a kerethez
		setVisible(true);									//panel l�that�v� t�tele
	}
	
	public static void main(String[] arguments) {			//main v�grehajt� fgv a futtat�shoz
		Player fame = new Player();							//fame nev� Player objektum l�trehoz�sa
	}

}

class PlayerPanel extends JPanel {							//Jpanel oszt�ly �r�kl�se/PANELHEZ
	public PlayerPanel() {									//PlayerPanel l�trehoz�sa, mely tartalmazza a k�pet �s cimk�t
		ImageIcon player = new ImageIcon("C:\\Users\\Mike\\Documents\\NetBeansProjects\\Player\\src\\player\\jhonny-evers.jpg");//player k�p bek�r�se
		JLabel playerLabel = new JLabel(player);			//playerLabel k�sz�t�se a player objektumhoz
		add(playerLabel);									//playerLabel hozz�ad�sa panelhez
	}

	public void paintComponent(Graphics comp) {				//paintComponent l�trehoz�sa
		super.paintComponent(comp);							//a paincomponent fel�l�r�sa a bet�t�pusok kirajzol�s�hoz
		Graphics2D comp2D = (Graphics2D) comp;				//*comp2D l�trehoz�sa, mely a comp Graphics tulajdons�g�t is hordozza
		comp2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);//�LSIM�T�S
		int width = getSize().width;						//width �rt�k bek�r�se getSize() fgvel, 	panel JOBB SZ�LE
		int height = getSize().height;						//height �rt�k bek�r�se getSize() fgvel 	panel ALJA
		
		Font currentFont = new Font("Dialog", Font.BOLD, 18);//
		//cirremtFont nev�, font tipus� objektum, mely t�rolja a bet�t�pust(Dialog bet�tps, BOLD f�lk�v�r, 18as m�ret
		comp2D.setFont(currentFont);								//setFont fgvel a comp2D objektum v�ltoztat�sa
		comp2D.drawString("JHONNY EVERS", width - 155, height - 50);//a drawString fgvel a sz�veg, majd annnek elekyez�s�nek 
																	//be�ll�t�sa
																	//ablak jobb sz�l�t�l 155
																	//alj�t�l 50
		currentFont = new Font("Dialog", Font.ITALIC, 12);
		comp2D.setFont(currentFont);
		comp2D.drawString("second baseman", width - 155, height - 30);
		
		currentFont = new Font("Dialog", Font.PLAIN, 12);
		comp2D.setFont(currentFont);
		comp2D.drawString("CHICAGO CUBS", width - 155, height - 10);
	}
}

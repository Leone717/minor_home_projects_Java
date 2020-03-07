package sign;

import java.awt.*;										//import�ljuk a sz�ks�ges csomagokat, let�ltj�k a nu.xom futtat�s�hoz sz�ks�ges jart
import javax.swing.*;
import java.awt.geom.*;

public class Sign extends JFrame {								//keret oszt�ly l�trehoz�sa
	public Sign() { 
		super("Use of Compressed Air Prohibited");
		setSize(410, 435);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SignPanel sp = new SignPanel();
		add(sp);
		setVisible(true);
	}
	
	public static void main(String[] arguments) {
		Sign sign = new Sign();
	}
}

class SignPanel extends JPanel {								//panel oszt�ly l�trehoz�sa
	public void paintComponent(Graphics comp) {					//megh�vjuk a paintComponent f�ggv�nyt, comp Graphics objektummal		
	super.paintComponent(comp);									//a szuperoszt�lyra hivatkozunk, mikor haszn�ljuk a paintComponentet comp Graphics objektummal
	Graphics2D comp2D = (Graphics2D) comp;	//***a comp csak egy Graphics objektum, �gy l�tre kell hozni egy comp2D objejtumot bel�le ami m�r Graphics2D 
											//***tulajdons�gait is hordozza 
	comp2D.setColor(Color.white);			//az objektum h�tt�rsz�n�nek be�ll�t�sa, FEH�R
	comp2D.fillRect(0, 0, 400, 400);		//az objektum kit�ltend� m�retn�ek meghat�roz�sa, kezd� x,y  koordin�t�k �s sz�less�g, magass�g
	
	//a jel megrajozl�sa
	comp2D.setColor(Color.red);				//a comp2D objektum sz�n�nek be�ll�tsa, V�R�S
	Ellipse2D.Float sign1 = new Ellipse2D.Float(0F, 0F, 400F, 400F);//egy ellipszis l�trehoz�sa a kor�bban megadott panelm�retben, ez v�r�s k�r lesz
	comp2D.fill(sign1);						//kit�ltj�k v�r�s sz�nnel ezt a k�rt
	comp2D.setColor(Color.white);			//be�ll�tjuk a feh�r sz�nt
	Ellipse2D.Float sign2 = new Ellipse2D.Float(55F, 55F, 290F, 290F);//a v�r�s k�rben berajzolunk m�g egy k�rt, ez feh�rrel lesz kit�ltve, �gy v�r�s karika marad
	comp2D.fill(sign2);						//kit�ltetlj�k feh�r sz�nnel a k�r k�zep�t
	
	//az emberke megrajzol�sa
	comp2D.setColor(Color.black);			//fekete sz�nre �ll�tjuk a comp2D objektumot
	Ellipse2D.Float head = new Ellipse2D.Float(160F, 96F, 32F, 32F);//mivel a feje egy k�r, egy k�rt hozunk l�tre x,y kooridn�ta �s hozz� tartoz� t�glalap
	comp2D.fill(head);						//kit�ltj�k az eg�sz fej�t feket�re
	GeneralPath body = new GeneralPath();	//l�trehozzuk a test�t, ez egy rengeteg pontb�l �ll� soksz�g lesz
	body.moveTo(159F, 162F);				//kezd�pont meghat�roz�sa
	body.lineTo(119F, 303F);
	body.lineTo(139F, 303F);
	body.lineTo(168F, 231F);
	body.lineTo(190F, 303F);
	body.lineTo(213F, 303F);
	body.lineTo(189F, 205F);				//mozgatjuk a vonalakat, sarkok kookdin�t�ja szerint, �gy rajzolja ki a testet
	body.lineTo(203F, 162F);
	body.lineTo(247F, 151F);
	body.lineTo(236F, 115F);
	body.lineTo(222F, 118F);
	body.lineTo(231F, 140F);
	body.lineTo(141F, 140F);
	body.lineTo(101F, 190F);
	body.lineTo(112F, 197F);
	body.lineTo(144F, 162F);
	body.closePath();						//lez�rjuk a testet
	comp2D.fill(body);						//kit�ltetj�k a testet a meghat�rozott sz�nnel
	
	//a palack megrajzol�sa
	comp2D.setColor(Color.black);			//sz�n be�ll�t�sa
	comp2D.fillRect(251, 191, 33, 118);		//t�glalap1 m�ret�nek be�ll�tsa a palackban
	comp2D.fillRect(262, 160, 13, 31);		//t�glalap2 m�ret�nek be�ll�tsa a palackban
	GeneralPath nozzle = new GeneralPath();	//nozzle= sz�r�fej
	nozzle.moveTo(252F, 176F);				//kezd� koordin�ta
	nozzle.lineTo(262F, 160F);				//vonalak rajzol�sa
	nozzle.lineTo(262F, 176F);
	nozzle.closePath();						//lez�rjuk a sz�r�fejet
	comp2D.fill(nozzle);
	
	//vonalak rajzol�sa
	comp2D.setColor(Color.black);			//sz�n be�ll�t�sa
	BasicStroke pen = new BasicStroke(2F);	//toll be�ll�t�sa, 2F pixel vastagon
	comp2D.setStroke(pen);					//toll megh�v�sa az objektumhoz
	Line2D.Float ln1 = new Line2D.Float(203F, 121F, 255F, 102F);//vonal kezd� �s z�r� koordin�t�j�nak (x,y) megad�sa
	comp2D.draw(ln1);											//vonal rajzol�sa
	Line2D.Float ln2 = new Line2D.Float(255F, 102F, 272F, 116F);//vonal kezd� �s z�r� koordin�t�j�nak (x,y) megad�sa
	comp2D.draw(ln2);											//vonal rajzol�sa
	Line2D.Float ln3 = new Line2D.Float(272F, 134F, 252F, 158F);//vonal kezd� �s z�r� koordin�t�j�nak (x,y) megad�sa
	comp2D.draw(ln3);
	
	//a piktogram befejez�se
	comp2D.setColor(Color.red);						//v�r�s sz�n megad�sa
	GeneralPath sign3 = new GeneralPath();			//sign3 megad�sa(t�glalap)
	sign3.moveTo(110F, 78F);						//kezd� pont megad�sa	
	sign3.lineTo(321F, 289F);						
	sign3.lineTo(290F, 317F);						//vonalak megrajzol�sa
	sign3.lineTo(81F, 107F);
	sign3.closePath();								//alakzat lez�r�sa
	comp2D.fill(sign3);								//alakzat kit�lt�se v�r�sre 
	}	
}
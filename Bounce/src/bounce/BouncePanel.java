package bounce;

import java.awt.*;										//import�ljuk a sz�ks�ges csomagokat
import javax.swing.*;
import java.util.*;

public class BouncePanel extends JPanel implements Runnable {//BouncePanel l�trehoz�sa, mely �r�k�k a JPanelt�l �s Runnable fgvt implement�lja
	Image ball, court;		//k�pv�ltoz�k bevezet�se
	float current = 0F;		//lebeg�pontos sz�m, amely 0-val kezd�dik, �rt�ke 0.1el n� a labda minden megrajzol�sakor, ha el�ri a 3at vissza�ll 0-ra
	Thread runner;			//sz�l bevezet�se
	int xPosition = 10;		//a megrajzoland� labda hely�t jel�li az X koordin�tatengelyen
	int xMove = 1;			//X koordin�tategngelyen val� jobbra-balra ELMOZDUL�ST M�RT�K�T jel�li k�perny�-friss�t�senk�nt 1 �s -1 k�z�tt, bal �s jobboldal
	int yPosition = -1;		//a megrajzoland� labda hely�t jel�li az Y koordin�tatengelyen
	int ballHeight = 185;	//labda f�gg�leges p�ly�j�nak magass�ga
	int ballWidth = 190;	//labda v�zszintes p�ly�j�nak a sz�less�ge
	int height;				//magass�g
	
	public BouncePanel() { 	//BouncePanel tgfvg l�trehoz�sa
		super();
		Toolkit kit = Toolkit.getDefaultToolkit();//egy Toolkit tipus� kit objektum l�trehoz�sa, k�l�nb�z� komponensek, ez esetben k�pek �sszek�t�s�hez
		ball = kit.getImage("C:\\Users\\Mike\\Documents\\NetBeansProjects\\Bounce\\src\\bounce\\tennis.gif");//ball v�ltoz�hoz a kitbe t�roljuk a k�pet
		court = kit.getImage("C:\\Users\\Mike\\Documents\\NetBeansProjects\\Bounce\\src\\bounce\\court.jpg");//court v�ltoz�hoz kitbe t�roljuk a k�pet
		runner = new Thread(this);		//runner sz�l bevezet�se ehhez a fgvhez
		runner.start();					//futtat� sz�l elind�t�sa(l�trehozzuk a kitet, bet�lt�dnek a k�pek, ez fut a h�tt�rben)
	}
	
	public void paintComponent(Graphics comp) {		//itt rajzol�dik ki a teniszp�lya �s a labda / comp Graphics objektumot hozunk l�tre a Graphics 2-h�z
		Graphics2D comp2D = (Graphics2D) comp;		//comp graphics objektumot comp2D grhapics2D objektumm� alak�tjuk, �gy hordozza mind2 oszt�ly tulajdons�g�t
		height = getSize().height - ballHeight;		//magass�g = ablak magass�g�nak bek�r�se kivonva a labda magass�g�val, �gy aktu�lis magass�got kapjuk
													//ahol a labda van
		if (yPosition == -1) {						//ha az y tengelyi poz�ci� -1(legalacsonyabb)
			yPosition = height - 20;				//yposition = magass�g - 20
		}
		if ((court != null) && (ball != null)) {	//ha a court nem null �s a ball sem null(azaz l�tezik mind2 k�p) akkor
			comp2D.drawImage(court, 0, 0, this);	//comp2D objektum fog rajzolni k�pet, pontosan a courtot a 0,0 korrdin�t�l
			comp2D.drawImage(ball, (int) xPosition, (int) yPosition, this);//a compd2D fog rajzolni labd�t, 2 adott koordin�ta poz�ci�n ami folyton v�ltozik
		}
	}
	
	public void run() {									//az �sszes k�pkezel� utas�t�s a run tgfgvben tal�lhat� = MAIN
		Thread thisThread = Thread.currentThread()	;	//thisThread sz�l bevezet�se
		while (runner == thisThread) {					//while ciklus, runner �s a thisThread sz�l egyenl�, addig
			current += (float) 0.1;						//current 0.1-el n�, ez mozgatja a labd�t f�l le
			if (current > 3) {							//ha a current 3-n�l nagyobb
				current = (float) 0;					//akkor 0, null�z�dik �s �jraind�l
			}
			xPosition += xMove;							//az xPosition kezd�poz�ci� �s a xMove elmozdul�st m�rt�ke, ami �sszead�dik mindig
			if (xPosition > (getSize().width-ballWidth)) {	//ha a xPosition nagyobb mint a bek�rt sz�less�g - labdasz�less�g(van m�g hely a keretben)
				xMove *= -1;							//xMove = xMove * -1 
			}
			if (xPosition < 1) {						//ha az x Position kisebb mint 1, 
				xMove *= -1;							//xMove = xMove * -1
			}
			double bounce = Math.sin(current) * height;//matematikai szinusz fgv, f�l szinuszg�rb�t �r le am�g felpattan majd leesik
			yPosition = (int) (height - bounce);		// Y poz�ci� = magass�g-labda szinusz�rt�ke, ami pattog�st �rz�keli
			repaint();									//�jrarajzolja az anim�ci�t
			try {										//try blokk
				Thread.sleep(100);						//sz�l sz�neteltet�se 100 ezred mp-ig
			} catch (InterruptedException e) {			//catch kiv�telkezel�se, ha nem futna le a sz�l 
				//nem csin�lunk semmit
			}
		}
	}
} 

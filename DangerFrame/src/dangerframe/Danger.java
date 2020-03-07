package dangerframe;

import java.awt.*;							//importaljuk a szukseges csomagokat
import javax.swing.*;

public class Danger extends JPanel implements Runnable {                //örököljuk a Jpanelt, es atvesszuk a Runnable-t a szalas futtatashoz
	
	String text = "No text has been specified";			//text objektum bevezetese, alapertelmezett ertekkel
	float hue = (float) 0.5;					//float hue bevezetese, 0.5 kezdoertekkel
	float saturation = (float) 0.8;					//float saturation bevezetse 0.8 kezdoertekkel
	float brightness = (float) 0.0;                                 //float brightness bevezetese 0.0 kezdpoertekkel
	Font textFont = new Font("Dialog", Font.BOLD, 20);              //***Dialog betutipus
									//***felkover(BOLD)
									//***20-as betumeret 
									//ezek tarolasahoz FONT OBJEKTUMOT hasznalunk(textFont neven)
	
	int textX;							//int textX valtozo bevezetese, ***K�ZEPRE IGAZITASHOZ 
	Thread runner;							//***runner bevezetese, mely tarolja a Danger osztaly futtato szalat
	
	public Danger (String warning) {				//Danger konstruktor keszitese, egy String warning valtozoval
//A konstruktort akkkor hivjuk meg, ha az osztalybol objektumot hozunk letre, maskor nincs ra szukseg. 
	
		text = warning;						//text pedanyvaltozonak NTMETRICS OSZTALY megmeri, hogy milyen szeles lesz a
		FontMetrics fm = getFontMetrics(textFont);		//**megjelenitendo szovegsor
		
		textX = 200 - fm.stringWidth(text) / 2;			//***FontMetrics stringWidth fgv segitsegevel a text szoveget a 
                                                                        //***tárolo kulonbozo reszeire helyezhetjuk, annak szelessegetol fuggoen
                                                                        //***a textC valtozo tarolja a szoveg megjelenitendo vizszintes helyzetet
		
		runner = new Thread(this);				//runnner nevu szal letrehozasa, a Danger osztalyra hivatkozva
		runner.start();						//runner nevu szal elinditasa, a szal elkezd futni
	}
	
	public void paintComponent(Graphics comp) {			//** paintComponent tgfgv a comp Grapcsih objektumot veszi at parameterk�nt
		Graphics2D comp2D = (Graphics2D) comp;			//**compd2D Graphics2d objektum bevezetese, felhasznalva a Graphics objektumot
									//**a szoveg rajzolasahoz
		//**a comp2D tartalmazza minden informaciot a szukseges megjelenitesi muvelethez 
		comp2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);//ELSIMITAS BEALLITASA
		comp2D.setColor(Color.black);					//a comp2d panel objektum hatterszinenek meghatarozasa
		comp2D.fillRect(0, 0, 400, 200);				//a kiszinezendo terulet meretenek megadasa
		Color textColor = Color.getHSBColor(hue, saturation, brightness);//***textColor color objektum letrehozasa, mely a 
		//getHSBColor fgvel bekeri a szinek erteket 
		comp2D.setColor(textColor);				//**setColor fgv-el textColor ugy valik az aktualis szinne 
		comp2D.setFont(textFont);				//**a setFont fgvel beallitjuk a comp2D-hez a betuparametereket
		comp2D.drawString(text, textX, 30);			//**!a dewaString fgvel a text valtozo a TextX es koordinata jelenik meg
	}
	
	void pause(int duration) {                                      //pause tgf a szal szuneteltetesere, atveszi a duration int erteket
		try {							//try-catch blokk
			Thread.sleep(duration);                         //szunetelteti a szal futasat, duration ertekkel
		} catch (InterruptedException e) {
                                                                        //nem csinalunk semmit
		}
	}
	
	public void run() {						// a run fgv fogja futtatni a szalat
		Thread thisThread = Thread.currentThread();             //**thisThread nev� Thread objektum letrehozasa, mely tartalmazza az �PPEN 
									//FUT� SZ�LAT
		while (runner == thisThread) {                          //while utasitasban osszehasonlitjuk a runner objektummal
			pause(75);					//75 ezred masodperccel szunetetltei az animaciot
			brightness += 0.05;				//a brightness erteket fokozatosan noveljuk 0.05 ertekkel
			if (brightness > 1) {                           //ha eleri az 1-et, akkor:
				brightness = (float) 0.0;               //0.0 float ertekktel indul ujra, azaz nullazodik
				pause(75);				//meghivja a pause fgv-t ismetelten
			}
			repaint();                                      //a tarolo ujrarajzolasa, minden valtozas eseten
		}
	}
}
	
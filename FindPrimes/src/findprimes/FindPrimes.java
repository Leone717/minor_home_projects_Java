package findprimes;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class FindPrimes extends JFrame implements Runnable, ActionListener {
	//**A korabbi Thread folyamathoz bevezetjuk a Runnable-t es a gombnyomashoz az ActionListenert !

	Thread go;										//nevet adunk a Thread objektumnak(go) de meg nem hozzuk letre
	JLabel howManyLabel = new JLabel("Quantity: ");                                         //"Quantity" cimke letrehozasa
	
	JTextField howMany = new JTextField("400", 10);                                         //** a szamok mennyiseget a howMany hatarozza meg, mely itt 400 lesz!
												//a 10 a szovegmezo sor hosszat, x koordinata tengelyen, hatarozza meg
	
	JButton display = new JButton("Display primes");                                        //egy gomb letrehoz�sa a feluleten
	JTextArea primes = new JTextArea(8, 40);                                                //primes nevu JTextArea letrehoz�sa, x=8, y=40 ertekkel, ez lesz a merete
	
	FindPrimes() {                                                                          //FindPrimes ablak beallitasa
		super ("Find Prime Numbers");                                                   //ablak nevenek a megadasa
		setSize(400, 300);                                                              //ablak meretenek megadsa
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);                                 //bezaras gomb hozzadasa
		BorderLayout bord = new BorderLayout();                                         //elrendezeskezelo bevezetese
		setLayout(bord);                                                                //bord elrendezeskezelo bevezetese, meg nincs erteke
		display.addActionListener(this);                                                //a display gombhoz beallitjuk az ActionListenert, this-el hivatkozunk a FindPrimes-ra
		
		JPanel topPanel = new JPanel();                                                 //Letrehozunk egy panelt
		topPanel.add(howManyLabel);                                                     //Hozzaadjuk a howManyLabelt
		topPanel.add(howMany);                                                          //Hozzaadjuk a howmMany Textfield-et, jobbra
		topPanel.add(display);                                                          //Hozzaadjuk a display gombot, jobbra
		add(topPanel, BorderLayout.NORTH);                                              //a topPanelhez adjuk a BorderLayoutot, mely "Eszakon" helyezi el ezeket
		
		primes.setLineWrap(true);                                                       //a setLineWrap(true) engedelyezi a sor behuzast az ablak jobb szelet elerve
		JScrollPane textPane = new JScrollPane(primes);                                 //textPane gorditosav letrehozasa , a primes TextArea-hoz
		add(textPane, BorderLayout.CENTER);                                             //a FindPrimes objetumhoz adjuk a textPane gorditosavot, kozepre igazitva
		
		setVisible(true);                                                               //lathatova tesszuk a FindPrimes objektumot
	}
	
	public void actionPerformed (ActionEvent evt) {                                         //actionPeformed esemenyfigyelo fgv bevezetese
		display.setEnabled(false);                                                      //a display gombhoz a setEnabled()fgv hozz�ad�sa false ertekkel
		if (go == null)  {                                                              //** a go THREAD SZAL erteke null, azaz meg nem letezik ezert:		!
			go = new Thread(this);                                                  //** egy uj go Thread objektumot hozunk letre, this hivatkozik az actionPerformed-ra!
			go.start();                                                             //** a start() tgfgv meghivasaval elinditjuk a szalat				!
                                                                                                //** ez a FindPrimes osztaly, run() tgfgv vegrehajtasat idezi elo 	!
		}
}
//**RUN TAGFUGGVENY, A SZAL LETREHOZASARA, mely megkeresi a 2-vel kezdodo primszamsorozatot
	public void run () {

//quantity int valtozo, mely a Integer.parseInt fgv segitsegevel atkonvertalja a howMany textFielden bevitt SZAMOK MENNYISEGET,db
		int quantity = Integer.parseInt(howMany.getText());
		
		int numPrimes = 0;
		
		//candidate: a lehetseges primszam, 2-vel kezdjuk  a felsorolast
		int candidate = 2;
		
		//a primes Textfield OBJETKUM append()tgfgv meghivasaval megjeleniti a primszamokat
		//String + quantity, ami a howMany-ban bevitt darabszamot ajda meg int ertekben + String
		primes.append("First " + quantity + " primes:");
		//amig a numPrimes kissebb mint a bevitt szamok mennyisege,darabszama addig
		while (numPrimes < quantity) {
		//ha a 2-vel kezdodo int tipusu candidate nevu valotozo isprime fuggvenyben
			if (isPrime(candidate)) {
				primes.append(candidate + " ");//a candidate erteket ellenorzi h. prim-e, amennyiben igen, kiirja szokozzel
				numPrimes++;                                                    // noveli a primszamok kovetkezo sorszamat
			}
			candidate++;                                                            //eggyel noveli a candidate ertket es ismet futtajta a while ciklust
		}
	}
	
	public static boolean isPrime (int checkNumber) {                                       //isPrime boolean fgv, int checkNumber bevezetese
		double root = Math.sqrt(checkNumber);                                           //double tipusu root objektum mely a checkNumbert a Math sqrt fgvel hasznalja
		for (int i = 2; i <= root; i++) {                                               //for, amig i kisebb v. egyenlo mint a root mennyisege, noveli a root szamat
			if (checkNumber % i == 0) {                                             //ha a checknumber i maradeka egyenlo 0, false ertekkel ter vissza
				return false;
			}
		}
		return true;                                                                    //true ertekkel ter vissza
	}
	public static void main(String[] arguments)  {                                          //main fgv a muvelet vegrehajtasara
		FindPrimes fp = new FindPrimes();                                               //fp FindPrimes objektum 
	}
}
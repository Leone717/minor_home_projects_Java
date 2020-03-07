package clocktalk;

import java.util.*;                                                             //lehetove tesszuk a Calendar fuggveny meghívását


public class ClockTalk {
	public static void main(String[] args) {
		// az akttualis datum és ido megallapitasa
		Calendar now = Calendar.getInstance();                          //bevezetjuk a Calendar osztaly now OBJEKTUMot mely  a
										// a getInstance()fgv-t hasznalva ir ki az aktualis idoelemet a 
                                                                                //Calendar osztalybol
		
		
		int hour = now.get (Calendar.HOUR_OF_DAY);                      // a Calendar class now objektumot kijelolve get-tel irjuk ki 
		int minute = now.get (Calendar.MINUTE);                         //a Calendar aktualis elemet az ido elemeinek leirasara
		int month = now.get (Calendar.MONTH) + 1;                       //a januar 0-s honap, igy hozzaadunk egyet
		int day = now.get(Calendar.DAY_OF_MONTH);
		int year = now.get(Calendar.YEAR);
		
		//udvozlo szoveg megjelenitese
		if (hour<12) {									//ha az oraszam kisebb mint 12 
			System.out.println("Good Morning. \n");					//Good Morning, uj sor
		} else if (hour<17) {								//Kulonben ha kisebb mint 17
				System.out.println("Good Afternoon. \n");			// Good afeternoon, uj sor
		} else {                                                                        //Kulonben
			System.out.println("Good Evening. \n");					//Good Evening, uj sort k�r�nk
		}										// Ez az elso sor amit a program kiir. 
		
		// az uzenet kezdete a perc kiirasaval
		System.out.print("It's" );                                                      //A kiiras 2. soranak eleje
		if (minute !=0) {								//Ha a perc nem 0 akkor (KULONBEN NEM FUT LE)
			System.out.print(" " + minute + " ");                                   //szokoz, VALTOZO(minute szamertek) szokoz
			
			System.out.print( (minute != 1) ? "minutes" : "minute");                //Ha a perc nem 1, akkor minute kulonben minutes
			System.out.print(" past");						//past kiirasa
			}
	
		// az ora kiirasa
		System.out.print(" ");								//szokoz kiirasa
		System.out.print( (hour>12) ? (hour-12) : hour );                               //ha az ora nagyobb mint 12, akkor levon 12-�t 
		System.out.print(" o'clock on ");
		
		// a h�nap nev�nek a ki�r�sa
		switch (month) {                                                                //month valtozok kozt kapcsolgatunk
		case 1:
			System.out.print("January");			                        //ha month erteke 1, akkor January kiirasa
			break;									//szuet, nem futtatta a tobbit
												//ha a break-et kivesszuk, akkor vegrehata a masik parancsot
												//egeszen a break-ig
			
		case 2:
			System.out.print("February");
			break;
		case 3:
			System.out.print("March");
			break;
		case 4:
			System.out.print("April");
			break;
		case 5:
			System.out.print("May");
			break;
		case 6:
			System.out.print("June");
			break;
		case 7:
			System.out.print("July");
			break;
		case 8:
			System.out.print("August");
			break;
		case 9:
			System.out.print("September");
			break;
		case 10:
			System.out.print("October");
			break;
		case 11:
			System.out.print("November");
			break;
		case 12:
			System.out.print("December");
			break;
		}
		// a nap es ev kiirasa
		System.out.println(" " + day + ", " + year + ".");	//szokoz, aktalis nap szama, vesszo, aktualis ev sz�ma
	}														//pont
}

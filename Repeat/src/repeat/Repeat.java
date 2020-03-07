package repeat;

import java.util.*;                                                             //java.util osztlykonyvtar bevezetese a Calendarhoz

public class Repeat {
	public static void main(String[] arg) {
		
		String sentence = "Thorium 230 is not a toy.";		
		int count = 0;                                                  //int valtozo bevezetese
		
		Calendar start = Calendar.getInstance();                        //start nevu Calendar valtozo mely lekeri az idot
		int startMinute = start.get(Calendar.MINUTE);                   //int valtozo, mely start valtozobol lekeri a percet
		int startSecond = start.get(Calendar.SECOND);                   //int valtozo mely a start valtozobol lekeri a mpercet
		start.roll(Calendar.MINUTE, true);                              // ****A Calendar roll fgv 1 perccel lepteti a start idoerteket
		int nextMinute = start.get(Calendar.MINUTE);                    //ujra lekerjuk az idoadatokat
		int nextSecond = start.get(Calendar.SECOND);
		
		
		while (count < 1000000) {                                       //while ciklus idnitasa, amig a count kisebb mint 1000000
			System.out.println(sentence);				//kiirja a bonti mondatot
			GregorianCalendar now = new GregorianCalendar();        //now valtozo letrehozasa a GregorianCalendar osztalybol
                                                                                //erteke a pillanatnyi ido lesz
			if (now.get(Calendar.MINUTE) >= nextMinute) {           //****megvizsgaljuk, letelt-e 1 perc:
                                                                                //a bekerjuk a now percerteket es az nagyobb vagy egyenlo a kov.
										//perccel akkor
				if (now.get(Calendar.SECOND) >= nextSecond) {   //bekerjuk a now mp erteket, ha az nagyobb vagy egyenlo 
					break;					//a nextsecond ertekkel, akkor leall
				}
			}
			count++;					
		}								//while ciklus vege
		System.out.println("\nI wrote the sentence " + count 
				+ " times.");
		System.out.println("I have learned my lesson");
	}
}
                                                                                //a startMinute es startSecond
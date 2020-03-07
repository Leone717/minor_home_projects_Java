package stringlister;

import java.util.*;	//oszt�lyk�nyvt�r import�l�sa								

public class StringLister {	//oszt�ly bevezet�se
	String[] names = { "Simon", "Gábor", "Zoltán","Elemér", "Miklós", "Aladár", "Károly",
			"Zsolt", "Attila"}; // names t�mb bevezet�se, nevekkel
			
			public StringLister(String[] moreNames) {//Stringlister fgv, mely a l�trehoz moreNames t�mb�t
				
				Vector<String> list = 	new Vector<String>(); // list nev� String vektor, t�rolja a neveket
				for (int i = 0; i < names.length; i++) {	//for ciklus a names T�MB darabsz�m�ra
					list.add(names[i]);	//list vektorhoz az add fgv mely hozz�adja a names t�mb i-edik elem�t****
					//ezt sorban v�grehajta am�g el nem fogynak a t�mb elemei, �gy felt�ltve nevekkel a vectort
				}//els� for ciklus v�ge
				
				for (int i = 0; i < moreNames.length; i++) {//for ciklus a monreNames T�MB darbsz�m�ra
					list.add(moreNames[i]);	//list vektorhoz az add fgv mely hozz�adja a moreNames t�mb i-edik elem�t****
					//ezt sorban v�grehajta am�g el nem fogynak a t�mb elemei, �gy felt�ltve a plusz 
					//bevitt nevekkel a vectort
			}//m�sodik for ciklus v�ge 
//MOST A VECTOR 2 T�MB ELEMEIVEL FELT�LTVE (eredeti + bevitt nevek) 
				
			Collections.sort(list);		// ABC sorrendbe teszi a list VEKTOR n�v elemeit
			for (String name : list) {	//for ciklus, egy �j name v�ltoz�val mely a list vector adott neve lesz sorban
				System.out.println(name);//ki�rja a name �rt�k�t soronk�nt, �s �jra haszn�lja a fort
				
			}
	}
			public static void main(String[] arguments)  {
				StringLister lister = new StringLister(arguments);
			}
	
}

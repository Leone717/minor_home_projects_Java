package name;

import java.util.*;

public class Name {
	public static void main(String[] arg) {
		String names[] = { "Peter", "Patricia", "Hunter", "Sarah", 		//megadunk egy names t�mb�t 
				"Gabe", "Gina", "Rob", "John", "Zoey", "Tammy", "Robert",
				"Sean", "Paschal", "Kathy", "Neleh", "Vecepia"};
		System.out.println("The original order:");						//a program els� ki�r�sa
		for (int i = 0; i < names.length; i++) {		//for cikus, ha i �rt�ke a names hossza, azaz DARABSZ�MA
			System.out.println(i + ": " + names [i]);	//ki�rja az i sorsz�mot �s a t�mb i-edik elem�t
		}
		Arrays.sort(names);								//ABC SORRENDBE RENDEZI A T�MB ELEMEIT
		System.out.println("The new order:");			//ki�r�s
		for (int i = 0; i < names.length; i++) {		//for ciklus, 0-t�l v�gig veszi a t�mb�k elemeit
			System.out.println(i + ": " + names [i]);	//ki�rja az i sorsz�mot �s a t�mb i-edik elem�t
		}	
	}
}
	
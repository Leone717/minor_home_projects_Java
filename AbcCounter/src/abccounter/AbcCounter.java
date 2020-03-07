package abccounter;


public class AbcCounter {

	public static void main(String[] args) {		
		String phrase[] = {						//phares nevű karakterlánc tipusu tömb létrehozása
				"A STITCH IN TIME SAVES NINE",                  // 0 - az elemeket ,-vel válasszuk el
				"DON'T EAT YELLOW SNOW",			// 1 
				"JUST DO IT",                                   // 2 
				"EVERY GOOD BOY DOES FINE",			// 3 
				"I WANT MY MTV",				// 4 
				"HOW 'BOUT THEM COWBOYS",			// 5 
				"PLAY IT AGAIN, SAM",				// 6 
				"FROSTY THE SNOWMAN",				// 7 
				"ONE MORE FOR THE ROAD",			// 8 
				"HOME FIELD ADVANTAGE",				// 9 
				"VALENTINE'S DAY MASSACRE",			// 10 
				"GROVER CLEVELAND OHIO",			// 11 
				"WONDERFUL WORLD OF DISNEY",                    // 12 
				"COAL MINER'S DAUGHTER",			// 13 
				"WILL IT PLAY IN PEORIA",			// 14 
		};	
                //BETŰK ELŐFPORDULÁSI SZÁMA
		int[] letterCount = new int[26];                                //létrehozunk egy int[] letterCount nevű töböt
                                               					//int tipusu, 26db elem helyét jelöljük ki(ennyiből áll az angol ABC)
                                                                                //[0] az 'A' betű darabszáma [25] a 'Z' betű darabszáma
		
		for (int count = 0; count < phrase.length; count++) {           //for ciklus, annyiszor fut le ahány db kifejezés 
			//count: KIFEJEZÉSEK DB száma                           //van a phrase tömben (0-14)
			
			String current = phrase[count];                         // letároljuk a current vban a phrase tömb aktuális count-adik elemét(mondatot)
			//pl."JUST DO IT",
			
			char[] letters = current.toCharArray();                 //letters char tipusu tömb 
			//pl. J,U,S,T, ,D,O, ,I,T				//mivel a cuurrent a phrase tömb adott elemét tartalmazza csak
                                                                                //ezt a letters tömbe adjuk a toCharAray fgv segítségével
										//toChharArray: betűket fogja végigvenni és letörölni a kifejezésből
			
			for (int count2 = 0; count2 < letters.length; count2++) {//for ciklus, mely annyiszor fut le ahány karakter találtható a kifejezésben
                                                            			//betűk db számát futtatja amíg el nem fogy pl. 10 helyet futtat végig(J-T)
										
				
				
				char lett = letters[count2];			//char tipusu lett változó bevezetése, adott betű értékével 
				//pl. J						//a karakterek számértékkel is rendelkeznek, így ennek a számértékét fogjuk használni
													
				
				if (  (lett >= 'A') & (lett <= 'Z') ) {         //ezzel az if utasítással kiszűrjük azon elemeket, melyek
                                                                                //nem tajga az abcnek pl. központosítási jelek, szóközök, 
			
					letterCount[lett - 'A']++;		//lettercount tömb egyik eleme 1-el nő a lett változóban található értéktől függően
																
//Az ABC betűinek értéke 65-től, amely az A betű értéke, 90-ig terjednek amely a Z betű értéke. Mivel a letterCount
//tömb elemeinek értéke 0-25ig terjed, a növelendő elem sorszámának meghatározásához az 'A'(65) ki kell vonnunk a 
// lett válozó értékéből, és arra a helyre tárolja az előfordulási számot
					
			}                                                       //a belső for ciklus végetér, és visszatér hogy folytatódjon a köv. kfiejezés betűjével
		}                                                               //a külső for ciklus végetér, és visszatér hogy folytatódjon a köv. kfiejezéssel
	}	
	for (char count = 'A'; count <= 'Z'; count++) {                         //ez a for ciklus A-tól Z-ig végigmegy az ABC betűin
		System.out.println(count + ": " +                               //a program kiírja az aktuális betűt, pontosvesszőt, 
			letterCount[count - 'A'] +                              //és előfordulási számot
			"\t");
	}									//for ciklus véget ér, és visszatér h. ABC k�v. betűjével lefusson
	System.out.println();                                                   //a program kiír egy üres sort 
	}
}


package nospaces;


public class NoSpaces {
	public static void main(String[] arg) {
		String mostFamous = "Rudolph the Red-Nosed Reindeer \n";	//String v�ltoz� bevezet�se
		char[] mfl = mostFamous.toCharArray();					//mf1 char tipus� t�mb mely a v�ltoz�hoz ad f�ggv�nyt
		for (int dex = 0; dex < mfl.length; dex++) {//for ciklus, dex �ltoz�val mely mfl darabsz�m�t veszi v�gig 
			char current = mfl[dex];				//current �rt�knek a mf1 t�mb dexedik elem�t adjuk
			if (current != ' ') {					//ha a current �rt�ke nem egyenl� sz�k�zzel
				System.out.print(current);			//ki�rja a current karaktert
			} else {								//k�l�nben (ha sz�k�z lenne)
				System.out.print ('.');				// "."-ot rak a hely�re
			}
		}		
	}
}


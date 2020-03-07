package nines;

public class Nines {
	public static void main(String[] arg) {
		for (int dex = 1; dex <= 200; dex++) {		//for ciklus, dex int tipus� v�ltoz�, mely 1-t�l sz�mol 200-ig
			int multiple = 9 * dex;					//multiple v�ltoz�, mely dexet szorozza minden esetben 9-el
			System.out.print(multiple + " ");		//kir�ja a 9 adott szorzat�t sorban �s sz�k�zt hagy
		}
	}
}
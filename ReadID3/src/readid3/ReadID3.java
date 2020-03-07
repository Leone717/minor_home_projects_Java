package readid3;

import java.io.File;
import java.io.FileInputStream;

public class ReadID3 {								//ReadID3 létrehozása
	public static void main(String[] arguments) {                           //main végrehahtó fgv
		try {								//try-catch blokk a kivételek elkapására
			File song = new File(arguments[0]);                     //song nevű, File tipusu objektum létrehozása, ami a 0.argumentum lesz, amit beviszünk
													
			FileInputStream file = new FileInputStream(song);	//file nevű, új FileInputStream(adafolyam) obejtum létrehtozása, 
										//a song File-hoz, a fájlnak léteznie kell! ez fogja tárolni
			
			int size = (int)song.length();                          //size int tipusu változó, mely a song hossza lesz 0-255 közötti számértékben
			
			file.skip(size - 128);                                  //a beolvasás előtt, a file size(üsszes eleméből,max255 intnél kivonunk 128-at, így az utolsó
                                                                                //128 karaktertől kezdi majd végigolvasni pl. 255-128=127. 
			
			byte[] last128 = new byte[128];                         //byte tömb létrehozása TÁROLÁSHOZ, melynek mérete pont akkora, amekkorát olvasni akarunk
			file.read(last128);                                     //a file adatfolyamból read()fgvel beolvassuk az utolsó 128 karaktert, és a tömben
										//(last128) tároljuk
			String id3 = new String(last128);                       //id3 obejtumhban a belvasott karaktereket String tipussá alakítjuk, így betű lesz
			String tag = id3.substring(0, 3);                       //a tag objektumban az id3 alatt beolvasott karakterk 0-3 elem�t jeleníti meg a 
										//substring függvényt használva (ennek kellene TAG-nak lennie)
		
			if (tag.equals("TAG")) {                                //ha a tag objektum első 3 karaktere TAG, equals fgvel összehasonlítjuk, és ha igen:
				System.out.println("Title: " + id3.substring(3, 32));//id3 objektum értékeit beolvassuk a substring fgv-el
				System.out.println("Artist: " + id3.substring(33, 62));//itt pl. 33-62 közötti betűket olvassa be
				System.out.println("Album: " + id3.substring(63, 91));//itt a 63-91 közötti betűket
				System.out.println("Year: " + id3.substring(33, 97));
			} else {
				System.out.println(arguments[0] + " does not contain" + " ID3 info.");//ha nem talál TAG cimkét, akkor ezt írja ki
			}
			file.close();                                           //bezárjuk a file adatfolyam lekérést
		} catch (Exception e) {                                         //ha nem lenne jó a név, az alábbi catch blokkal kapjuk el 
			System.out.println("Error -- " + e.toString());
		}
	}
}

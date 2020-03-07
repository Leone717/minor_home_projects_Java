package readconsole;

import java.io.*;							//java.io importalasa a fileolvasashoz

public class ReadConsole {								//ReadConsole osztaly letrehozasa
	public static String readLine() {					//readline String fgv letrehozasa
		StringBuffer response = new StringBuffer();		//új response StringBuffer ATMENETI TAROLO letrehozasa 
		try {											//try-catch blokk letrehozasa
			
			BufferedInputStream bin = new				//bin nevu BufferedInputStrem(bemenetiadafolyam) objektum, mely a 
											//BufferedInputStream(System.in) fgv-n keresztul letarolja a szukseges adatokat:
			BufferedInputStream(System.in);
			
			int in = 0;									//in int valozo 0 ertekkel
			char inChar;								//inchar char valtozo bevezetese
			do {										//do vegrehajto fgv 
                        in = bin.read();						//a bevezetett int in valtozo a bin BufferedInputstream ideiglenes 
														//tarolobol olvas be
//a read()fgv 0-255 kozotti szamot kapunk vissza. Amennyiben nincs tobb elerheto bajt, akkor -1 ertekkel ter vissza. 

				inChar = (char)in;						//az in-ben beolvasott adat char ertekkent tarolodik az inChar-ban
				if (in != -1) {							//ha az int in valtozo nem egyenlo -1-el, azaz van erteke, akkor:
					response.append(inChar);			//* az APPEND FGV-el inChar nak adunk erteket a response adatfolyambol
				}
			}	while ((in != -1) & (inChar != '\n'));	//amig az in nem egyenlo -1-el es inchar nem egyenlo uj sorral, azaz e
														//entert utunk
				bin.close();							//amikor ez teljesul, az ideiglenes BufferedInpuStream adafolyam ZARODIK
				return(response.toString());			//visszater toString()fgvt hasznalva, String ertekkel a response-ba
			} catch (IOException e) {					//catch elkapja a kivetelt, ha vmi miatt nem mukodne a beolvasas
				System.out.println("Exception " + e.getMessage());//kiirja az alabbi szoveget, es bekeri a hibauzenetet
															
				return null;							//0-val ter vissza
			}
	}
		
	public static void main(String[] arguments) {	//main vegrehahto fgv
	
				System.out.println("You are standing at the end of the road ");
				System.out.println("before a small brick building. Around you ");
				System.out.println("is a forest. A small stream flows out of  ");
				System.out.println("the building and down a gully. \n");
				System.out.println("> ");
				String input = ReadConsole.readLine();//a ReadConsole a paracssorbol erkezo karaktereket fogadja a readLine()fgv
													  //segitsegevel
//Amikor megnyomjuk az ENTERt visszater az osszes fogadott karaktert tartalmazo String objektummal. 
				System.out.println("That's not a verb I recognize");
			}		
	}

package propertyfilecreator;

import java.io.*;										//import�ljuk a sz�ks�ges csomagokat
import java.util.*;

public class PropertyFileCreator {						//oszt�ly l�trehoz�sa
	public PropertyFileCreator() {						//tgfgv l�trehoz�sa
		Properties prop = new Properties();				//porp Properties v�ltoz� l�trehoz�sa az XML-hez �s setProperty fgvhez
		prop.setProperty("username", "arcade");			//prop v�ltoz� be���t�sa setPrp�erty fgvel
		prop.setProperty("browser", "Mozilla Firefox");	//
		prop.setProperty("showemail", "no");			//
		try {											//try-cach blokk a kiv�telek elkap�s�ra
			File propFile = new File("Properties.xml");	//propfile File l�trehoz�sa, az XML adat t�rol�s�ra
			FileOutputStream propStream = new FileOutputStream(propFile);//propStream adatfolyam, amely a prpfile tartalm�t k�ri
														//FileOutpustStream fgv seg�ts�g�vel
			Date now = new Date();						//az aktu�lis d�tum lek�rdez�se, a Date() fgv seg�ts�g�vel
			prop.storeToXML(propStream, "Created on" + now);//a prop Properties v�ltoz�ba bevitt adatokat a storeToXML fgv 
//seg�ts�g�vel a propStrem adatfolyamba vissz�k(itt a propFIlefogja ez t�rolni) hozz� Created on sz�veg �s akut�lis d�tum lesz
			
		} catch (IOException exception) {				//hiba eset�n kiv�tel l�trehoz�sa, ekkor ki�rja:
			System.out.println("Error" + exception.getMessage());//Error, exceptionban t�rolt sz�veget ki�rja a getMessage()fgv 
		}
	}
	public static void main(String[] arguments) {		//v�grehajt� fgv 
		PropertyFileCreator pfc = new PropertyFileCreator();//pfc PropertyFileCreator tipus� objektum, mely v�grehajt�dik
	}
}
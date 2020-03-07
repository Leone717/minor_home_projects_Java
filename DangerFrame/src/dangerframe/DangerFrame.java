package dangerframe;

import java.awt.*;							//bevezetjuk a szukseges import osztalyokat
import javax.swing.*;

public class DangerFrame extends JFrame {				//DangerFrame osztaly oroklodik a JFrame(keret) osztalybol
	public DangerFrame () {						//letrehozunk egy DangerFrame objektumot
		super("Warning!");					//megjeleno keret szovegenek megadasa
		setSize(400, 90);					//megjeleno ablak meretenek(x,y) keppontos megadasa
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);         //bezaras es egyeb gombok hozzaadasa
		Danger gb = new Danger("Core Breach in sector 12");     //a korabban keszitett Danger osztalyban leterhozunk egy uj Dangert
									//objektmot, szoveggel
		add(gb);						// a gb Danger objektumot hozzaadjuk a kerethez
		setVisible(true);					//lathatova tesszuk a keretet
	}
	
	public static void main(String[] arguments) {                   //programvegrehajto fgv meghivasa
		DangerFrame frame = new DangerFrame();			//keszitunk egy frame nevu DangerFrame objektumot, mely vegrehajtodik
	}
}

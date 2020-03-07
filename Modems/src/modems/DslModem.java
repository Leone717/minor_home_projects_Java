package modems;

public class DslModem extends Modem {                           //kiterjesszük a Modem osztályt (speed változó, displaySpped fgv)

	String method = "DSL phone connection";                 //string változót vezet�nk be a lenti függvényhez
	
	public void connect() {					//connect függvényt vezetünk be mely kiír dolgokat
		System.out.println("Connecting to the internet ...");
		System.out.println("Using a " + method);
	}
}

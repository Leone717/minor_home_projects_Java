package modems;

public class CableModem  extends Modem{                 //Modem osztályt örököltetjük: kimondottan a speed változót displayspeed fgv
	String method = "cable connection";             //bevezetünk egy String változót (method)
	
	public void connect() {				//bevezetünk egy connect függvényt mely kiír dolgokat lentebb
		System.out.println("Connecting to the internet ...");
		System.out.println("Using a " + method);
	}
}

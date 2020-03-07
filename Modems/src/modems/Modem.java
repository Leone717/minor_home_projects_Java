package modems;

public class Modem {                                    //létrehozunk egy Modem szuperosztalyt

	int speed;					//adunk neki egy speed nevű válotzót: ez kiterjeszti a tóbbi osztályba eltérő értékkel
								
	
	public void displaySpeed() {                    //bevezetünk egy displaySpeed függvényt, mely használja a println fgvt
		System.out.println("Speed: " + speed);	
	}
}

package modems;												

public class TestModems {                               //bevezetünk egy osztályt mely 2 alosztályt fog használni működéshez (Cable/DslModem)

public static void main(String[] arguments) {
	
	CableModem roadRunner = new CableModem();	//roadRunner nevu CableModem(osztály) OBJEKTUMA
	DslModem bellSouth = new DslModem();		//bellSouth nevu DslModem(osztály) 	OBJEJTUMA
	
	
	roadRunner.speed = 500000;                      //roadRunner nevu (CableModem OBJEKTUM) speed változónak 500000 értéket adunk
	bellSouth.speed = 400000;                       //bellSouth nevu (DslModem OBJEJTUM) speed változónak 400000 értéket adunk
	
	System.out.println("Trying the cablemodem:");		
	roadRunner.displaySpeed();                      //roadRunner nevu CableModem OBJEKTUM displaySpeed nev� fgvt hívjuk
	roadRunner.connect();                           //roadRunner nevu CableModem OBJEKTUM connect nevű fgvt hívjuk
	System.out.println("Trying the DSL modem:");
	bellSouth.displaySpeed();                       //bellSouth nevu DslModem OBJEJTUM displaySpeed fgvt hívjuk
	bellSouth.connect();                            //bellSouth nevu DslModem OBJEJTUM connect fgvt hívjuk
	
}
}

// miközben a connect fgvt megtaláljuk az alosztályokban, nem fogjuk tudni megtalálni a displaySpeed függvényt
// a displaySpeed függvény mindkettőnél ugyanaz lesz(futtatásnál ismétlődik) azzaz a szuperosztályban kell keresnünk
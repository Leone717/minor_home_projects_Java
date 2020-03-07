package subnumbers;

public class SubNumbers {
	public static void main(String[] arguments)  {
		float sum = 0;
		for (int i = 0; i < arguments.length; i++) {//for ciklus, ami a bevitt sz�mok mennyis�g�t futtatja
			
			try {						//Try-Catch blokk megh�v�sa, ut�na j�n az eredeti k�d
		
//A BEVITT �RT�KEK CSAK KARAKTEREK, HI�BA SZ�MOK, �GY �T KELL ALAK�TANI SZ�M�RT�KK�
// A Float.parseFloat fgv lebeg�pontos(1.0stb) sz�mm� alak�tja a bevitt �rt�keket, �s hozz�adja a sum �rt�k�hez
//1. a sum 0, 
//2. a sum 2. sz�m, melyet �talak�t lebeg�pontoss�
//3. a 3. sz�mot �talak�tjuk lebeg�pontoss�, �s ezt hozz�adjuk az el�z� �sszeghez
			sum = sum + Float.parseFloat(arguments[i]);
		} catch (NumberFormatException e) {//Try-Catch, ahogy iedik elem nem sz�m, ki�rja az al�bbit: 
			System.out.println(arguments[i] + " is not a number.");//Try-Catch
			}
		}
		System.out.println("Those numbers add up to " + sum);//�s am�gy ki�rj a j�l bevitt sz�mok �sszeg�t
	}
}
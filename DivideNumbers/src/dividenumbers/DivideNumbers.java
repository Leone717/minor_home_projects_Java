package dividenumbers;


public class DivideNumbers {
	public static void main(String[] arguments)  {
		if (arguments.length == 2); {						//maximum 2db argumentumot vihet�nk be
			int result = 0;									//result �rt�ke 0 lesz
			try {											//try blokk a kiv�tel elkap�s�ra
				result = Integer.parseInt(arguments[0]) /	//fgv mely a 0. argumentumot int sz�mm� alak�ta, oszt�s
						Integer.parseInt(arguments[1]);		//fgv mely az 1. argumentumot int sz�mm� alak�ta
				System.out.println(arguments[0] + " divided by " +//println fgv
						arguments[1] + " equals " + result + "\n");
				} catch (NumberFormatException e) {			//catch blokk, ROSSZ SZ�MFORM�TUM fgv
					System.out.println("Both arguments must be numbers.\\n\\n");
				} catch (ArithmeticException e) {			//catch blokk, ROSSZ MIVEL 0-�T �RTUNK BE
					System.out.println("Cannot divided by zero.\n\n");
				}
			finally {								//finally fgv, mely MINDENK�PP V�GREHAJT�DIK a program v�g�n
				System.out.println("The last world is mine.");
			}
		}
	}
}

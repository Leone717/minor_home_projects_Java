package gradesswitchcase;

public class GradesSwitchCase {

		public static void main(String[] arg) {
			char grade  = 'A';						//bevezet�nk egy grade nev� char tipus� v�ltoz�t
			

			switch (grade) {						//switch kapcsol� ciklus a grade v�ltoz�hoz
			case 'A':								// case eset �s v�ltoz� char �rt�ke
				System.out.print("Excellent job");	//ki�r�s
				break;								//sz�net
			case 'B':
				System.out.print("You are good");
				break;
			case 'C':
				System.out.print("Medium performance");
				break;
			case 'D':
				System.out.print("Ok, nice ");
				break;
			case 'F':
				System.out.print("Sorry,you failed");
				break;
			}
			
		}
}
package gradesif;

	public class GradesIf {

		public static void main(String[] arg) {
					
			char grade  = 'B';						//bevezet�nk egy grade nev�, char tipus� v�ltoz�t
			
			if (grade == 'A')						//if ciklus, ha a grade=A, akkor ki�rja a lentit
				System.out.print("Excellent job");
			else if (grade == 'B')					//k�l�nben ha, grade=B, akkor ki�rja a lentit
				System.out.print("You are good");
			else if (grade == 'C')					//k�l�nben ha, grade=C, akkor ki�rja a lentit
				System.out.print("Medium performance");
			else if (grade == 'D')
				System.out.print("Ok, nice ");
			else //if (grade == 'F')				//k�l�nben grade=F, ki�rja a lentit
				System.out.print("Sorry, you failed");
			}
			
}

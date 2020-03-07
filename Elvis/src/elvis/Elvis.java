package elvis;

public class Elvis {

	public static void main(String[] arguments) {
		int weight = 250;												//megadjuk Elvis sulyat egy valtozoban
		System.out.println("Elvis weighs " + weight);					
		System.out.println("Elvis visits all-you-can-eat restaurant.");
		System.out.println("Elvis thtows Thanksgiving luau.");
		weight = weight + 10;											//+10el noveljuk a valtozot
		System.out.println("Elvis now weighs " + weight);
		System.out.println("Elvis discovers aerobics");
		weight = weight - 15;											//+15el csokkentjuk a valtozot
		System.out.println("Elvis now weighs " + weight);
		System.out.println("Elvis falls into washing machine during "
				+ "shrink cycle" );
		weight = weight / 3;											//3al osztjuk a valtozot
		System.out.println("Elvis weighs " + weight);
		System.out.println("Elvis clones himselft 12 times");
		weight = weight + (weight * 12);								//12-vel szorozzuk a valtozot
		System.out.println("The 13 Elvis now weight " + weight);
	}
}

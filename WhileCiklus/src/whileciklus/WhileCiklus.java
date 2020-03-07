package whileciklus;

public class WhileCiklus {
	public static void main(String[] arguments) {
		int limit = 5;
		int count = 1;
		while (count < limit ) {					//amíg a count értéke kisebb mint a limit, végrehajta
			System.out.println("Pork is not a verb");
			count++;								//a count értéket eggyel lépteti és futtatja a whilet újra
		}
	}
}

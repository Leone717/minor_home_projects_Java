package credits;

public class Credits {

	public static void main(String[] args) {
	// a film adatainak a beállítása
		String title = "The piano";					
		int year = 1993;
		String director = "Jane Campion";
		String role1 = "Ada";
		String actor1 = "Holly Hunter";
		String role2 = "Baines";
		String actor2 = "Harvey Keitel";
		String role3 = "Stewart";
		String actor3 = "Sam Neill";
		String role4 = "Flora";
		String actor4 = "Anna Paquin";
		// az adatok megjelen�t�se
		System.out.println(title + " (" +year + ") \n" + 	
				"A " + director + " film.\n\n" + 
				role1 + "\t" + actor1 + "\n" + 
				role2 + "\t" + actor2 + "\n" +
				role3 + "\t" + actor3 + "\n" +
				role4 + "\t" + actor4);
	}

}

// \t 	tabulátor
// \n 	új sor
// \n\n 2 üres sor 
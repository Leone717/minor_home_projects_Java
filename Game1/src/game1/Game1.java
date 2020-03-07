package game1;

public class Game1 {
	public static void main(String[] arg) {
		int total = 0;
		int score = 7;
		if (score ==7) {										//ha a score=7, akkor ki�rja az al�bbi f�ggv�nyt
			System.out.println("Your score a touchdown!");
		}
		if (score==3) {											//ha va score=3, akkor ki�rja az al�bbi f�ggv�nyt
			System.out.println("You kick a field goal!");
		}
		total = total + score;									//a total �rt�k a total �s score �rt�k �sszege lesz
		System.out.println("Total score: " + total );			//ki�r�dik a total �j �rt�ke 
	}

}
package point3d;

import java.awt.*;

public class TryPoints {									//létrehozzuk a Trypoints osztályt
	public static void main(String[] arguments) {
		Point object1 = new Point(11,22);		//létrehozzuk a Point osztály 1obejktumát 2 koordináta értékkel(x,y)
		Point3D object2 = new Point3D(7,6,64);	//u.a. csak Point3D osztály, 3 koordinátával(x,y,z)
		
		System.out.println("The 2D point is located at (" + object1.x + ", " + object1.y + ")" );
		System.out.println("\tIt's being moved to (4,13)");
		object1.move(4,13);
		System.out.println("The 2D point is now at (" + object1.x + ", " + object1.y + ")" );
		System.out.println("\tIt's being moved - 10 units on both the x" + " and y axes");
		object1.translate(-10,-10);
		System.out.println("The 2D point ends up at (" + object1.x + ", " + object1.y + ")\n");
		
		System.out.println("The 3D point is located at (" + object2.x 
				+ ", " + object2.y + ", " + object2.z + ")" );
		System.out.println("\tIt's being moved to (10, 22, 71)");
		object2.move(10,22,71);
		System.out.println("The 3D point is now at (" + object2.x 
				+ ", " + object2.y + ", " + object2.z + ")" );
		System.out.println("\tIt's being moved - 20 units x, y " + "and z axes");
		object2.translate(-20,-20,-20);
		System.out.println("The 3D point ends up at (" + object2.x 
				+  ", " + object2.y + ", " + object2.z + ")");				
	}
}
//object1.x : objektum1 x változója
//object1.y : objektum1 y változója

//object1.move(4,13); : a move függvény az object1-et a (4,13) HELYRE MOZGATJA
//object1.translate(-10,-10) : a translate függvény (-10,-10) MÉRTÉKBEN MOZDÍTJA EL, azaz növeli, csökkenti

//object2.x : objektum2 x változója
//object2.y : objektum2 x változója
//object2.z : objektum2 x változója

//object2.move(10,22,71); : a zárójelben megadott HELYRE MOZGATJA
//object2.translate(-20,-20,-20); : a zárójelben megadott értékkel CSÖKKENTI/NÖVELI
package point3d;


import java.awt.*;		//importáljuk a java.awt.* csomagot

public class Point3D extends Point{			//kibővítjük Point osztályra jellemzőkkel 
	public int z;							// bevezetjük a z változót mint 3. koordinátát mivel ezt nem 
											// nem tartalmazza ez az osztály

	public Point3D(int x, int y, int z) {	// bevezetünk 3db változót mint koordinátáta Point3D konstruktorhoz
		super(x,y);							// a szuperosztály változóira hivatkozunk (x,y)
		this.z = z;							// hivatkozunk a Point3D konstruktor változó tulajdonságaira (9. sor, z) 
	}										// lezárjuk az utasítást
	
	public void move(int x, int y, int z) {	// a move függvényhez bevezetünk 3db változót 
		this.z = z;							// hivatkozunk a Point3D osztály változó tulajdonságaira (z) 
		super.move(x,y);					// hivatkozunk a szuperosztály váltózióira a move függvényben
		}
	
	public void translate(int x, int y, int z) { // translate függvényhez megadjuk a 3db koordinátánkat
		this.z += z;							// hivatkozunk a Point3D osztály változó tulajdonságaira (z) 
		super.translate(x,y);					// hivatkozunk a szuperosztály váltózióira a translate f.-ben
	}

}

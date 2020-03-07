package definitionofvariables;

public class DefinitionOfVariables {

  public static void main(String args[]) {  
		
		byte smallestByte = Byte.MIN_VALUE;
                byte largestByte = Byte.MAX_VALUE;
                
		short smallestShort = Short.MIN_VALUE;   
                short largestShort = Short.MAX_VALUE;
                
		int smallestInteger = Integer.MIN_VALUE;
                int largestInteger = Integer.MAX_VALUE; 
                               
		long smallestLong = Long.MIN_VALUE;   
                long largestLong = Long.MAX_VALUE; 
                
		float smallestFloat = Float.MIN_VALUE;
                float largestFloat = Float.MAX_VALUE; 
                                               
		double smallestDouble = Double.MIN_VALUE;
                double largestDouble = Double.MAX_VALUE;
		
		char aChar = 'S';       
		boolean aBoolean = false;
		
	        System.out.println("The smallest byte value is " + smallestByte);
                System.out.println("The largest byte value is " + largestByte);
                System.out.println("\t");
                
          	System.out.println("The smallest short value is " + smallestShort); 
                System.out.println("The largest short value is " + largestShort);
                System.out.println("\t");
                
	        System.out.println("The smallest integer value is " + smallestInteger);
                System.out.println("The largest integer value is " + largestInteger);
                System.out.println("\t");
                                
	        System.out.println("The smallest long value is "+ smallestLong);
                System.out.println("The largest long value is "+ largestLong);
                System.out.println("\t");
                                
	        System.out.println("The smallest float value is " + smallestFloat);
                System.out.println("The largest float value is " + largestFloat);
                System.out.println("\t");
                                
      	        System.out.println("The smallest double value is " + smallestDouble); 
                System.out.println("The largest double value is " + largestDouble);
                System.out.println("\t");
	        
	        if (Character.isUpperCase(aChar)) {           
	        	System.out.println("The character " + aChar + " is upper case.");
                        System.out.println("\t");
	        	} 
	        else {           
	        	System.out.println("The character " + aChar + " is lower case.");
                        System.out.println("\t");
	        	}        
	        	System.out.println("The value of aBoolean is "+ aBoolean);   
	        	}
	}

/*Tipus Leiras Meret/formatum
(egeszek)
byte bajt meretu egesz 8-bit kettes komplemens
short rovid egesz 16-bit kettes komplemens
int eg�sz 32-bit kettes komplemens
long hosszu egesz 64-bit kettes komplemens
(valos szamok)
float egyszeres pontossagu lebegopontos 32-bit IEEE 754
double dupla pontossagu lebegopontos 64-bit IEEE 754
(egyeb tipusok)
char karakter 16-bit Unicode karakter
boolean logikai ertek true vagy false
*/ 

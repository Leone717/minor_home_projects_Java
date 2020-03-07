package celsius;

	public class Celsius {
	 public static void main(String[] args) {
	  
	  if (args.length != 2) {
	   System.out.println("You did not give 2 arguments!");
	   System.exit(0);
	  } 
	  
	  double temperature = Double.parseDouble(args[0]);
	  String from = args[1];
	  double result = 0;
	  if (from.equals("C")) {
	   result = 1.8 * temperature + 32;
	  } else {
	   result = (temperature - 32)/1.8;
	  }
	  
	  System.out.println(result);
	 }

	}

	
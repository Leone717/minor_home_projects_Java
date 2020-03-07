
package lambda;


public class Western {
    
    public String letsDoSomething(String input1, String input2, Integer input3, boolean input4){
        //Kalkuláció...
         System.out.println(input4 ? "UJ" : "Regi");
        return input1+input2+input3;
    }
    
    public String letsDoSomething(String input1, String input2, Integer input3){
        System.out.println("REGI");
        return letsDoSomething(input1, input2, input3, false);
    }
    
}

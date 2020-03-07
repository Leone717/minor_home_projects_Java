
package lambda;


public class Lambda {

    
    public static void maineeeeeeeeeeeeeeeeeeeeeer(String[] args) {
        
        String init = "";
        try {
            init = args[0];
        } catch (Exception e) {
            System.out.println("Régi módszerrel futok le");
        }
                            
        Western w = new Western();
        if (init.equals("new"))
            w.letsDoSomething("", "", 1, true);
        else
            w.letsDoSomething("", "", 1);
    }
        
        public void never() {
            Western w2 = new Western();
            w2.letsDoSomething("", "", 1);
        }
       
}

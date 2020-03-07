
package lambdagrr;


public class Lambda {
    
    public void letsDoThis(int a, Growl g){
        g.growling(a);
    }
    
    public void observe(){
     letsDoThis(2, a -> {
                System.out.println("A értéke: " + a);
                System.out.println(this);
            });
            }
    
    public static void main(String[] args) {
        
        Lambda lambda = new Lambda();
   /*     lambda.letsDoThis(1, new Growl(){
            
            
            @Override
            public void growling(int a){
                System.out.println("A értéke: " + a);
                System.out.println(this);
            }
            
          /*  @Override
            public String toString() {
                return "Belső referencia";
            }
            
           
            
        });*/
        
        /*Program prog = new Program();
        Dog dog = new Dog();
        prog.doSomething(dog);
        
        Growl growling = () -> System.out.println("Grrr");
     
        
        prog.doSomething(growling); 
        
        
        Thread t1 = new Thread(new Runnable() {

            @Override
            public void run() {
                System.out.println("FUTOOK");
            }
        });
        
        Thread t2 = new Thread(()-> System.out.println("FutiFuti"));
        
        t1.start();
        t2.start();*/
            
            lambda.observe();
        }
            @Override
            public String toString(){
                return "Ez egy külső referencia";
            }
    }
        


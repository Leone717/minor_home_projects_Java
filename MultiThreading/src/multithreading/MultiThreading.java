
package multithreading;

/*class Tasker implements Runnable {
    @Override
    public void run(){
        
        for(int i=0; i<5; i++){
            System.out.println("Mellékszál " + i);
            
            try {
                Thread.sleep(100);              
            } catch (InterruptedException ex) {
                
            }
        }        
    }
}
 */   
    


public class MultiThreading {

   
    public static void mainer(String[] args) {
        
          Thread t1 = new Thread(new Tasker());
          
          Thread t2 = new Thread(new Tasker());
          
          t1.start();
          t2.start();
    }
    /*  Tasker run1 = new Tasker();
        run1.start();
        
        Tasker run2 = new Tasker();
        run2.start();
    }
    */
}

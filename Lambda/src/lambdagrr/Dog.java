
package lambdagrr;

public class Dog implements Growl{
    
    @Override
    public void growling(int a) {
        System.out.println("Grrrrrr" + a);
    }
}

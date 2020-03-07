
package inandout;

import java.io.IOException;


public class InAndOut {

    
    public static void main(String[] args) throws IOException {
        
        Writer w = new Writer();
       w.bufferedWriter();
       w.writeMultipleCharacters();
        Reader r = new Reader();
        r.readMultipleCharacters();
//        Writer w = new Writer();
//        w.writeSingleChar();
//       int something = System.in.read();
//      System.out.println((char)something);
//        System.err.println("Baj van Gyula!");
//System.out.println("Gyula!");
    }
    
}

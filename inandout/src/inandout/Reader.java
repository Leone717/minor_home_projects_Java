
package inandout;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Reader {
    
    public void readSingleChar(){
        try {
            FileInputStream fis = new FileInputStream("C:\\Users\\Mike\\Documents\\NetBeansProjects\\inandout\\test.txt");
            int i = fis.read();
            System.out.println((char) i);
            
        } catch (Exception ex) {
            System.out.println(""+ex);
        }
    }
    
    public void readMultipleCharacters(){
        try {
            FileInputStream fis = new FileInputStream("C:\\Users\\Mike\\Documents\\NetBeansProjects\\inandout\\test.txt");
            BufferedInputStream bin = new BufferedInputStream(fis);
            int i = 0;
            String result = "";
            while((i=bin.read()) != -1) {
                result += (char) i;
            
            }         
            System.out.println(result);
            fis.close();
        } catch (Exception ex) {
            System.out.println(""+ex);
        }
    }
        
    public void bufferedReader(){
        try {
            FileInputStream fis = new FileInputStream("C:\\Users\\Mike\\Documents\\NetBeansProjects\\inandout\\test.txt");
            BufferedInputStream bin = new BufferedInputStream(fis);
            int i = 0;
            String result = "";
            while((i=bin.read()) != -1){
                result += (char) i;
            }
            System.out.println(result);
            fis.close();
        } catch (Exception ex) {
            System.out.println(""+ex);
        }
    }
    
      
}

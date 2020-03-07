
package inandout;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Writer {
    
    public void writeSingleChar(){
        try {
            FileOutputStream fos = new FileOutputStream("C:\\Users\\Mike\\Documents\\NetBeansProjects\\inandout\\test.txt");
            fos.write(65);
            fos.flush();
            fos.close();
            System.out.println("Készen vagyok");
        } catch (Exception ex) {
            System.out.println(""+ex);
        }
    }
    
     public void writeMultipleCharacters(){
        try {
            FileOutputStream fout = new FileOutputStream("C:\\Users\\Mike\\Documents\\NetBeansProjects\\inandout\\test.txt");
            String text = "San Franciscobol Jottem";
            byte a[] = text.getBytes();
            fout.write(a);
            fout.flush();
            fout.close();
            System.out.println("Készen vagyok");
        } catch (Exception ex) {
            System.out.println(""+ex);
        }
    }
     
    public void bufferedWriter() throws FileNotFoundException, IOException{
       
            FileOutputStream fout = new FileOutputStream("C:\\Users\\Mike\\Documents\\NetBeansProjects\\inandout\\test.txt");
            BufferedOutputStream bout = new BufferedOutputStream(fout);
            
            String text ="San Franciscobol Jottem";
            byte a[] = text.getBytes();
            bout.write(a);
            bout.flush();
            bout.close();
            fout.close();
            System.out.println("Készen vagyok");     
      }
    
}

package atmproject.secciona;

import java.util.Scanner;

/**
 *
 * @author miguelcatalan
 */
public class Teclado {
    
    private Scanner scan;
    
     public Teclado(){
            scan = new Scanner(System.in);
        }
    public int recibirEntrada(){
      return scan.nextInt();
    }
}

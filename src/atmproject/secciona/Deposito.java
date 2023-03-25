package atmproject.secciona;

/**
 *
 * @author miguelcatalan
 */
public class Deposito extends Transaccion {
    private Teclado tecladoObj;
    private Pantalla pantallaObj;
    
    Deposito(){
        this.tecladoObj =  new Teclado();
        this.pantallaObj = new Pantalla();
    }
    int deposito = 0;
    float depositoFinal = 0.0f;
    
 public void ejecutar() {
    pantallaObj.mostrarMensaje("ingrese el monto que desea depositar en centavos\n");
    pantallaObj.mostrarMensaje("Ingrese 0 para cancelar\n");
     deposito = tecladoObj.recibirEntrada();
     if(deposito == 0){
     pantallaObj.mostrarMensaje("Cancelo el deposito\n");
     }
     else{ depositoFinal = (deposito/100);
        System.out.println("has depositado:"+ depositoFinal);
     }  
    }
}

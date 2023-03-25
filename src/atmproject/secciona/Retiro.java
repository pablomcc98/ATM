package atmproject.secciona;

/**
 *
 * @author miguelcatalan
 */
public class Retiro extends Transaccion {

    private Teclado tecladoObj;
    private Pantalla pantallaObj;
    
    Retiro(){
        this.pantallaObj = new Pantalla();
        this.tecladoObj = new Teclado();
    } 
    int menu1 = 0;
    String otro ;
    public void ejecutar() {
        //super.ejecutar
        pantallaObj.mostrarMensaje("Menu de Retiro\n");
              pantallaObj.mostrarMensaje("1- $20\n"+"2- $40\n"+"3- $60\n"+ "4- $100\n"+"5- $200\n"+"6- Cancelar transaccion\n");
              pantallaObj.mostrarMensaje("Elija la opcion del monto de retiro\n");
              menu1 = tecladoObj.recibirEntrada();
             switch (menu1){
                 case 1:{
                   pantallaObj.mostrarMensaje("has retirado:");
                  pantallaObj.mostrarMensaje("$20\n");
                    pantallaObj.mostrarMensaje("Tome su efectivo\n");
             }
                 break;
                 case 2:{
                      pantallaObj.mostrarMensaje("has retirado:");
                      pantallaObj.mostrarMensaje("$40\n");
                      pantallaObj.mostrarMensaje("Tome su efectivo\n");
                 }
                 break;
                 case 3:{
                      pantallaObj.mostrarMensaje("has retirado:"); 
                      pantallaObj.mostrarMensaje("$60\n");  
                      pantallaObj.mostrarMensaje("Tome su efectivo\n");
                 }
                 break;
                 case 4:{
                      pantallaObj.mostrarMensaje("has retirado:"); 
                      pantallaObj.mostrarMensaje("$100\n");   
                      pantallaObj.mostrarMensaje("Tome su efectivo\n");
                 }
                 break;
                 case 5:{
                      pantallaObj.mostrarMensaje("has retirado:");
                      pantallaObj.mostrarMensaje("$200\n");
                      pantallaObj.mostrarMensaje("Tome su efectivo\n");
                 }
                 break;
                 case 6:{
                   if( menu1 == 6){
                       pantallaObj.mostrarMensaje("Cancelo la transaccion");
                   } 
    }
}
    }
}

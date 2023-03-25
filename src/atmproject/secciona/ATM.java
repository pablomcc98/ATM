
package atmproject.secciona;

/**
 *
 * @author miguelcatalan
 */
public class ATM {
   
  private Dispensador dispensadorObj;
  private Pantalla pantallaObj;
  private  RanuraDeDeposito ranuraDeDepositoObj;
  private  Teclado tecladoObj;
  private Cuenta cuentaObj;
  private Transaccion transaccionObj1;
 private Transaccion transaccionObj2;
  
   void depositar(int monto) { }
   void acreditar(int monto) { }
   void mostrarSaldo(int numeroDeCuenta) { }
   void retirar(int monto) { }
   void debitar(int monto) { }
   boolean autenticar(int nip, int numeroDeCuenta) { return true; }
    
   public ATM() {
        this.dispensadorObj = new Dispensador();
        this.pantallaObj = new Pantalla();
        this.ranuraDeDepositoObj = new RanuraDeDeposito();
        this.tecladoObj = new Teclado();
        this.cuentaObj = new Cuenta();  
        this.transaccionObj1 = new Retiro();
        this.transaccionObj2 = new Deposito();
        this.Inicializar();
    }
      public void Inicializar (){
      int numeroDeCuenta = 0;
      int nip = 0;
      int menu = 0;
      pantallaObj.mostrarMensaje("Bienvenido!\n");
      pantallaObj.mostrarMensaje("Ingrese su número de cuenta:"+"  ");
      cuentaObj.setNumeroDeCuenta(numeroDeCuenta = tecladoObj.recibirEntrada());
      pantallaObj.mostrarMensaje("Ingrese su numero de nip:"+ "   ");
      cuentaObj.setNip(nip = tecladoObj.recibirEntrada()); 
      pantallaObj.mostrarMensaje("menu Principal \n"+ "1 - Ver mi saldo \n"+ "2 - Retirar efectivo \n"+ "3 - Depositar fondo \n"+ "4 -Salir\n");
      menu = tecladoObj.recibirEntrada();
      switch(menu){
          case 1:{
              cuentaObj.setSaldo(10000);
          }
          break;
          case 2:{
            transaccionObj1.ejecutar();
          }
          break;
          
          case 3:{
            transaccionObj2.ejecutar();
          }
          break;
          case 4:{
              System.out.println("Salir\n");
          }
          break;
      }
  }
}

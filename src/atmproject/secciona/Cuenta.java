package atmproject.secciona;

/**
 *
 * @author miguelcatalan
 */
public class Cuenta {

    private float saldo;
    public int numeroDeCuenta;
    private int nip;
    Cliente clienteObj;
    public Cuenta() { 
        //System.out.println("Se crea nueva cuenta.");
    }     
    public Cliente getCliente() { 
        return this.clienteObj;
    }
    public void setCliente(Cliente cliente) {
        this.clienteObj = cliente;
    }    
    public float getSaldo() {
        return saldo;
    }
    public void setSaldo(float saldo) {
        this.saldo = saldo;
        System.out.println("el saldo actual es:"+saldo);
    }
    public int getNumeroDeCuenta() {
        return numeroDeCuenta;
    }
    public void setNumeroDeCuenta(int numeroDeCuenta) {
        
        if (numeroDeCuenta > 9999 && numeroDeCuenta < 100000) {
            this.numeroDeCuenta = numeroDeCuenta;
        } 
        else {
            System.out.println("Ingrese un numero de cuenta válido.");
        }
    }
    public int getNip() {
        return nip; 
    }
    public void setNip(int nip) {
        if (nip > 9999 && nip < 10000)
        this.nip = nip;
    
    else{
            System.out.println("ingrese un nip valido");
        }
    }
    public void acreditar(int monto) { }
    public void debitar(int monto) { }
    public float consultar(int numeroDeCuenta) {
        System.out.println("Se invoca a consulta(int)");
        return 0.0f; 
    }
    public void consultar() {
        System.out.println("Se invoca a consultar()");
    }

    public void consultar(String nombre, int monto) {
        System.out.println("Se invoca a consultar(String, int)");
    }
    
    public void consultar(Transaccion transaccionObj) {
        transaccionObj.ejecutar();
    }  
}

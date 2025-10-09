public class CuentaBancaria {
<<<<<<< Updated upstream
private double saldo;
public void depositar(double cantidad) {
if(cantidad>0) {
    saldo +=cantidad;
    }
}
    public void retirar(double cantidad) {
        if(cantidad<=saldo){
    saldo -=cantidad;
        }
else {
    System.out.println("no tienes saldo");
}
    }
    public double getSaldo() {
        return saldo ;
    }
=======
>>>>>>> Stashed changes

}

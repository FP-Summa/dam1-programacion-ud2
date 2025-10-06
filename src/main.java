import utilidades.CuentaBancaria;

public class main {
public static void main(String[] args) {
    CuentaBancaria cuenta= new CuentaBancaria();
    // ================================
        // EJERCICIO 1: Uso de atributos
        // ================================
        // 1. Intenta acceder directamente al atributo saldo:
        //    System.out.println(cuenta.saldo);
        // 2. Observa el error de compilación.

System.out.println(cuenta.saldo);
// Ejercicio 1: ¿por qué no puedo acceder al saldo directamente?
// Respuesta: No se puede acceder porque no he hecho uso de los atributos

        // ================================
        // EJERCICIO 2: Métodos públicos
        // ================================
        // 1. Ingresa 100€ usando depositar().
        // 2. Retira 30€ usando retirar().
        // 3. Imprime el saldo con getSaldo().
        CuentaBancaria cuenta = new CuentaBancaria();
        cuenta.depositar(100);          
        cuenta.retirar(30);             
        System.out.println(cuenta.getSaldo());
}
}

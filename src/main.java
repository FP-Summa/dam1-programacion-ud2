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
                cuenta.depositar(100);          
        cuenta.retirar(30);             
        System.out.println(cuenta.getSaldo());
        // Ejercicio 2: ¿por qué sí puedo usar los métodos depositar(), retirar() y getSaldo()?
        //Porque hemos empleado los atributos y metodos para establecerle valores
         // EJERCICIO 3: Métodos privados
         // Ejercicio 3: ¿qué significa el error al intentar llamar a registrarOperacion()?
         //Significa que no puedo accceder a el desde la clase main porque es un metodo privado
         cuenta.registrarOperacion("Hackeo",9999);
         // Ejercicio 4: 
// - ¿Qué ventajas tiene que saldo sea private?
//- Desde fuera de la clase **no puedes acceder directamente**.
//- Solo se accede a través de **métodos públicos de la clase**.
//- Esto te permite **controlar, validar y proteger los datos**.
// - ¿Qué pasaría si saldo fuera public?
//- Desde fuera de la clase puedes **leer y modificar directamente** el valor.
//- Es sencillo y rápido, pero poco seguro: cualquiera puede cambiar datos sin control.
// - ¿Por qué registrarOperacion es private en lugar de public?
// Porque es un Método privado → solo lo usa la propia clase



}
}

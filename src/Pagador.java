
import utilidades.Pago;

public class Pagador {
    public static void main(String[] args) {
        Pago pago = new Pago(2000);
        // ================================
        // EJERCICIO 1: Pagar en efectivo
        // ================================
        // 1. Llama al método pagar(double) pasando una cantidad.
        // 2. Observa qué se imprime.
        // Tu código aquí ↓
        pago.pagar(500);
        // Pregunta 1: ¿Qué información mínima (parámetros) se necesita para realizar un pago?
//con el parametro cantidad sirve
        // ================================
        // EJERCICIO 2: Pagar con tarjeta
        // ================================
        // 1. Llama al método pagar(double, String) pasando cantidad y un pin.
        // 2. Imprime el resultado.
        // Tu código aquí ↓
        pago.pagar(600, "20202");
        // Pregunta 2: ¿En qué se diferencia el pago con tarjeta respecto al pago en efectivo?
        //que el pago con tarjeta tiene dos parametros
        // ================================
        // EJERCICIO 3: Pagar con Bizum
        // ================================
        // 1. Llama al método pagar(double, int) pasando cantidad y un número de
        // teléfono.
        // 2. Imprime el resultado.
        // Tu código aquí ↓
        pago.pagar(30, 645605302);
// Pregunta 3: ¿Por qué es útil que todos se llamen "pagar"?
//es util porque el compilador decide que metodo usar en cada llamada
// Pregunta 4: ¿Qué pasaría si en lugar de pagar() hubiera métodos llamados pagarEfectivo(), pagarTarjeta(), pagarBizum()?
// ¿Qué ventaja aporta la sobrecarga de métodos?
//
    }
}
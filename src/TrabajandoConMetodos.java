import utilidades.Cancion;
import utilidades.DemoMetodos;

public class TrabajandoConMetodos {
    public static void main(String[] args) {
        DemoMetodos method = new DemoMetodos();
        // ================================
        // EJERCICIO 1: Métodos void
        // ================================
        // 1. Llama al método saludar() de la clase DemoMetodos.
        method.saludar();
        // Ejercicio 1: ¿Qué ocurre al llamar a un método void como saludar()?
        // Un método declarado como void no devuelve ningún valor.
        // ================================
        // EJERCICIO 2: Métodos con retorno
        // ================================
        // 1. Llama al método sumar(5, 3).
        // 2. Guarda el resultado en una variable e imprímelo.
        // 3. Llama al método presentar("Lucía") e imprime el resultado.
        int ResultadoSuma = method.sumar(5, 3);
        System.out.println(ResultadoSuma);
        String saludo = method.presentar("Lucia");
        System.out.println(saludo);
        // Ejercicio 2: ¿Qué diferencia hay entre un método void y uno con retorno?
        // el metodo void no devuelve ningun valor mientras que el metodo con retorno si
        // devuelve un valor como int o string y se puede guardar en una variable
        // ================================
        // EJERCICIO 3: Paso por valor (primitivos)
        // ================================
        // 1. Declara una variable int n = 10.
        // 2. Llama a method.incrementar(n).
        // 3. Imprime n después de llamar al método.
        // Tu código aquí ↓
        int n = 10;
        method.incrementar(n);
        System.out.println(n);
        // Ejercicio 3: ¿Ha cambiado la variable n fuera del método incrementar()?
        // ¿Por qué?
        // No, el valor de n no cambia fuera del método.
        // ================================
        // EJERCICIO 4: Paso por referencia (objetos)
        // ================================
        // 1. Crea un objeto Cancion con título "Original" - Usa el constructor
        // parametrizado
        // que recibe 2 argumentos: título y artista.
        // 2. Llama a method.cambiarTitulo(cancion).
        // 3. Imprime la canción después.
        // Tu código aquí ↓
        Cancion c1 = new Cancion("original", "");
        method.cambiarTitulo(c1);
        System.out.println(c1);
        // Ejercicio 4: ¿Qué ha ocurrido con el título de la Cancion al usar
        // cambiarTitulo()?
        // ¿Por qué es diferente al caso del int?
        // Sale cancion modificada porque los objetos se pueden modificar dentro del
        // metodo, sin embargo las variables tipo int etc no cambian fuera del metodo
    }
}

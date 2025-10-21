public class GestorTareas {

    public static void main(String[] args) {

        // ================================
        // EJERCICIO 1: Bienvenida
        // ================================
        // Crea un método llamado que muestre un mensaje de bienvenida al programa.
        // No necesita devolver nada, solo imprimir por consola.

        // Tu código aquí ↓
    
 Bienvenida("hola");

        // ================================
        // EJERCICIO 2: Duración total
        // ================================
        // Crea un método que reciba la duración (en minutos) de dos tareas
        // y devuelva el total de minutos.
        // Llama al método con 45 y 30 y muestra el resultado en consola.

        // Tu código aquí ↓
        int total = Duracion(45, 35);
        System.out.println(total);
        // ================================
        // EJERCICIO 3: Conversión de tiempo
        // ================================
        // Crea un método que reciba una cantidad de minutos
        // y muestre en pantalla cuántas horas y minutos son.
        // Ejemplo: 150 minutos → "Son 2 horas y 30 minutos".
        // No tiene que devolver nada.
cantidad(150);
        // Tu código aquí ↓

        // ================================
        // EJERCICIO 4: Recordatorios
        // ================================
        // Crea un método que reciba el nombre de una tarea y una prioridad (1–3)
        // y muestre un mensaje como:
        // "📌 [Prioridad 2] Revisar correo".
        // Solo muestra el mensaje, no devuelve nada.
Recordatorios("hola", 2);
        // Tu código aquí ↓

        // ================================
        // EJERCICIO 5: Estado de tareas
        // ================================
        // Crea un método que reciba un valor booleano que indique si la tarea está
        // completada.
        // Debe devolver un texto: "✅ Completada" o "⏳ Pendiente".
        // Muestra el resultado de llamar al método con ambos casos.

        // Tu código aquí ↓
 System.out.println(Tarea(true));
 System.out.println(Tarea(false));
        // ================================
        // EJERCICIO 6: Productividad
        // ================================
        // Crea un método que reciba el número total de tareas y las completadas
        // y devuelva el porcentaje de avance (por ejemplo, 70.0 si 7/10).
        // Muestra el resultado en consola.
Productividad(10,8);
        // Tu código aquí ↓

        // ================================
        // EJERCICIO 7: Sobrecarga
        // ================================
        // Crea dos métodos con el mismo nombre:
        // - uno sin parámetros, que muestre un mensaje genérico (ejemplo: "Hola crack";
        // - otro con parámetros (nombre de usuario, número de tareas completadas) "Hola
        // {usuario} completaste {numero} de tareas"
        // que muestre un resumen personalizado.
        // Llama a ambos desde main.
        Sobrecarga();
Sobrecarga("Nicolas",10);
    
        // Tu código aquí ↓

        // ================================
        // EJERCICIO 8: Bonus - Planificación
        // ================================
        // Crea un método que reciba el nombre de una tarea y su duración en minutos,
        // y devuelva un texto con la planificación:
        // "La tarea [nombre] durará aproximadamente X horas y Y minutos."
        // Muestra el texto en pantalla.

        // Tu código aquí ↓
       String resultado= planificacion("estudiar", 150);
        System.out.println(resultado);
    }

    // Aquí debéis crear los métodos fuera del main ↓↓↓
    // Ejericio1
    public static void Bienvenida(String name) {
       System.out.println(name);
        
    }

    // Ejercicio2
    public static int Duracion(int a, int b) {
        return (a + b);
    }
    //Ejercicio 3
    public static void cantidad(int minutos){
        int hora=minutos/60;
        int minutosRestantes=minutos%60;
        System.out.println("son "+hora+"y "+ minutosRestantes+"minutos");
    }
    //Ejercicio 4
    public static void Recordatorios(String tarea,int prioridad){
                if(prioridad>=1 && prioridad<=3){
System.out.println("["+"prioridad "+prioridad+"]"+tarea);
        }
    }
    
        // Ejercicio 5
    public static String Tarea(boolean tarea) {
        if (tarea) {
                    return ("Completada");
        } else {
                        return ("Pendiente");
        }
    }
        // Ejercicio6
public static void Productividad(int tareasTotal,int tareasCompletadas){
    int tareas=(tareasTotal/tareasCompletadas*100);
    System.out.println("Porcentaje de avance "+tareas);
}
    //Ejercicio 7
    public static void Sobrecarga(){
        System.out.println("Hola cracks");
    }
    public static void Sobrecarga(String name, int tareasCompletadas){
        System.out.println("Nombre "+name+" tareas completadas "+tareasCompletadas);
    }
    //Ejercicio 8
public static String planificacion(String tarea,int minutos){
int horas=minutos/60;
int minutosRestantes=minutos%60;
return("el nombre de la tarea es "+tarea +"y dura "+minutos);
}
    }

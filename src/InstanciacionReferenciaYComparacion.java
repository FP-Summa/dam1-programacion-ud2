import utilidades.Cancion;
import utilidades.Pelicula;

public class InstanciacionReferenciaYComparacion {
    public static void main(String[] args) {
        // Ejercicio 1:Crear objetos con new
        Cancion c1 = new Cancion();
        Cancion c2 = new Cancion("Clocks", "Coldplay");
        System.out.println(c1);
        System.err.println(c2);
        // Ejercicio 1: ¿Qué diferencia hay entre el constructor por defecto y el
        // parametrizado?
        // El constructor poir defecto no recibe parametros, sino que inicia el objeto
        // con valores predeterminados.
        // EJERCICIO 2: Comparación con ==

        Cancion c3 = new Cancion("Clocks", "Coldplay");
        Cancion c4 = new Cancion("Clocks", "Coldplay");
        System.out.println(c3 == c4);
        // Ejercicio 2: ¿Por qué da false al comparar con == dos objetos con los mismos
        // datos?
        // Porque los objetos no apuntan a la misma direccion ya que aunque tengan el
        // mismo titulo y artista pueden haber muchos titulos iguales.
        // EJERCICIO 3: Comparación con equals()
        System.out.println(c3.equals(c4));
        // Ejercicio 3: ¿Qué diferencia hay entre == y equals()? ¿Por qué ahora sí
        // devuelve true?
        // Porque el equals puede reescribirse y solo compararia las palabras como tal y
        // da true porque el titulo y artista son los mismos.
        // EJERCICIO 4: Comparación en Pelicula
        Pelicula p1 = new Pelicula("Despacito", 2017);
        Pelicula p2 = new Pelicula("Despacito", 2017);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p1 = p2);
        System.out.println(p1.equals(p2));
        // Ejercicio 4: ¿Por qué en Pelicula equals no funciona como en Cancion?

        // EJERCICIO 5: Referencias
        Cancion c5 = new Cancion("Clocks", "Coldplay");
        Cancion c6 = c5;
        System.out.println(c6 == c5);
        c6.setTitutlo("Cambio");
        System.out.println(c5);

        // EJERCICIO 6: null
        Pelicula p3 = null;
        System.out.println(p3);
        p3.getTitulo();
    }
}

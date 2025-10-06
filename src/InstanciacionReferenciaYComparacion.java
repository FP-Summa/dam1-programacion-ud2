import utilidades.Cancion;
import utilidades.Pelicula;

public class InstanciacionReferenciaYComparacion {
public static void main(String[] args) {
    //Ejercicio 1:Crear objetos con new
   Cancion c1 =new Cancion();
Cancion c2= new Cancion("Clocks","Coldplay");
System.out.println(c1);
System.err.println(c2);

//EJERCICIO 2: Comparación con ==

Cancion c3=new Cancion("Clocks","Coldplay");
Cancion c4=new Cancion("Clocks","Coldplay");
System.out.println(c3==c4);
// EJERCICIO 3: Comparación con equals()
System.out.println(c3.equals(c4));
 // EJERCICIO 4: Comparación en Pelicula
   Pelicula p1 =new Pelicula("Despacito",2017);
 Pelicula p2 =new Pelicula("Despacito",2017);
 System.out.println(p1);
 System.out.println(p2);
 System.out.println(p1=p2);
 System.out.println(p1.equals(p2));

  // EJERCICIO 5: Referencias
  Cancion c5=new Cancion("Clocks","Coldplay");
  Cancion c6=c5;
  System.out.println(c6==c5);
  c6.setTitutlo("Cambio");
  System.out.println(c5);

// EJERCICIO 6: null
Pelicula p3=null;
System.out.println(p3);
p3.getTitulo();
}
}
















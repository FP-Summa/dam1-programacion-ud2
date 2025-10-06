public class InstanciacionReferenciaYComparacion {
public static void main(String[] args) {
    //Ejercicio 1:Crear objetos con new
    private String titulo;
    private String artista;
    public Cancion(){
        this.titulo="Sin titulo";
        this.artista="Sin artista";
    }
        Cancion c1=new Cancion();
        System.out.println(c1);


//EJERCICIO 2: Comparación con ==

Cancion c3=new Cancion("nombre:Despacito,anio:2017");
Cancion c4=new Cancion("nombre:Despacito,anio:2017");
System.out.println(c3==c4);
// EJERCICIO 3: Comparación con equals()
System.out.println(c3.equals(c4));
 // EJERCICIO 4: Comparación en Pelicula
 private String name;
 private String anio;
  Pelicula();{
    this.name="Armagedon";
    this.anio=2017;
 }
 Pelicula p1=new Pelicula(name,anio);
  Pelicula p2=new Pelicula(name,anio);
  System.out.println(p1==p2);
 
}
}
















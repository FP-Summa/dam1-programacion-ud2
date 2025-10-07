import java.util.Scanner;
import utilidades.ProcesadorTexto;
import utilidades.Usuario;
 
public class DatosUsuario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce tu nombre: ");
        String nombre = sc.nextLine();
        nombre =nombre.toUpperCase();
        System.out.print("Introduce tu email: ");
        String email = sc.nextLine();
        System.out.print("Introduce tu edad: ");
        int edad = sc.nextInt();
               boolean emailValido = ProcesadorTexto.esEmailValido(email); //utiliza un metodo estático de la clase ProcesadorTexto
        if(emailValido){
            Usuario usuario = new Usuario(nombre, edad, email); //crea un objeto (variable) nuevo de la clase Usuario
            usuario.mostrarInformacion();
        }else{
            System.out.println("El usuario no puede ser creado porque el email introducido no es válido");
        }
        sc.close();
    }
}
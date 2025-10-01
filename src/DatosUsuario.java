
import utilidades.ProcesadorTexto;
import utilidades.Usuario;
 
public class DatosUsuario {
    Scann
    
        boolean emailValido = ProcesadorTexto.esEmailValido(email);
        if(emailValido){
            Usuario usuario = new Usuario(nombre, edad, email); 
            usuario.mostrarInformacion();
        }else{
            System.out.println("El usuario no puede ser creado porque el email introducido no es válido");
        }
        sc.close();
    }
 
    }
}

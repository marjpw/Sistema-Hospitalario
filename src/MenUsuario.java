import java.util.Scanner;
import java.util.Random;

public class MenUsuario {
    Scanner sc = new Scanner(System.in);
    Random ran = new Random();
    String[] toDo = {"Iniciar sesion.", "Registrarse.", "Salir."};
    void mostrarMenu(){
        int opcion;
        do{
            System.out.println("\t---Bienvenido---\n");
            for(int i=0; i< toDo.length; i++){ System.out.println((i+1) + ". " + toDo[i]); }
            System.out.println("Elije una opcion: ");
            opcion = sc.nextInt();

            switch(opcion){
                case 1 -> IniciarSesion();
                case 2 -> Registrarse();
                case 3 -> Salir();
                default -> System.out.println("Ingrese una opcion valida.");
            }
        }while(opcion != 0);
    }

    void IniciarSesion(){
        System.out.println("Usuario: ");
        String name = sc.nextLine();
        System.out.println("Contraseña: ");
        int pssw = sc.nextInt();
    }
    void Registrarse(){
        System.out.println("Nombre: ");
        String name = sc.nextLine();
        System.out.println("Apellido: ");
        String lName = sc.nextLine();
        System.out.println("Correo: ");
        String email = sc.nextLine();
        System.out.println("DNI: ");
        int dni = sc.nextInt();
        int ID = ran.nextInt(1000000, 9999999);
    }
    boolean Salir(){
        return true;
    }
}

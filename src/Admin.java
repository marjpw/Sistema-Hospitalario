import java.util.Scanner;

public class Admin {
    Scanner sc = new Scanner(System.in);

    String[] toDo = {"Registrar paciente", "Registrar medicos", "Gestionar citas",
            "Generar facturas y pagos", "Reportes generales"};

    void menuAdmin(){
        int opcion;
        MenUsuario menu = new MenUsuario();
        do{
            System.out.println("\t---Menu Admin--\n");
            for(int i=0; i< toDo.length; i++){ System.out.println((i+1) + ". " + toDo[i]); }
            System.out.println("Elije una opcion: ");
            opcion = sc.nextInt();

            switch(opcion){
                case 1 -> registrarPaciente();
                case 2 -> registrarMedico();
                case 3 -> gestionarCitas();
                case 4 -> generarFacturas();
                case 5 -> reportesGenerales();
                default -> System.out.println("Ingrese una opcion valida.");
            }
        }while(opcion != 0);
    }
    void registrarPaciente(){

    }
    void registrarMedico(){

    }
    void gestionarCitas(){

    }
    void generarFacturas(){

    }
    void reportesGenerales(){

    }
}

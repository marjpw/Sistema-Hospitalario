import java.util.Scanner;

public class MainMenu {
    Scanner sc = new Scanner(System.in);
    String[] toDo = {"Administrador", "Medico", "Paciente"};
    MenUsuario user = new MenUsuario();
    String nombre;
    String apellido;
    String password;
    int DNI;
    int ID;
    void mostrarMenu(){
        int opcion;
        do{
            System.out.println("\t---Tipo de usuario---\n");
            for(int i=0; i< toDo.length; i++){ System.out.println((i+1) + ". " + toDo[i]); }
            System.out.println("Elije una opcion: ");
            opcion = sc.nextInt();

            switch(opcion){
                case 1 -> adminUser();
                case 2 -> medicUser();
                case 3 -> patientUser();
                default -> System.out.println("Ingrese una opcion valida.");
            }
        }while(opcion != 0);
    }
    void adminUser(){
        Admin admin = new Admin();
        user.mostrarMenu();
    }
    void medicUser(){
        Medico medic = new Medico();
        user.mostrarMenu();
    }
    void patientUser(){
        Paciente patient = new Paciente();
        user.mostrarMenu();
    }
}

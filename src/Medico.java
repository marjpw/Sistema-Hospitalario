import java.util.Scanner;

public class Medico {
    Scanner sc = new Scanner(System.in);
    String[] toDo = {"Consultar agenda de citas", "Ver historial medico de pacientes asignados",
            "Registrar diagnostico"};

    void menuMedico(){
        int opcion;
        do{
            System.out.println("\t---Menu Medico--\n");
            for(int i=0; i< toDo.length; i++){ System.out.println((i+1) + ". " + toDo[i]); }
            System.out.println("Ingrese una opcion: ");
            opcion = sc.nextInt();
            switch(opcion){
                case 1 -> agendarCita();
                case 2 -> historialMedico();
                case 3 -> registrarDiagnostico();
                default -> System.out.println("Ingrese una opcion valida.");
            }
        }while(opcion!=0);
    }

    void agendarCita(){

    }
    void historialMedico(){

    }
    void registrarDiagnostico(){

    }

}

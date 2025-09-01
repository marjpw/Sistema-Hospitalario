import java.util.Scanner;

public class Paciente {
    Scanner sc = new Scanner(System.in);
    String[] toDo = {"Pedir cita medica con un especialista",
            "Cancelar/reprogramar su cita", "Ver historial de citas",
            "Ver diagnosticos dados por el medico", "Consultar facturas o pagos"};

    void menuPaciente(){
        System.out.println("\t---Menu Admin--\n");
        for(int i=0; i< toDo.length; i++){ System.out.println((i+1) + ". " + toDo[i]); }
        System.out.println("Ingrese una opcion: ");
        int opcion = sc.nextInt();

        switch(opcion){
            case 1 -> pedirCita();
            case 2 -> cancelarReprogramarCita();
            case 3 -> historalCitas();
            case 4 -> verDiagnosticos();
            case 5 -> consultarFacturas();
            default -> System.out.println("Ingrese una opcion valida.");
        }
    }
    void pedirCita(){
        System.out.println("Pidiendo cita.");
    }
    void cancelarReprogramarCita(){
        System.out.println("Cancalando o reprogramando cita.");
    }
    void historalCitas(){
        System.out.println("Mostrando historial de citas.");
    }
    void verDiagnosticos(){
        System.out.println("Mostrando diagnósticos generados por el doctor.");
    }
    void consultarFacturas(){
        System.out.println("Mostrando las facturas.");
    }
}

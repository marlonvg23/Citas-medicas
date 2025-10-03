import java.util.Scanner;

public class SistemaCitasApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Registrar un doctor
        Doctor doc = new Doctor();
        System.out.println("=== Alta de Doctor ===");
        System.out.print("ID del doctor: ");
        String idDoc = sc.nextLine();
        System.out.print("Nombre del doctor: ");
        String nombreDoc = sc.nextLine();
        System.out.print("Especialidad: ");
        String especialidad = sc.nextLine();
        doc.altaDatosDeDoctor(idDoc, nombreDoc, especialidad);

        // Registrar un paciente
        Paciente pac = new Paciente();
        System.out.println("\n=== Alta de Paciente ===");
        System.out.print("ID del paciente: ");
        String idPac = sc.nextLine();
        System.out.print("Nombre del paciente: ");
        String nombrePac = sc.nextLine();
        pac.altaDatosDePaciente(idPac, nombrePac);

        // Registrar una cita
        Cita cita = new Cita();
        System.out.println("\n=== Alta de Cita ===");
        System.out.print("ID de la cita: ");
        String idCita = sc.nextLine();
        System.out.print("Fecha y hora de la cita: ");
        String fechaHora = sc.nextLine();
        System.out.print("Motivo de la cita: ");
        String motivo = sc.nextLine();
        cita.altaDatosDeCita(idCita, fechaHora, motivo, doc, pac);

        // Mostrar resumen
        System.out.println("\n--- Datos Registrados ---");
        System.out.println(doc);
        System.out.println(pac);
        System.out.println(cita);

        sc.close();
    }
}

public class Cita {
    private String idCita;
    private String fechaHora;
    private String motivo;
    private Doctor doctor;
    private Paciente paciente;

    // Método para registrar datos de la cita
    public void altaDatosDeCita(String id, String fechaHora, String motivo, Doctor doctor, Paciente paciente) {
        this.idCita = id;
        this.fechaHora = fechaHora;
        this.motivo = motivo;
        this.doctor = doctor;
        this.paciente = paciente;
    }

    @Override
    public String toString() {
        return "Cita ID=" + idCita +
               ", FechaHora=" + fechaHora +
               ", Motivo=" + motivo +
               ", Doctor=" + doctor.getNombreDoctor() +
               ", Paciente=" + paciente.getNombrePaciente() + " ";
    }
}

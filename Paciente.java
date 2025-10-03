public class Paciente {
    private String idPaciente;
    private String nombrePaciente;

    // Método para registrar datos del paciente
    public void altaDatosDePaciente(String id, String nombre) {
        this.idPaciente = id;
        this.nombrePaciente = nombre;
    }

    public String getIdPaciente() {
        return idPaciente;
    }

    public String getNombrePaciente() {
        return nombrePaciente;
    }

    @Override
    public String toString() {
        return "Paciente ID=" + idPaciente + ", Nombre=" + nombrePaciente + " ";
    }
}

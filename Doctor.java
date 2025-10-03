public class Doctor {
    private String idDoctor;
    private String nombreDoctor;
    private String especialidad;

    // Método para registrar datos del doctor
    public void altaDatosDeDoctor(String id, String nombre, String especialidad) {
        this.idDoctor = id;
        this.nombreDoctor = nombre;
        this.especialidad = especialidad;
    }

    public String getIdDoctor() {
        return idDoctor;
    }

    public String getNombreDoctor() {
        return nombreDoctor;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    @Override
    public String toString() {
        return "Doctor ID=" + idDoctor + ", Nombre=" + nombreDoctor + ", Especialidad=" + especialidad + " ";
    }
}

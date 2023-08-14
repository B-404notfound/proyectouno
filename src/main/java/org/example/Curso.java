package org.example;

public class Curso extends Persona {

    private String profesor;
    private String asignatura;
    private String horario;

    public Curso(String nombre, String apellido, String rut, String email, Integer edad, String profesor, String asignatura, String horario) {
        super(nombre, apellido, rut, email, edad);
        this.profesor = profesor;
        this.asignatura = asignatura;
        this.horario = horario;
    }

    public String getProfesor() {
        return profesor;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
}

//Programador: Ángel Sánchez    Fecha: 11/Mayo/2018
//Archivo: Clase Docente
//Propósito: Esta clase representará a los academicos, profesores y asistentes
//           de las academias en la facultad de Estadísticas e Informática. 
//           Asimismo, se encarga de realizar el manejos de formatos para la
//           clase se usuario "Académico".
package pcs.is.domain;

import java.util.ArrayList;

public class Docente {

    private int numeroPersonal;
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String correoElectronico;
    private ArrayList<Curso> curso = new ArrayList<>();

    public int getNumeroPersonal() {
        return numeroPersonal;
    }

    public void setNumeroPersonal(int numeroPersonal) {
        this.numeroPersonal = numeroPersonal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public ArrayList<Curso> getCurso() {
        return curso;
    }

    public boolean asignarCurso(Curso curso) {
        return this.curso.add(curso);
    }

    public boolean crearPlanDeCurso() {

        try {
            PlanDeCurso nuevo = new PlanDeCurso();

            return true;
        } catch (NullPointerException npe) {

        }
        return false;
    }

}

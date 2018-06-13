//Programador: Ángel Dabiel Sánchez Martínez   Fecha: 12/06/2018
//Archivo: Avance.java
//Propósito: guardar toda la información que un docente registra en
//           el formato "Avance programático", el cual identifica el
//           cuánto progreso se lleva de la planeación 
package pcs.is.domain;

import java.util.ArrayList;

public class AvanceProgramatico {
    private int nrc; 
    private String experienciaEducativa;
    private String programaEducativo; //Nombre de la carrera
    private int bloque; //Guarda el número de semestre al que pertenece
    private int seccion; 
    private Docente academico;
    private String periodo; //Tiempo que dura el semestre con formato mesAñoInicio/MesAñoFin
    private String objetivoGeneral;
    private ArrayList<Avance> avance;
    
    public AvanceProgramatico(){
        avance= new ArrayList<>();
    }

    public int getNrc() {
        return nrc;
    }

    public void setNrc(int nrc) {
        this.nrc = nrc;
    }

    public String getExperienciaEducativa() {
        return experienciaEducativa;
    }

    public void setExperienciaEducativa(String experienciaEducativa) {
        this.experienciaEducativa = experienciaEducativa;
    }

    public String getProgramaEducativo() {
        return programaEducativo;
    }

    public void setProgramaEducativo(String programaEducativo) {
        this.programaEducativo = programaEducativo;
    }

    public int getBloque() {
        return bloque;
    }

    public void setBloque(int bloque) {
        this.bloque = bloque;
    }

    public int getSeccion() {
        return seccion;
    }

    public void setSeccion(int seccion) {
        this.seccion = seccion;
    }

    public Docente getAcademico() {
        return academico;
    }

    public void setAcademico(Docente academico) {
        this.academico = academico;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public String getObjetivoGeneral() {
        return objetivoGeneral;
    }

    public void setObjetivoGeneral(String objetivoGeneral) {
        this.objetivoGeneral = objetivoGeneral;
    }
    
    public void agregarAvance(){
        Avance nuevo= new Avance();
        
        avance.add(nuevo);
    }
}

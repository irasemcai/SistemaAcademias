//Programador: Ángel Dabiel Sánchez Martínez   Fecha: 12/06/2018
//Archivo: Avance.java
//Propósito: clase parte del formado "Avance programático" 
package pcs.is.domain;

public class Avance {
    private int unidad;
    private int porcentajeAvance;
    private String observaciones;

    public Avance() {
    }

    public int getUnidad() {
        return unidad;
    }

    public void setUnidad(int unidad) {
        this.unidad = unidad;
    }

    public int getPorcentajeAvance() {
        return porcentajeAvance;
    }

    public void setPorcentajeAvance(int porcentajeAvance) {
        this.porcentajeAvance = porcentajeAvance;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
}

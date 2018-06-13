package pcs.is.domain;

import java.util.ArrayList;

class PlanDeCurso {
    private Curso curso;
    private String programaEducativo;
    private String periodo;
    private String objetivoGeneral;
    private ArrayList<Bibliografia> bibliografia;
    private ArrayList<Planeacion> planeacion;
    

    public PlanDeCurso(Curso curso, String programaEducativo, String periodo, String objetivoGeneral) {
        this.curso = curso;
        this.programaEducativo = programaEducativo;
        this.periodo = periodo;
        this.objetivoGeneral = objetivoGeneral;
        insertarFuente();
    }
    
    private void insertarFuente(){
        bibliografia= new ArrayList<>();
        while(true){
            Bibliografia nueva= new Bibliogragfia();
            
            nueva.setAutor();
            nueva.setTituloLibro();
            nueva.setEditorial();
            nueva.setAnio();
            bibliografia.add(nueva);
        }
    }
    
}

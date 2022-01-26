/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espol.model;

/**
 *
 * @author Issac Maza
 */
public class Criterio {
    private int id;
    private String descripcion;
    private ArrayList<Evaluacion> evaluaciones;
    private int idConcurso;
    private Concurso concurso;
    //constructor
    
    public Criterio(int id, String descripcion, Concurso concurso){
        this.id = id;
        this.descripcion = descripcion;
        this.evaluaciones = new ArrayList<>();
        this.idConcurso = concurso.getId();
        this.concurso = concurso;
    }

    //setters
    public void setId(int id) {
        try{
            if(verificarID(id) != null)
                throw new IDCriterioException("ID existente. Ingrese una nueva");
            this.id = id;
        }
        catch(IDCriterioException ex){
            Alert a = new Alert(AlertType.ERROR, ex.getMessage());
            a.show();

        }
    }

    public void setDescripcion(String descripcion) {
        if(descripcion != null)
            this.descripcion = descripcion;   
    }

    public void setEvaluaciones(ArrayList<Evaluacion> evaluaciones) {
        if(evaluaciones != null)
            this.evaluaciones = evaluaciones;
    }

    public void setIdConcurso(int idConcurso) {
        try{
            if(Concurso.verificarID(idConcurso)==null)
                throw new IDConcursoException("Id no existente. Ingrese uno correctamente");
            this.idConcurso = idConcurso;
        }
        catch(IDConcursoException ex){
            System.out.println(ex.getMessage());
        }
        
    }

    public void setConcurso(Concurso concurso) {
        if(concurso != null)
            this.concurso = concurso;
    }

    public int getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public <any> getEvaluaciones() {
        return evaluaciones;
    }

    public int getIdConcurso() {
        return idConcurso;
    }

    public Concurso getConcurso() {
        return concurso;
    }
    
    
    
}


package es.trapasoft.academia.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

/**
 *
 * @author SGEN0290
 */
@Entity
@Table(name = "asignaturas")
public class Asignatura {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false, length = 50)
    private String nombre;
    
    private String descripcion;
    
    @ManyToOne
    @JoinColumn(name = "id_curso")
    private Curso curso;
    
    
    // constructores
    public Asignatura() {
    }

    public Asignatura(String nombre, String descripcion, Curso curso) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.curso = curso;
    }

    // getters /setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }  
    
    
}

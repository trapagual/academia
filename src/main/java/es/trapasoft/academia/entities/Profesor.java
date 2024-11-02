package es.trapasoft.academia.entities;

import jakarta.persistence.Embeddable;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

/**
 *
 * @author SGEN0290
 */
@Entity
@Table(name = "profesores")
public class Profesor {
    @EmbeddedId
    ProfesorId id;
    
    @ManyToOne
    @JoinColumn(name="id_usuario")
    private Usuario usuario;
 
    @ManyToOne
    @JoinColumn(name="id_asignatura")
    private Asignatura asignatura;
    
    
}

@Embeddable
class ProfesorId {
    Long idUsuario;
    Long idAsignatura;
}

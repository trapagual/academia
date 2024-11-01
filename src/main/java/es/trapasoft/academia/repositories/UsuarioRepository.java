package es.trapasoft.academia.repositories;

import es.trapasoft.academia.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author SGEN0290
 */
@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    
}

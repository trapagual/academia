package es.trapasoft.academia.services;

import es.trapasoft.academia.entities.Usuario;
import es.trapasoft.academia.repositories.UsuarioRepository;
import jakarta.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

/**
 *
 * @author SGEN0290
 */
@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository repo;

    public Usuario crearUsuario(Usuario u) {
        return repo.save(u);
    }

    public List<Usuario> listarUsuarios() {
        return repo.findAll();
    }

    public ResponseEntity<Usuario> obtenerUsuarioPorId(Long id) {
        Optional<Usuario> u = repo.findById(id);

        return new ResponseEntity.ofNullable(u);
    }

    public Usuario actualizarUsuario(Long id, Usuario u) {
        Usuario usu = repo.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("No se encuentra usuario"));

        usu.setNombre(u.getNombre());
        usu.setEmail(u.getEmail());
        usu.setRol(u.getRol());

        return repo.save(usu);
    }

    public void eliminarUsuario(Long id) {
        repo.deleteById(id);
    }

}

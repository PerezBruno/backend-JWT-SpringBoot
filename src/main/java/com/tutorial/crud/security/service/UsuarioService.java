
package com.tutorial.crud.security.service;

import com.tutorial.crud.security.repository.UsuarioRepositoryInterface;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.tutorial.crud.security.entity.Usuario;


@Service
@Transactional
public class UsuarioService {
    
    @Autowired
    UsuarioRepositoryInterface usuarioRepositoryInterface;
    
    public Optional<Usuario> getByNombreUsuario(String nombreUsuario){
        return usuarioRepositoryInterface.findByNombreUsuario(nombreUsuario);
    }
    
    public boolean existsByNombreUsuario(String nombreUsuario){
        return usuarioRepositoryInterface.existsByNombreUsuario(nombreUsuario);
    }
    
    
    public boolean existsByEmail(String email){
        return usuarioRepositoryInterface.existsByEmail(email);
    }
    
    public void save (Usuario usuario){
        usuarioRepositoryInterface.save(usuario);
    }
}


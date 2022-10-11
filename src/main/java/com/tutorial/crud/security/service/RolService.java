
package com.tutorial.crud.security.service;

import com.tutorial.crud.security.enums.RolNombre;
import com.tutorial.crud.security.repository.RolRepositoryInterface;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.tutorial.crud.security.entity.Rol;



@Service
@Transactional
public class RolService {
    
    @Autowired
    RolRepositoryInterface rolRepositoryInterface;
    
    public Optional<Rol> getByRolNombre (RolNombre rolNombre){
        return rolRepositoryInterface.findByRolNombre(rolNombre);
    }
    
    public void save (Rol rol){
        rolRepositoryInterface.save(rol);
    }
}


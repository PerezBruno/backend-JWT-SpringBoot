
package security.service;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import security.repository.RolRepositoryInterface;
import security.entity.Rol;
import security.enums.RolNombre;


@Service
@Transactional
public class RolService {
    
    @Autowired
    RolRepositoryInterface rolRepositoryInterface;
    
    public Optional<Rol> getByRolNombre (RolNombre rolNombre){
        return rolRepositoryInterface.findByRolNombre(rolNombre);
    }
}

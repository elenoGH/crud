
package com.jade.crud.repo;
import com.jade.crud.model.CtUsuarios;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface CtUsuariosRepository extends JpaRepository<CtUsuarios, Long>{
    
}


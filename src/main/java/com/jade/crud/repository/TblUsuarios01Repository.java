
package com.jade.crud.repository;
import com.jade.crud.entity.TblUsuarios01;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface TblUsuarios01Repository extends JpaRepository<TblUsuarios01, Long>{
    
}


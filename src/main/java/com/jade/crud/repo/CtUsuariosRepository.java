/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jade.crud.repo;

import com.jade.crud.model.CtUsuarios;
import org.springframework.stereotype.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
/**
 *
 * @author mperez
 */
@Repository
public interface CtUsuariosRepository extends JpaRepository<CtUsuarios, Long>{
    
}


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jade.crud.repository;


//import mx.com.sgi.jade.entity.CtAreas;
import com.jade.crud.entity.CtArea;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author tislas
 */
@Repository
public interface CtAreasRepository extends JpaRepository<CtArea, Long> {
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jade.crud.repository;

import com.jade.crud.entity.TblConciliacion01;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface TblConciliacion01Repository extends JpaRepository<TblConciliacion01, Long>{
    
}

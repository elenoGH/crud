/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jade.crud.controller;

import com.jade.crud.entity.CtViviendas01;
import com.jade.crud.repository.CtViviendas01Repository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author tislas
 */
@RestController
@CrossOrigin(origins = "http://localhost:4200", methods= {RequestMethod.GET,RequestMethod.POST})
public class CtViviendas01Controller {
    @Autowired
    private CtViviendas01Repository ctViviendasRepository;
    
    @GetMapping("/getViviendas")
    public List<CtViviendas01>getAllViviendas(){
        return ctViviendasRepository.findAll();
    }
}

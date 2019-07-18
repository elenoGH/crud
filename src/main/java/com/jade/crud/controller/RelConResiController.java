/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jade.crud.controller;

import com.jade.crud.entity.CtReferencia01;
import com.jade.crud.repository.CtReferencia01Repository;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@CrossOrigin(origins = "http://localhost:4200", methods= {RequestMethod.GET,RequestMethod.POST})
public class RelConResiController {
    @Autowired
    private CtReferencia01Repository usRepository;

    @GetMapping("/getRelConResi")
    public List<CtReferencia01> getAllRelConResi() {
        return usRepository.findAll();
    }
}

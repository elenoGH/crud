/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jade.crud.controller;

import com.jade.crud.entity.TblResidentes01;
import com.jade.crud.repo.TblResidentes01Repository;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@CrossOrigin(origins = "http://localhost:4200", methods= {RequestMethod.GET,RequestMethod.POST})
public class TblResidentes01Controller {
    @Autowired
    private TblResidentes01Repository usRepository;

    @GetMapping("/getResidentes")
    public List<TblResidentes01> getAllUsers() {
        return usRepository.findAll();
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jade.crud.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.jade.crud.entity.CtUsuarios;
import com.jade.crud.repo.CtUsuariosRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:4200", methods= {RequestMethod.GET,RequestMethod.POST})
//@CrossOrigin(origins = "http://www.appjade.com:4200", methods= {RequestMethod.GET,RequestMethod.POST})
//se usa para escuchar peticion como si fuera un endpoint, pero en este caso se ocupa
//spring boot
public class CtUsuariosController {
    @Autowired
    private CtUsuariosRepository usRepository;

    @GetMapping("/getUsers")
    public List<CtUsuarios> getAllUsers() {
        return usRepository.findAll();
    }
}

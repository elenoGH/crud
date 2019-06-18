/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jade.crud.controller;


import com.jade.crud.model.CtUsuarios;
import com.jade.crud.repo.CtUsuariosRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
//@CrossOrigin(origins = "http://localhost:4200", methods= {RequestMethod.GET,RequestMethod.POST})
@CrossOrigin(origins = "http://www.appjade.com:4200", methods= {RequestMethod.GET,RequestMethod.POST})
public class CtUsuariosController {
    @Autowired
    CtUsuariosRepository userRepo;

    @RequestMapping("/getUsuarios")
    @ResponseBody
    public ResponseEntity<List<CtUsuarios>> getUsuarios(){
        List<CtUsuarios> usuarios =  userRepo.getAllUsuarios();
        return new ResponseEntity<List<CtUsuarios>>(usuarios, HttpStatus.OK);
    }
}

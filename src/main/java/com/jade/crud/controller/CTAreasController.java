package com.jade.crud.controller;

import com.jade.crud.repository.CtAreasRepository;
import java.util.List;
import com.jade.crud.entity.CtArea;
//import mx.com.sgi.jade.entity.CtAreas;

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
public class CTAreasController {
    
    @Autowired
    private CtAreasRepository caRepository;
    
    @GetMapping("/getAreas")
    public List<CtArea> getAllAreas()
    {
        return caRepository.findAll();
        
    }
    
}

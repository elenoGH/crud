/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jade.crud.controller;

import java.util.Date;
import org.springframework.batch.core.*;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.repository.JobExecutionAlreadyRunningException;
import org.springframework.batch.core.repository.JobInstanceAlreadyCompleteException;
import org.springframework.batch.core.repository.JobRestartException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping
public class LoadFileController {

    @Autowired
    JobLauncher jobLauncher;

    @Autowired
    Job job;

    @GetMapping("/loadFile")
    public BatchStatus load(@RequestParam(name = "jobParameter") String jobParameter) throws JobParametersInvalidException
            , JobExecutionAlreadyRunningException
            , JobRestartException
            , JobInstanceAlreadyCompleteException {


        Map<String, JobParameter> maps = new HashMap<>();
        //en seguida se deve colocar un parametro en JobParameter, 
        //este es variable para que podamos subir la informacion de un csv
        //jobParameter este parametro deve ser variable en la vida del sistema, guardarlo como un id 
        //en la BD para que sea variable, asociarlo con un ID de la tabla por ejemplo para que sea unico e
        //inigualable
        maps.put("ccveref", new JobParameter(jobParameter));
        JobParameters parameters = new JobParameters(maps);
        JobExecution jobExecution = jobLauncher.run(job, parameters);

        System.out.println("JobExecution: " + jobExecution.getStatus());

        System.out.println("Batch is Running...");
        while (jobExecution.isRunning()) {
            System.out.println("...");
        }

        return jobExecution.getStatus();
    }
}
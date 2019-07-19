/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jade.crud.batch;


import com.jade.crud.entity.TblConciliacion01;
import com.jade.crud.repository.TblConciliacion01Repository;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DBWriter implements ItemWriter<TblConciliacion01> {

    @Autowired
    private TblConciliacion01Repository conRepository;

    @Override
    public void write(List<? extends TblConciliacion01> tblConciliacion01) throws Exception {

        System.out.println("Data Saved for Conciliacion: " + tblConciliacion01);
        conRepository.save(tblConciliacion01);
    }
}

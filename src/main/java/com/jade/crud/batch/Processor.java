/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jade.crud.batch;


import com.jade.crud.entity.TblConciliacion01;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Component
public class Processor implements ItemProcessor<TblConciliacion01, TblConciliacion01> {

    private static final Map<String, String> DEPT_NAMES = new HashMap<>();

    public Processor() {
        DEPT_NAMES.put("cambia_esto", "por_esto");
    }

    @Override
    public TblConciliacion01 process(TblConciliacion01 tblConciliacion01) throws Exception {
        //String mail = tblConciliacion01.getCemail();
        //String dept = DEPT_NAMES.get(mail);
        //si quiero cambiar un valor constante por una referencia
        //la puedo cambiar aqui
        //tblConciliacion01.setCnomresidente(dept);
        tblConciliacion01.setCfecha(new Date());
        //System.out.println(String.format("Converted from [%s] to [%s]", mail, dept));
        return tblConciliacion01;
    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jade.crud.repo;

import com.jade.crud.model.CtUsuarios;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
/**
 *
 * @author mperez
 */
@Repository
public class CtUsuariosRepository {
    
    @Autowired
    JdbcTemplate template;
    
    /*get All Usuarios from Usuarios*/
    public List<CtUsuarios> getAllUsuarios() {
        String query_q = "select L_IdUsuario, Nombre"
                + ", Apelllido_Paterno, Apellido_Materno"
                + ", Email, Telefono "
                + " from CT_USUARIOS";
        
        List<CtUsuarios> usuarios;
        usuarios = template.query(query_q,(result,rowNum)->
                new CtUsuarios(
                        result.getInt("L_IdUsuario"),result.getString("Nombre")
                        ,result.getString("Apelllido_Paterno"),result.getString("Apellido_Materno")
                        ,result.getString("Email"),result.getString("Telefono")
                )
        );
        return usuarios;
    }
}


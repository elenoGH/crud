/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jade.crud.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author mperez
 */
@Entity
public class CtUsuarios {
    
    @Id
    private int lIdusuario;
    private String Nombre;
    private String apellidoPaterno;
            
    public CtUsuarios() {
    }

    public CtUsuarios(int lIdusuario, String Nombre, String apellidoPaterno) {
        this.lIdusuario = lIdusuario;
        this.Nombre = Nombre;
        this.apellidoPaterno = apellidoPaterno;
    }
    
    public int getlIdusuario() {
        return lIdusuario;
    }

    public void setlIdusuario(int lIdusuario) {
        this.lIdusuario = lIdusuario;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    
    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jade.crud.model;

/**
 *
 * @author mperez
 */
public class CtUsuarios {
    
    private int lIdUsuario;
    private String Nombre;
    private String ApPaterno;
    private String ApMaterno;
    private String Email;
    private String Telefono;
    
    public CtUsuarios() {
    }

    public CtUsuarios(int lIdUsuario, String Nombre, String ApPaterno, String ApMaterno, String Email, String Telefono) {
        this.lIdUsuario = lIdUsuario;
        this.Nombre = Nombre;
        this.ApPaterno = ApPaterno;
        this.ApMaterno = ApMaterno;
        this.Email = Email;
        this.Telefono = Telefono;
    }
    
    public int getlIdUsuario() {
        return lIdUsuario;
    }

    public void setlIdUsuario(int lIdUsuario) {
        this.lIdUsuario = lIdUsuario;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApPaterno() {
        return ApPaterno;
    }

    public void setApPaterno(String ApPaterno) {
        this.ApPaterno = ApPaterno;
    }

    public String getApMaterno() {
        return ApMaterno;
    }

    public void setApMaterno(String ApMaterno) {
        this.ApMaterno = ApMaterno;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }
    
}

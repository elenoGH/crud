/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jade.crud.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author mperez
 */
@Entity
@Table(name = "cpmexico")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cpmexico.findAll", query = "SELECT c FROM Cpmexico c")
    , @NamedQuery(name = "Cpmexico.findById", query = "SELECT c FROM Cpmexico c WHERE c.id = :id")
    , @NamedQuery(name = "Cpmexico.findByDcodigo", query = "SELECT c FROM Cpmexico c WHERE c.dcodigo = :dcodigo")
    , @NamedQuery(name = "Cpmexico.findByDasenta", query = "SELECT c FROM Cpmexico c WHERE c.dasenta = :dasenta")
    , @NamedQuery(name = "Cpmexico.findByDtipoasenta", query = "SELECT c FROM Cpmexico c WHERE c.dtipoasenta = :dtipoasenta")
    , @NamedQuery(name = "Cpmexico.findByDmnpio", query = "SELECT c FROM Cpmexico c WHERE c.dmnpio = :dmnpio")
    , @NamedQuery(name = "Cpmexico.findByDestado", query = "SELECT c FROM Cpmexico c WHERE c.destado = :destado")
    , @NamedQuery(name = "Cpmexico.findByDciudad", query = "SELECT c FROM Cpmexico c WHERE c.dciudad = :dciudad")
    , @NamedQuery(name = "Cpmexico.findByDcp", query = "SELECT c FROM Cpmexico c WHERE c.dcp = :dcp")
    , @NamedQuery(name = "Cpmexico.findByCestado", query = "SELECT c FROM Cpmexico c WHERE c.cestado = :cestado")
    , @NamedQuery(name = "Cpmexico.findByCoficina", query = "SELECT c FROM Cpmexico c WHERE c.coficina = :coficina")
    , @NamedQuery(name = "Cpmexico.findByCcp", query = "SELECT c FROM Cpmexico c WHERE c.ccp = :ccp")
    , @NamedQuery(name = "Cpmexico.findByCtipoasenta", query = "SELECT c FROM Cpmexico c WHERE c.ctipoasenta = :ctipoasenta")
    , @NamedQuery(name = "Cpmexico.findByCmnpio", query = "SELECT c FROM Cpmexico c WHERE c.cmnpio = :cmnpio")
    , @NamedQuery(name = "Cpmexico.findByIdasentacpcons", query = "SELECT c FROM Cpmexico c WHERE c.idasentacpcons = :idasentacpcons")
    , @NamedQuery(name = "Cpmexico.findByDzona", query = "SELECT c FROM Cpmexico c WHERE c.dzona = :dzona")
    , @NamedQuery(name = "Cpmexico.findByCcveciudad", query = "SELECT c FROM Cpmexico c WHERE c.ccveciudad = :ccveciudad")})
public class Cpmexico implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Size(max = 300)
    @Column(name = "dcodigo")
    private String dcodigo;
    @Size(max = 300)
    @Column(name = "dasenta")
    private String dasenta;
    @Size(max = 300)
    @Column(name = "dtipoasenta")
    private String dtipoasenta;
    @Size(max = 300)
    @Column(name = "dmnpio")
    private String dmnpio;
    @Size(max = 300)
    @Column(name = "destado")
    private String destado;
    @Size(max = 300)
    @Column(name = "dciudad")
    private String dciudad;
    @Size(max = 300)
    @Column(name = "dcp")
    private String dcp;
    @Size(max = 300)
    @Column(name = "cestado")
    private String cestado;
    @Size(max = 300)
    @Column(name = "coficina")
    private String coficina;
    @Size(max = 300)
    @Column(name = "ccp")
    private String ccp;
    @Size(max = 300)
    @Column(name = "ctipoasenta")
    private String ctipoasenta;
    @Size(max = 300)
    @Column(name = "cmnpio")
    private String cmnpio;
    @Size(max = 300)
    @Column(name = "idasentacpcons")
    private String idasentacpcons;
    @Size(max = 300)
    @Column(name = "dzona")
    private String dzona;
    @Size(max = 300)
    @Column(name = "ccveciudad")
    private String ccveciudad;

    public Cpmexico() {
    }

    public Cpmexico(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDcodigo() {
        return dcodigo;
    }

    public void setDcodigo(String dcodigo) {
        this.dcodigo = dcodigo;
    }

    public String getDasenta() {
        return dasenta;
    }

    public void setDasenta(String dasenta) {
        this.dasenta = dasenta;
    }

    public String getDtipoasenta() {
        return dtipoasenta;
    }

    public void setDtipoasenta(String dtipoasenta) {
        this.dtipoasenta = dtipoasenta;
    }

    public String getDmnpio() {
        return dmnpio;
    }

    public void setDmnpio(String dmnpio) {
        this.dmnpio = dmnpio;
    }

    public String getDestado() {
        return destado;
    }

    public void setDestado(String destado) {
        this.destado = destado;
    }

    public String getDciudad() {
        return dciudad;
    }

    public void setDciudad(String dciudad) {
        this.dciudad = dciudad;
    }

    public String getDcp() {
        return dcp;
    }

    public void setDcp(String dcp) {
        this.dcp = dcp;
    }

    public String getCestado() {
        return cestado;
    }

    public void setCestado(String cestado) {
        this.cestado = cestado;
    }

    public String getCoficina() {
        return coficina;
    }

    public void setCoficina(String coficina) {
        this.coficina = coficina;
    }

    public String getCcp() {
        return ccp;
    }

    public void setCcp(String ccp) {
        this.ccp = ccp;
    }

    public String getCtipoasenta() {
        return ctipoasenta;
    }

    public void setCtipoasenta(String ctipoasenta) {
        this.ctipoasenta = ctipoasenta;
    }

    public String getCmnpio() {
        return cmnpio;
    }

    public void setCmnpio(String cmnpio) {
        this.cmnpio = cmnpio;
    }

    public String getIdasentacpcons() {
        return idasentacpcons;
    }

    public void setIdasentacpcons(String idasentacpcons) {
        this.idasentacpcons = idasentacpcons;
    }

    public String getDzona() {
        return dzona;
    }

    public void setDzona(String dzona) {
        this.dzona = dzona;
    }

    public String getCcveciudad() {
        return ccveciudad;
    }

    public void setCcveciudad(String ccveciudad) {
        this.ccveciudad = ccveciudad;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cpmexico)) {
            return false;
        }
        Cpmexico other = (Cpmexico) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jade.crud.Cpmexico[ id=" + id + " ]";
    }
    
}

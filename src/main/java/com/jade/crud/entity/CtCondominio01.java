/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jade.crud.entity;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author mperez
 */
@Entity
@Table(name = "Ct_Condominio01")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CtCondominio01.findAll", query = "SELECT c FROM CtCondominio01 c")
    , @NamedQuery(name = "CtCondominio01.findByCid", query = "SELECT c FROM CtCondominio01 c WHERE c.cid = :cid")
    , @NamedQuery(name = "CtCondominio01.findByCcvecon", query = "SELECT c FROM CtCondominio01 c WHERE c.ccvecon = :ccvecon")
    , @NamedQuery(name = "CtCondominio01.findByCnombre", query = "SELECT c FROM CtCondominio01 c WHERE c.cnombre = :cnombre")
    , @NamedQuery(name = "CtCondominio01.findByCestatus", query = "SELECT c FROM CtCondominio01 c WHERE c.cestatus = :cestatus")})
public class CtCondominio01 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cid")
    private int cid;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ccvecon")
    private Integer ccvecon;
    @Size(max = 255)
    @Column(name = "cnombre")
    private String cnombre;
    @Column(name = "cestatus")
    private Boolean cestatus;
    @OneToMany(mappedBy = "vcvecon")
    private Collection<CtViviendas01> ctViviendas01Collection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "rccvecond")
    private Collection<ResidentesCondominios01> residentesCondominios01Collection;

    public CtCondominio01() {
    }

    public CtCondominio01(Integer ccvecon) {
        this.ccvecon = ccvecon;
    }

    public CtCondominio01(Integer ccvecon, int cid) {
        this.ccvecon = ccvecon;
        this.cid = cid;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public Integer getCcvecon() {
        return ccvecon;
    }

    public void setCcvecon(Integer ccvecon) {
        this.ccvecon = ccvecon;
    }

    public String getCnombre() {
        return cnombre;
    }

    public void setCnombre(String cnombre) {
        this.cnombre = cnombre;
    }

    public Boolean getCestatus() {
        return cestatus;
    }

    public void setCestatus(Boolean cestatus) {
        this.cestatus = cestatus;
    }

    @XmlTransient
    public Collection<CtViviendas01> getCtViviendas01Collection() {
        return ctViviendas01Collection;
    }

    public void setCtViviendas01Collection(Collection<CtViviendas01> ctViviendas01Collection) {
        this.ctViviendas01Collection = ctViviendas01Collection;
    }

    @XmlTransient
    public Collection<ResidentesCondominios01> getResidentesCondominios01Collection() {
        return residentesCondominios01Collection;
    }

    public void setResidentesCondominios01Collection(Collection<ResidentesCondominios01> residentesCondominios01Collection) {
        this.residentesCondominios01Collection = residentesCondominios01Collection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ccvecon != null ? ccvecon.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CtCondominio01)) {
            return false;
        }
        CtCondominio01 other = (CtCondominio01) object;
        if ((this.ccvecon == null && other.ccvecon != null) || (this.ccvecon != null && !this.ccvecon.equals(other.ccvecon))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.com.AEF.entityesexternal.CtCondominio01[ ccvecon=" + ccvecon + " ]";
    }
    
}

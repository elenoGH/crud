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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author mperez
 */
@Entity
@Table(name = "Residentes_Condominios01")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ResidentesCondominios01.findAll", query = "SELECT r FROM ResidentesCondominios01 r")
    , @NamedQuery(name = "ResidentesCondominios01.findByIdrescond", query = "SELECT r FROM ResidentesCondominios01 r WHERE r.idrescond = :idrescond")
    , @NamedQuery(name = "ResidentesCondominios01.findByRcestat", query = "SELECT r FROM ResidentesCondominios01 r WHERE r.rcestat = :rcestat")})
public class ResidentesCondominios01 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idrescond")
    private Integer idrescond;
    @Column(name = "rcestat")
    private Boolean rcestat;
    @JoinColumn(name = "rccvecond", referencedColumnName = "ccvecon")
    @ManyToOne(optional = false)
    private CtCondominio01 rccvecond;
    @JoinColumn(name = "rccveresi", referencedColumnName = "rcveresi")
    @ManyToOne(optional = false)
    private TblResidentes01 rccveresi;

    public ResidentesCondominios01() {
    }

    public ResidentesCondominios01(Integer idrescond) {
        this.idrescond = idrescond;
    }

    public Integer getIdrescond() {
        return idrescond;
    }

    public void setIdrescond(Integer idrescond) {
        this.idrescond = idrescond;
    }

    public Boolean getRcestat() {
        return rcestat;
    }

    public void setRcestat(Boolean rcestat) {
        this.rcestat = rcestat;
    }

    public CtCondominio01 getRccvecond() {
        return rccvecond;
    }

    public void setRccvecond(CtCondominio01 rccvecond) {
        this.rccvecond = rccvecond;
    }

    public TblResidentes01 getRccveresi() {
        return rccveresi;
    }

    public void setRccveresi(TblResidentes01 rccveresi) {
        this.rccveresi = rccveresi;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idrescond != null ? idrescond.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ResidentesCondominios01)) {
            return false;
        }
        ResidentesCondominios01 other = (ResidentesCondominios01) object;
        if ((this.idrescond == null && other.idrescond != null) || (this.idrescond != null && !this.idrescond.equals(other.idrescond))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.com.AEF.entityesexternal.ResidentesCondominios01[ idrescond=" + idrescond + " ]";
    }
    
}

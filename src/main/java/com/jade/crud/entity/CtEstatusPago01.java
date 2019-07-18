/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jade.crud.entity;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
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
@Table(name = "Ct_EstatusPago01")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CtEstatusPago01.findAll", query = "SELECT c FROM CtEstatusPago01 c")
    , @NamedQuery(name = "CtEstatusPago01.findByEpidest", query = "SELECT c FROM CtEstatusPago01 c WHERE c.epidest = :epidest")
    , @NamedQuery(name = "CtEstatusPago01.findByEpcvestat", query = "SELECT c FROM CtEstatusPago01 c WHERE c.epcvestat = :epcvestat")
    , @NamedQuery(name = "CtEstatusPago01.findByEpnombre", query = "SELECT c FROM CtEstatusPago01 c WHERE c.epnombre = :epnombre")
    , @NamedQuery(name = "CtEstatusPago01.findByEpdesc", query = "SELECT c FROM CtEstatusPago01 c WHERE c.epdesc = :epdesc")})
public class CtEstatusPago01 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "epidest")
    private int epidest;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "epcvestat")
    private Integer epcvestat;
    @Size(max = 255)
    @Column(name = "epnombre")
    private String epnombre;
    @Size(max = 255)
    @Column(name = "epdesc")
    private String epdesc;
    @OneToMany(mappedBy = "ccveestat")
    private Collection<TblConciliacion01> tblConciliacion01Collection;

    public CtEstatusPago01() {
    }

    public CtEstatusPago01(Integer epcvestat) {
        this.epcvestat = epcvestat;
    }

    public CtEstatusPago01(Integer epcvestat, int epidest) {
        this.epcvestat = epcvestat;
        this.epidest = epidest;
    }

    public int getEpidest() {
        return epidest;
    }

    public void setEpidest(int epidest) {
        this.epidest = epidest;
    }

    public Integer getEpcvestat() {
        return epcvestat;
    }

    public void setEpcvestat(Integer epcvestat) {
        this.epcvestat = epcvestat;
    }

    public String getEpnombre() {
        return epnombre;
    }

    public void setEpnombre(String epnombre) {
        this.epnombre = epnombre;
    }

    public String getEpdesc() {
        return epdesc;
    }

    public void setEpdesc(String epdesc) {
        this.epdesc = epdesc;
    }

    @XmlTransient
    public Collection<TblConciliacion01> getTblConciliacion01Collection() {
        return tblConciliacion01Collection;
    }

    public void setTblConciliacion01Collection(Collection<TblConciliacion01> tblConciliacion01Collection) {
        this.tblConciliacion01Collection = tblConciliacion01Collection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (epcvestat != null ? epcvestat.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CtEstatusPago01)) {
            return false;
        }
        CtEstatusPago01 other = (CtEstatusPago01) object;
        if ((this.epcvestat == null && other.epcvestat != null) || (this.epcvestat != null && !this.epcvestat.equals(other.epcvestat))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.com.AEF.entityesexternal.CtEstatusPago01[ epcvestat=" + epcvestat + " ]";
    }
    
}

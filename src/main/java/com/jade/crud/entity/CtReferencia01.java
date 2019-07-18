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
@Table(name = "Ct_Referencia01")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CtReferencia01.findAll", query = "SELECT c FROM CtReferencia01 c")
    , @NamedQuery(name = "CtReferencia01.findByRid", query = "SELECT c FROM CtReferencia01 c WHERE c.rid = :rid")
    , @NamedQuery(name = "CtReferencia01.findByRcveref", query = "SELECT c FROM CtReferencia01 c WHERE c.rcveref = :rcveref")
    , @NamedQuery(name = "CtReferencia01.findByRcdesc", query = "SELECT c FROM CtReferencia01 c WHERE c.rcdesc = :rcdesc")})
public class CtReferencia01 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "rid")
    private int rid;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(max = 50)
    @Column(name = "rcveref")
    private String rcveref;
    @Size(max = 255)
    @Column(name = "rcdesc")
    private String rcdesc;
    /*
    @OneToMany(mappedBy = "rcveref")
    private Collection<TblResidentes01> tblResidentes01Collection;
    */
    /*
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ccverefe")
    private Collection<TblConciliacion01> tblConciliacion01Collection;
    */
    public CtReferencia01() {
    }

    public CtReferencia01(String rcveref) {
        this.rcveref = rcveref;
    }

    public CtReferencia01(String rcveref, int rid) {
        this.rcveref = rcveref;
        this.rid = rid;
    }

    public int getRid() {
        return rid;
    }

    public void setRid(int rid) {
        this.rid = rid;
    }

    public String getRcveref() {
        return rcveref;
    }

    public void setRcveref(String rcveref) {
        this.rcveref = rcveref;
    }

    public String getRcdesc() {
        return rcdesc;
    }

    public void setRcdesc(String rcdesc) {
        this.rcdesc = rcdesc;
    }
    /*
    @XmlTransient
    public Collection<TblResidentes01> getTblResidentes01Collection() {
        return tblResidentes01Collection;
    }

    public void setTblResidentes01Collection(Collection<TblResidentes01> tblResidentes01Collection) {
        this.tblResidentes01Collection = tblResidentes01Collection;
    }
    */
    /*
    @XmlTransient
    public Collection<TblConciliacion01> getTblConciliacion01Collection() {
        return tblConciliacion01Collection;
    }

    public void setTblConciliacion01Collection(Collection<TblConciliacion01> tblConciliacion01Collection) {
        this.tblConciliacion01Collection = tblConciliacion01Collection;
    }
    */
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (rcveref != null ? rcveref.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CtReferencia01)) {
            return false;
        }
        CtReferencia01 other = (CtReferencia01) object;
        if ((this.rcveref == null && other.rcveref != null) || (this.rcveref != null && !this.rcveref.equals(other.rcveref))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.com.AEF.entityesexternal.CtReferencia01[ rcveref=" + rcveref + " ]";
    }
    
}

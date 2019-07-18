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
@Table(name = "Ct_Roles01")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CtRoles01.findAll", query = "SELECT c FROM CtRoles01 c")
    , @NamedQuery(name = "CtRoles01.findByRidrol", query = "SELECT c FROM CtRoles01 c WHERE c.ridrol = :ridrol")
    , @NamedQuery(name = "CtRoles01.findByRcverol", query = "SELECT c FROM CtRoles01 c WHERE c.rcverol = :rcverol")
    , @NamedQuery(name = "CtRoles01.findByRnombre", query = "SELECT c FROM CtRoles01 c WHERE c.rnombre = :rnombre")
    , @NamedQuery(name = "CtRoles01.findByRdes", query = "SELECT c FROM CtRoles01 c WHERE c.rdes = :rdes")
    , @NamedQuery(name = "CtRoles01.findByRestatus", query = "SELECT c FROM CtRoles01 c WHERE c.restatus = :restatus")})
public class CtRoles01 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ridrol")
    private int ridrol;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "rcverol")
    private Integer rcverol;
    @Size(max = 200)
    @Column(name = "rnombre")
    private String rnombre;
    @Size(max = 200)
    @Column(name = "rdes")
    private String rdes;
    @Column(name = "restatus")
    private Boolean restatus;
    //@OneToMany(mappedBy = "ucverol")
    //private Collection<TblUsuarios01> tblUsuarios01Collection;

    public CtRoles01() {
    }

    public CtRoles01(Integer rcverol) {
        this.rcverol = rcverol;
    }

    public CtRoles01(Integer rcverol, int ridrol) {
        this.rcverol = rcverol;
        this.ridrol = ridrol;
    }

    public int getRidrol() {
        return ridrol;
    }

    public void setRidrol(int ridrol) {
        this.ridrol = ridrol;
    }

    public Integer getRcverol() {
        return rcverol;
    }

    public void setRcverol(Integer rcverol) {
        this.rcverol = rcverol;
    }

    public String getRnombre() {
        return rnombre;
    }

    public void setRnombre(String rnombre) {
        this.rnombre = rnombre;
    }

    public String getRdes() {
        return rdes;
    }

    public void setRdes(String rdes) {
        this.rdes = rdes;
    }

    public Boolean getRestatus() {
        return restatus;
    }

    public void setRestatus(Boolean restatus) {
        this.restatus = restatus;
    }
    /*
    @XmlTransient
    public Collection<TblUsuarios01> getTblUsuarios01Collection() {
        return tblUsuarios01Collection;
    }

    public void setTblUsuarios01Collection(Collection<TblUsuarios01> tblUsuarios01Collection) {
        this.tblUsuarios01Collection = tblUsuarios01Collection;
    }
    */
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (rcverol != null ? rcverol.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CtRoles01)) {
            return false;
        }
        CtRoles01 other = (CtRoles01) object;
        if ((this.rcverol == null && other.rcverol != null) || (this.rcverol != null && !this.rcverol.equals(other.rcverol))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.com.AEF.entityesexternal.CtRoles01[ rcverol=" + rcverol + " ]";
    }
    
}

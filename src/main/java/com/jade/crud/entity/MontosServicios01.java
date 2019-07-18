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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author mperez
 */
@Entity
@Table(name = "Montos_Servicios01")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MontosServicios01.findAll", query = "SELECT m FROM MontosServicios01 m")
    , @NamedQuery(name = "MontosServicios01.findByMsid", query = "SELECT m FROM MontosServicios01 m WHERE m.msid = :msid")
    , @NamedQuery(name = "MontosServicios01.findByMscvemont", query = "SELECT m FROM MontosServicios01 m WHERE m.mscvemont = :mscvemont")
    , @NamedQuery(name = "MontosServicios01.findByMsdesc", query = "SELECT m FROM MontosServicios01 m WHERE m.msdesc = :msdesc")})
public class MontosServicios01 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "msid")
    private int msid;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "mscvemont")
    private Integer mscvemont;
    @Size(max = 255)
    @Column(name = "msdesc")
    private String msdesc;
    @JoinColumn(name = "mscveser", referencedColumnName = "cscveservicios")
    @ManyToOne
    private CtServicios01 mscveser;

    public MontosServicios01() {
    }

    public MontosServicios01(Integer mscvemont) {
        this.mscvemont = mscvemont;
    }

    public MontosServicios01(Integer mscvemont, int msid) {
        this.mscvemont = mscvemont;
        this.msid = msid;
    }

    public int getMsid() {
        return msid;
    }

    public void setMsid(int msid) {
        this.msid = msid;
    }

    public Integer getMscvemont() {
        return mscvemont;
    }

    public void setMscvemont(Integer mscvemont) {
        this.mscvemont = mscvemont;
    }

    public String getMsdesc() {
        return msdesc;
    }

    public void setMsdesc(String msdesc) {
        this.msdesc = msdesc;
    }

    public CtServicios01 getMscveser() {
        return mscveser;
    }

    public void setMscveser(CtServicios01 mscveser) {
        this.mscveser = mscveser;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mscvemont != null ? mscvemont.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MontosServicios01)) {
            return false;
        }
        MontosServicios01 other = (MontosServicios01) object;
        if ((this.mscvemont == null && other.mscvemont != null) || (this.mscvemont != null && !this.mscvemont.equals(other.mscvemont))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.com.AEF.entityesexternal.MontosServicios01[ mscvemont=" + mscvemont + " ]";
    }
    
}

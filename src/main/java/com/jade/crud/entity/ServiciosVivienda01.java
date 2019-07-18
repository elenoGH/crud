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
@Table(name = "Servicios_Vivienda01")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ServiciosVivienda01.findAll", query = "SELECT s FROM ServiciosVivienda01 s")
    , @NamedQuery(name = "ServiciosVivienda01.findBySvid", query = "SELECT s FROM ServiciosVivienda01 s WHERE s.svid = :svid")})
public class ServiciosVivienda01 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "svid")
    private Integer svid;
    @JoinColumn(name = "svcves", referencedColumnName = "cscveservicios")
    @ManyToOne(optional = false)
    private CtServicios01 svcves;
    @JoinColumn(name = "svcveviv", referencedColumnName = "vcvevivienda")
    @ManyToOne(optional = false)
    private CtViviendas01 svcveviv;

    public ServiciosVivienda01() {
    }

    public ServiciosVivienda01(Integer svid) {
        this.svid = svid;
    }

    public Integer getSvid() {
        return svid;
    }

    public void setSvid(Integer svid) {
        this.svid = svid;
    }

    public CtServicios01 getSvcves() {
        return svcves;
    }

    public void setSvcves(CtServicios01 svcves) {
        this.svcves = svcves;
    }

    public CtViviendas01 getSvcveviv() {
        return svcveviv;
    }

    public void setSvcveviv(CtViviendas01 svcveviv) {
        this.svcveviv = svcveviv;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (svid != null ? svid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ServiciosVivienda01)) {
            return false;
        }
        ServiciosVivienda01 other = (ServiciosVivienda01) object;
        if ((this.svid == null && other.svid != null) || (this.svid != null && !this.svid.equals(other.svid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.com.AEF.entityesexternal.ServiciosVivienda01[ svid=" + svid + " ]";
    }
    
}

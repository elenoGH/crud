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
@Table(name = "Ct_Servicios01")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CtServicios01.findAll", query = "SELECT c FROM CtServicios01 c")
    , @NamedQuery(name = "CtServicios01.findByCsid", query = "SELECT c FROM CtServicios01 c WHERE c.csid = :csid")
    , @NamedQuery(name = "CtServicios01.findByCscveservicios", query = "SELECT c FROM CtServicios01 c WHERE c.cscveservicios = :cscveservicios")
    , @NamedQuery(name = "CtServicios01.findByCsnombre", query = "SELECT c FROM CtServicios01 c WHERE c.csnombre = :csnombre")
    , @NamedQuery(name = "CtServicios01.findByCsdesc", query = "SELECT c FROM CtServicios01 c WHERE c.csdesc = :csdesc")
    , @NamedQuery(name = "CtServicios01.findByCsestat", query = "SELECT c FROM CtServicios01 c WHERE c.csestat = :csestat")})
public class CtServicios01 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "csid")
    private int csid;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "cscveservicios")
    private Integer cscveservicios;
    @Size(max = 255)
    @Column(name = "csnombre")
    private String csnombre;
    @Size(max = 255)
    @Column(name = "csdesc")
    private String csdesc;
    @Column(name = "csestat")
    private Boolean csestat;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "svcves")
    private Collection<ServiciosVivienda01> serviciosVivienda01Collection;
    @OneToMany(mappedBy = "mscveser")
    private Collection<MontosServicios01> montosServicios01Collection;

    public CtServicios01() {
    }

    public CtServicios01(Integer cscveservicios) {
        this.cscveservicios = cscveservicios;
    }

    public CtServicios01(Integer cscveservicios, int csid) {
        this.cscveservicios = cscveservicios;
        this.csid = csid;
    }

    public int getCsid() {
        return csid;
    }

    public void setCsid(int csid) {
        this.csid = csid;
    }

    public Integer getCscveservicios() {
        return cscveservicios;
    }

    public void setCscveservicios(Integer cscveservicios) {
        this.cscveservicios = cscveservicios;
    }

    public String getCsnombre() {
        return csnombre;
    }

    public void setCsnombre(String csnombre) {
        this.csnombre = csnombre;
    }

    public String getCsdesc() {
        return csdesc;
    }

    public void setCsdesc(String csdesc) {
        this.csdesc = csdesc;
    }

    public Boolean getCsestat() {
        return csestat;
    }

    public void setCsestat(Boolean csestat) {
        this.csestat = csestat;
    }

    @XmlTransient
    public Collection<ServiciosVivienda01> getServiciosVivienda01Collection() {
        return serviciosVivienda01Collection;
    }

    public void setServiciosVivienda01Collection(Collection<ServiciosVivienda01> serviciosVivienda01Collection) {
        this.serviciosVivienda01Collection = serviciosVivienda01Collection;
    }

    @XmlTransient
    public Collection<MontosServicios01> getMontosServicios01Collection() {
        return montosServicios01Collection;
    }

    public void setMontosServicios01Collection(Collection<MontosServicios01> montosServicios01Collection) {
        this.montosServicios01Collection = montosServicios01Collection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cscveservicios != null ? cscveservicios.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CtServicios01)) {
            return false;
        }
        CtServicios01 other = (CtServicios01) object;
        if ((this.cscveservicios == null && other.cscveservicios != null) || (this.cscveservicios != null && !this.cscveservicios.equals(other.cscveservicios))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.com.AEF.entityesexternal.CtServicios01[ cscveservicios=" + cscveservicios + " ]";
    }
    
}

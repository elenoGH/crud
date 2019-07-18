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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "Ct_Viviendas01")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CtViviendas01.findAll", query = "SELECT c FROM CtViviendas01 c")
    , @NamedQuery(name = "CtViviendas01.findByVid", query = "SELECT c FROM CtViviendas01 c WHERE c.vid = :vid")
    , @NamedQuery(name = "CtViviendas01.findByVcvevivienda", query = "SELECT c FROM CtViviendas01 c WHERE c.vcvevivienda = :vcvevivienda")
    , @NamedQuery(name = "CtViviendas01.findByVnombre", query = "SELECT c FROM CtViviendas01 c WHERE c.vnombre = :vnombre")
    , @NamedQuery(name = "CtViviendas01.findByVcalle", query = "SELECT c FROM CtViviendas01 c WHERE c.vcalle = :vcalle")
    , @NamedQuery(name = "CtViviendas01.findByVnumex", query = "SELECT c FROM CtViviendas01 c WHERE c.vnumex = :vnumex")
    , @NamedQuery(name = "CtViviendas01.findByVnumint", query = "SELECT c FROM CtViviendas01 c WHERE c.vnumint = :vnumint")
    , @NamedQuery(name = "CtViviendas01.findByVestat", query = "SELECT c FROM CtViviendas01 c WHERE c.vestat = :vestat")
    , @NamedQuery(name = "CtViviendas01.findByVmanzana", query = "SELECT c FROM CtViviendas01 c WHERE c.vmanzana = :vmanzana")
    , @NamedQuery(name = "CtViviendas01.findByVlote", query = "SELECT c FROM CtViviendas01 c WHERE c.vlote = :vlote")})
public class CtViviendas01 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "vid")
    private int vid;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "vcvevivienda")
    private Integer vcvevivienda;
    @Size(max = 255)
    @Column(name = "vnombre")
    private String vnombre;
    @Size(max = 255)
    @Column(name = "vcalle")
    private String vcalle;
    @Size(max = 5)
    @Column(name = "vnumex")
    private String vnumex;
    @Size(max = 5)
    @Column(name = "vnumint")
    private String vnumint;
    @Column(name = "vestat")
    private Boolean vestat;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "vmanzana")
    private String vmanzana;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "vlote")
    private String vlote;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "svcveviv")
    private Collection<ServiciosVivienda01> serviciosVivienda01Collection;
    @JoinColumn(name = "vcvecon", referencedColumnName = "ccvecon")
    @ManyToOne
    private CtCondominio01 vcvecon;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ccveviv")
    private Collection<TblConciliacion01> tblConciliacion01Collection;

    public CtViviendas01() {
    }

    public CtViviendas01(Integer vcvevivienda) {
        this.vcvevivienda = vcvevivienda;
    }

    public CtViviendas01(Integer vcvevivienda, int vid, String vmanzana, String vlote) {
        this.vcvevivienda = vcvevivienda;
        this.vid = vid;
        this.vmanzana = vmanzana;
        this.vlote = vlote;
    }

    public int getVid() {
        return vid;
    }

    public void setVid(int vid) {
        this.vid = vid;
    }

    public Integer getVcvevivienda() {
        return vcvevivienda;
    }

    public void setVcvevivienda(Integer vcvevivienda) {
        this.vcvevivienda = vcvevivienda;
    }

    public String getVnombre() {
        return vnombre;
    }

    public void setVnombre(String vnombre) {
        this.vnombre = vnombre;
    }

    public String getVcalle() {
        return vcalle;
    }

    public void setVcalle(String vcalle) {
        this.vcalle = vcalle;
    }

    public String getVnumex() {
        return vnumex;
    }

    public void setVnumex(String vnumex) {
        this.vnumex = vnumex;
    }

    public String getVnumint() {
        return vnumint;
    }

    public void setVnumint(String vnumint) {
        this.vnumint = vnumint;
    }

    public Boolean getVestat() {
        return vestat;
    }

    public void setVestat(Boolean vestat) {
        this.vestat = vestat;
    }

    public String getVmanzana() {
        return vmanzana;
    }

    public void setVmanzana(String vmanzana) {
        this.vmanzana = vmanzana;
    }

    public String getVlote() {
        return vlote;
    }

    public void setVlote(String vlote) {
        this.vlote = vlote;
    }

    @XmlTransient
    public Collection<ServiciosVivienda01> getServiciosVivienda01Collection() {
        return serviciosVivienda01Collection;
    }

    public void setServiciosVivienda01Collection(Collection<ServiciosVivienda01> serviciosVivienda01Collection) {
        this.serviciosVivienda01Collection = serviciosVivienda01Collection;
    }

    public CtCondominio01 getVcvecon() {
        return vcvecon;
    }

    public void setVcvecon(CtCondominio01 vcvecon) {
        this.vcvecon = vcvecon;
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
        hash += (vcvevivienda != null ? vcvevivienda.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CtViviendas01)) {
            return false;
        }
        CtViviendas01 other = (CtViviendas01) object;
        if ((this.vcvevivienda == null && other.vcvevivienda != null) || (this.vcvevivienda != null && !this.vcvevivienda.equals(other.vcvevivienda))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.com.AEF.entityesexternal.CtViviendas01[ vcvevivienda=" + vcvevivienda + " ]";
    }
    
}

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
@Table(name = "Tbl_Residentes01")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblResidentes01.findAll", query = "SELECT t FROM TblResidentes01 t")
    , @NamedQuery(name = "TblResidentes01.findByRid", query = "SELECT t FROM TblResidentes01 t WHERE t.rid = :rid")
    , @NamedQuery(name = "TblResidentes01.findByRcveresi", query = "SELECT t FROM TblResidentes01 t WHERE t.rcveresi = :rcveresi")
    , @NamedQuery(name = "TblResidentes01.findByRnombre", query = "SELECT t FROM TblResidentes01 t WHERE t.rnombre = :rnombre")
    , @NamedQuery(name = "TblResidentes01.findByRapellidop", query = "SELECT t FROM TblResidentes01 t WHERE t.rapellidop = :rapellidop")
    , @NamedQuery(name = "TblResidentes01.findByRapellidom", query = "SELECT t FROM TblResidentes01 t WHERE t.rapellidom = :rapellidom")
    , @NamedQuery(name = "TblResidentes01.findByRgenero", query = "SELECT t FROM TblResidentes01 t WHERE t.rgenero = :rgenero")
    , @NamedQuery(name = "TblResidentes01.findByRtele", query = "SELECT t FROM TblResidentes01 t WHERE t.rtele = :rtele")
    , @NamedQuery(name = "TblResidentes01.findByRemail", query = "SELECT t FROM TblResidentes01 t WHERE t.remail = :remail")})
public class TblResidentes01 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "rid")
    private int rid;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "rcveresi")
    private Integer rcveresi;
    @Size(max = 255)
    @Column(name = "rnombre")
    private String rnombre;
    @Size(max = 255)
    @Column(name = "rapellidop")
    private String rapellidop;
    @Size(max = 255)
    @Column(name = "rapellidom")
    private String rapellidom;
    @Size(max = 50)
    @Column(name = "rgenero")
    private String rgenero;
    @Column(name = "rtele")
    private Integer rtele;
    @Size(max = 50)
    @Column(name = "remail")
    private String remail;
    @JoinColumn(name = "rcveref", referencedColumnName = "rcveref")
    @ManyToOne
    private CtReferencia01 rcveref;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "rccveresi")
    private Collection<ResidentesCondominios01> residentesCondominios01Collection;

    public TblResidentes01() {
    }

    public TblResidentes01(Integer rcveresi) {
        this.rcveresi = rcveresi;
    }

    public TblResidentes01(Integer rcveresi, int rid) {
        this.rcveresi = rcveresi;
        this.rid = rid;
    }

    public int getRid() {
        return rid;
    }

    public void setRid(int rid) {
        this.rid = rid;
    }

    public Integer getRcveresi() {
        return rcveresi;
    }

    public void setRcveresi(Integer rcveresi) {
        this.rcveresi = rcveresi;
    }

    public String getRnombre() {
        return rnombre;
    }

    public void setRnombre(String rnombre) {
        this.rnombre = rnombre;
    }

    public String getRapellidop() {
        return rapellidop;
    }

    public void setRapellidop(String rapellidop) {
        this.rapellidop = rapellidop;
    }

    public String getRapellidom() {
        return rapellidom;
    }

    public void setRapellidom(String rapellidom) {
        this.rapellidom = rapellidom;
    }

    public String getRgenero() {
        return rgenero;
    }

    public void setRgenero(String rgenero) {
        this.rgenero = rgenero;
    }

    public Integer getRtele() {
        return rtele;
    }

    public void setRtele(Integer rtele) {
        this.rtele = rtele;
    }

    public String getRemail() {
        return remail;
    }

    public void setRemail(String remail) {
        this.remail = remail;
    }

    public CtReferencia01 getRcveref() {
        return rcveref;
    }

    public void setRcveref(CtReferencia01 rcveref) {
        this.rcveref = rcveref;
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
        hash += (rcveresi != null ? rcveresi.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblResidentes01)) {
            return false;
        }
        TblResidentes01 other = (TblResidentes01) object;
        if ((this.rcveresi == null && other.rcveresi != null) || (this.rcveresi != null && !this.rcveresi.equals(other.rcveresi))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.com.AEF.entityesexternal.TblResidentes01[ rcveresi=" + rcveresi + " ]";
    }
    
}

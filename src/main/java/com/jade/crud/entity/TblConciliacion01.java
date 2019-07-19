/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jade.crud.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author mperez
 */
@Entity
@Table(name = "Tbl_Conciliacion01")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblConciliacion01.findAll", query = "SELECT t FROM TblConciliacion01 t")
    , @NamedQuery(name = "TblConciliacion01.findByCcveref", query = "SELECT t FROM TblConciliacion01 t WHERE t.ccveref = :ccveref")
    , @NamedQuery(name = "TblConciliacion01.findByCvobo", query = "SELECT t FROM TblConciliacion01 t WHERE t.cvobo = :cvobo")
    , @NamedQuery(name = "TblConciliacion01.findByCcvestat", query = "SELECT t FROM TblConciliacion01 t WHERE t.ccvestat = :ccvestat")
    , @NamedQuery(name = "TblConciliacion01.findByCnomresidente", query = "SELECT t FROM TblConciliacion01 t WHERE t.cnomresidente = :cnomresidente")
    , @NamedQuery(name = "TblConciliacion01.findByCemail", query = "SELECT t FROM TblConciliacion01 t WHERE t.cemail = :cemail")
    , @NamedQuery(name = "TblConciliacion01.findByCid", query = "SELECT t FROM TblConciliacion01 t WHERE t.cid = :cid")
    , @NamedQuery(name = "TblConciliacion01.findByCmonto", query = "SELECT t FROM TblConciliacion01 t WHERE t.cmonto = :cmonto")
    , @NamedQuery(name = "TblConciliacion01.findByCfecha", query = "SELECT t FROM TblConciliacion01 t WHERE t.cfecha = :cfecha")
    , @NamedQuery(name = "TblConciliacion01.findByCanio", query = "SELECT t FROM TblConciliacion01 t WHERE t.canio = :canio")
    , @NamedQuery(name = "TblConciliacion01.findByCmespa", query = "SELECT t FROM TblConciliacion01 t WHERE t.cmespa = :cmespa")})
public class TblConciliacion01 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "cid")
    private Integer cid;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "cmonto")
    private Double cmonto;
    @Column(name = "cfecha")
    @Temporal(TemporalType.TIMESTAMP)
    private Date cfecha;
    @Column(name = "canio")
    private Integer canio;
    @Size(max = 20)
    @Column(name = "cmespa")
    private String cmespa;
    @Size(max = 50)
    @Column(name = "ccveref")
    private String ccveref;
    @Size(max = 255)
    @Column(name = "cnomresidente")
    private String cnomresidente;
    @Size(max = 255)
    @Column(name = "cemail")
    private String cemail;
    @Column(name = "ccvestat")
    private Integer ccvestat;
    @Column(name = "cvobo")
    private Boolean cvobo;
    /*
    @JoinColumn(name = "ccveestat", referencedColumnName = "epcvestat")
    @ManyToOne
    private CtEstatuspago01 ccveestat;
    */
    /*
    @JoinColumn(name = "ccverefe", referencedColumnName = "rcveref")
    @ManyToOne(optional = false)
    private CtReferencia01 ccverefe;
    */
    @JoinColumn(name = "ccveviv", referencedColumnName = "vcvevivienda")
    @ManyToOne(optional = false)
    private CtViviendas01 ccveviv;

    public TblConciliacion01() {
    }

    public TblConciliacion01(Integer cid) {
        this.cid = cid;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Double getCmonto() {
        return cmonto;
    }

    public void setCmonto(Double cmonto) {
        this.cmonto = cmonto;
    }

    public Date getCfecha() {
        return cfecha;
    }

    public void setCfecha(Date cfecha) {
        this.cfecha = cfecha;
    }

    public Integer getCanio() {
        return canio;
    }

    public void setCanio(Integer canio) {
        this.canio = canio;
    }

    public String getCmespa() {
        return cmespa;
    }

    public void setCmespa(String cmespa) {
        this.cmespa = cmespa;
    }

    public String getCcveref() {
        return ccveref;
    }

    public void setCcveref(String ccveref) {
        this.ccveref = ccveref;
    }

    public String getCnomresidente() {
        return cnomresidente;
    }

    public void setCnomresidente(String cnomresidente) {
        this.cnomresidente = cnomresidente;
    }

    public String getCemail() {
        return cemail;
    }

    public void setCemail(String cemail) {
        this.cemail = cemail;
    }

    public Integer getCcvestat() {
        return ccvestat;
    }

    public void setCcvestat(Integer ccvestat) {
        this.ccvestat = ccvestat;
    }

    public Boolean getCvobo() {
        return cvobo;
    }

    public void setCvobo(Boolean cvobo) {
        this.cvobo = cvobo;
    }
    
    
    /*
    public CtEstatuspago01 getCcveestat() {
        return ccveestat;
    }

    public void setCcveestat(CtEstatuspago01 ccveestat) {
        this.ccveestat = ccveestat;
    }
    */
    /*
    public CtReferencia01 getCcverefe() {
        return ccverefe;
    }

    public void setCcverefe(CtReferencia01 ccverefe) {
        this.ccverefe = ccverefe;
    }
    */
    public CtViviendas01 getCcveviv() {
        return ccveviv;
    }

    public void setCcveviv(CtViviendas01 ccveviv) {
        this.ccveviv = ccveviv;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cid != null ? cid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblConciliacion01)) {
            return false;
        }
        TblConciliacion01 other = (TblConciliacion01) object;
        if ((this.cid == null && other.cid != null) || (this.cid != null && !this.cid.equals(other.cid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.com.AEF.entityesexternal.TblConciliacion01[ cid=" + cid + " ]";
    }
    
}

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
@Table(name = "Tbl_Usuarios01")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblUsuarios01.findAll", query = "SELECT t FROM TblUsuarios01 t")
    , @NamedQuery(name = "TblUsuarios01.findByUidusuario", query = "SELECT t FROM TblUsuarios01 t WHERE t.uidusuario = :uidusuario")
    , @NamedQuery(name = "TblUsuarios01.findByUcveusu", query = "SELECT t FROM TblUsuarios01 t WHERE t.ucveusu = :ucveusu")
    , @NamedQuery(name = "TblUsuarios01.findByUnombre", query = "SELECT t FROM TblUsuarios01 t WHERE t.unombre = :unombre")
    , @NamedQuery(name = "TblUsuarios01.findByUapellidop", query = "SELECT t FROM TblUsuarios01 t WHERE t.uapellidop = :uapellidop")
    , @NamedQuery(name = "TblUsuarios01.findByUnomusuario", query = "SELECT t FROM TblUsuarios01 t WHERE t.unomusuario = :unomusuario")
    , @NamedQuery(name = "TblUsuarios01.findByUpass", query = "SELECT t FROM TblUsuarios01 t WHERE t.upass = :upass")
    , @NamedQuery(name = "TblUsuarios01.findByUfechaalta", query = "SELECT t FROM TblUsuarios01 t WHERE t.ufechaalta = :ufechaalta")
    , @NamedQuery(name = "TblUsuarios01.findByUfechabaja", query = "SELECT t FROM TblUsuarios01 t WHERE t.ufechabaja = :ufechabaja")
    , @NamedQuery(name = "TblUsuarios01.findByUestatus", query = "SELECT t FROM TblUsuarios01 t WHERE t.uestatus = :uestatus")})
public class TblUsuarios01 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "uidusuario")
    private int uidusuario;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ucveusu")
    private Integer ucveusu;
    @Size(max = 255)
    @Column(name = "unombre")
    private String unombre;
    @Size(max = 255)
    @Column(name = "uapellidop")
    private String uapellidop;
    @Size(max = 255)
    @Column(name = "unomusuario")
    private String unomusuario;
    @Size(max = 255)
    @Column(name = "upass")
    private String upass;
    @Column(name = "ufechaalta")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ufechaalta;
    @Column(name = "ufechabaja")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ufechabaja;
    @Column(name = "uestatus")
    private Boolean uestatus;
    @JoinColumn(name = "ucverol", referencedColumnName = "rcverol")
    @ManyToOne
    private CtRoles01 ucverol;

    public TblUsuarios01() {
    }

    public TblUsuarios01(Integer ucveusu) {
        this.ucveusu = ucveusu;
    }

    public TblUsuarios01(Integer ucveusu, int uidusuario) {
        this.ucveusu = ucveusu;
        this.uidusuario = uidusuario;
    }

    public int getUidusuario() {
        return uidusuario;
    }

    public void setUidusuario(int uidusuario) {
        this.uidusuario = uidusuario;
    }

    public Integer getUcveusu() {
        return ucveusu;
    }

    public void setUcveusu(Integer ucveusu) {
        this.ucveusu = ucveusu;
    }

    public String getUnombre() {
        return unombre;
    }

    public void setUnombre(String unombre) {
        this.unombre = unombre;
    }

    public String getUapellidop() {
        return uapellidop;
    }

    public void setUapellidop(String uapellidop) {
        this.uapellidop = uapellidop;
    }

    public String getUnomusuario() {
        return unomusuario;
    }

    public void setUnomusuario(String unomusuario) {
        this.unomusuario = unomusuario;
    }

    public String getUpass() {
        return upass;
    }

    public void setUpass(String upass) {
        this.upass = upass;
    }

    public Date getUfechaalta() {
        return ufechaalta;
    }

    public void setUfechaalta(Date ufechaalta) {
        this.ufechaalta = ufechaalta;
    }

    public Date getUfechabaja() {
        return ufechabaja;
    }

    public void setUfechabaja(Date ufechabaja) {
        this.ufechabaja = ufechabaja;
    }

    public Boolean getUestatus() {
        return uestatus;
    }

    public void setUestatus(Boolean uestatus) {
        this.uestatus = uestatus;
    }

    public CtRoles01 getUcverol() {
        return ucverol;
    }

    public void setUcverol(CtRoles01 ucverol) {
        this.ucverol = ucverol;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ucveusu != null ? ucveusu.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblUsuarios01)) {
            return false;
        }
        TblUsuarios01 other = (TblUsuarios01) object;
        if ((this.ucveusu == null && other.ucveusu != null) || (this.ucveusu != null && !this.ucveusu.equals(other.ucveusu))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.com.AEF.entityesexternal.TblUsuarios01[ ucveusu=" + ucveusu + " ]";
    }
    
}

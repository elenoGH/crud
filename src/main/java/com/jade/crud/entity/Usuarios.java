
package com.jade.crud.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
@Table(name = "usuarios")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Usuarios.findAll", query = "SELECT u FROM Usuarios u")
    , @NamedQuery(name = "Usuarios.findById", query = "SELECT u FROM Usuarios u WHERE u.id = :id")
    , @NamedQuery(name = "Usuarios.findByName", query = "SELECT u FROM Usuarios u WHERE u.name = :name")
    , @NamedQuery(name = "Usuarios.findBySecondname", query = "SELECT u FROM Usuarios u WHERE u.secondname = :secondname")
    , @NamedQuery(name = "Usuarios.findByAppat", query = "SELECT u FROM Usuarios u WHERE u.appat = :appat")
    , @NamedQuery(name = "Usuarios.findByApmat", query = "SELECT u FROM Usuarios u WHERE u.apmat = :apmat")
    , @NamedQuery(name = "Usuarios.findByEdad", query = "SELECT u FROM Usuarios u WHERE u.edad = :edad")
    , @NamedQuery(name = "Usuarios.findByBancocuenta", query = "SELECT u FROM Usuarios u WHERE u.bancocuenta = :bancocuenta")
    , @NamedQuery(name = "Usuarios.findByBancosucursal", query = "SELECT u FROM Usuarios u WHERE u.bancosucursal = :bancosucursal")
    , @NamedQuery(name = "Usuarios.findByBancoclave", query = "SELECT u FROM Usuarios u WHERE u.bancoclave = :bancoclave")
    , @NamedQuery(name = "Usuarios.findByBancoreferencia", query = "SELECT u FROM Usuarios u WHERE u.bancoreferencia = :bancoreferencia")
    , @NamedQuery(name = "Usuarios.findByFolio", query = "SELECT u FROM Usuarios u WHERE u.folio = :folio")
    , @NamedQuery(name = "Usuarios.findByCasa", query = "SELECT u FROM Usuarios u WHERE u.casa = :casa")
    , @NamedQuery(name = "Usuarios.findByManzana", query = "SELECT u FROM Usuarios u WHERE u.manzana = :manzana")
    , @NamedQuery(name = "Usuarios.findByPropietario", query = "SELECT u FROM Usuarios u WHERE u.propietario = :propietario")
    , @NamedQuery(name = "Usuarios.findByPrivada", query = "SELECT u FROM Usuarios u WHERE u.privada = :privada")
    , @NamedQuery(name = "Usuarios.findByEmail", query = "SELECT u FROM Usuarios u WHERE u.email = :email")
})
public class Usuarios implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Size(max = 900)
    @Column(name = "name")
    private String name;
    @Size(max = 900)
    @Column(name = "secondname")
    private String secondname;
    @Size(max = 900)
    @Column(name = "appat")
    private String appat;
    @Size(max = 900)
    @Column(name = "apmat")
    private String apmat;
    @Column(name = "edad")
    private Integer edad;
    @Size(max = 900)
    @Column(name = "bancocuenta")
    private String bancocuenta;
    @Size(max = 900)
    @Column(name = "bancosucursal")
    private String bancosucursal;
    @Size(max = 900)
    @Column(name = "bancoclave")
    private String bancoclave;
    @Size(max = 900)
    @Column(name = "bancoreferencia")
    private String bancoreferencia;
    @Size(max = 900)
    @Column(name = "folio")
    private String folio;
    @Size(max = 900)
    @Column(name = "casa")
    private String casa;
    @Size(max = 900)
    @Column(name = "manzana")
    private String manzana;
    @Size(max = 900)
    @Column(name = "propietario")
    private String propietario;
    @Size(max = 900)
    @Column(name = "privada")
    private String privada;
    @Size(max = 400)
    @Column(name = "email")
    private String email;
    
    public Usuarios() {
    }

    public Usuarios(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecondname() {
        return secondname;
    }

    public void setSecondname(String secondname) {
        this.secondname = secondname;
    }

    public String getAppat() {
        return appat;
    }

    public void setAppat(String appat) {
        this.appat = appat;
    }

    public String getApmat() {
        return apmat;
    }

    public void setApmat(String apmat) {
        this.apmat = apmat;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getBancocuenta() {
        return bancocuenta;
    }

    public void setBancocuenta(String bancocuenta) {
        this.bancocuenta = bancocuenta;
    }

    public String getBancosucursal() {
        return bancosucursal;
    }

    public void setBancosucursal(String bancosucursal) {
        this.bancosucursal = bancosucursal;
    }

    public String getBancoclave() {
        return bancoclave;
    }

    public void setBancoclave(String bancoclave) {
        this.bancoclave = bancoclave;
    }

    public String getBancoreferencia() {
        return bancoreferencia;
    }

    public void setBancoreferencia(String bancoreferencia) {
        this.bancoreferencia = bancoreferencia;
    }

    public String getFolio() {
        return folio;
    }

    public void setFolio(String folio) {
        this.folio = folio;
    }

    public String getCasa() {
        return casa;
    }

    public void setCasa(String casa) {
        this.casa = casa;
    }

    public String getManzana() {
        return manzana;
    }

    public void setManzana(String manzana) {
        this.manzana = manzana;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public String getPrivada() {
        return privada;
    }

    public void setPrivada(String privada) {
        this.privada = privada;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usuarios)) {
            return false;
        }
        Usuarios other = (Usuarios) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Usuarios [ id=" + id + " ]";
    }
    
}

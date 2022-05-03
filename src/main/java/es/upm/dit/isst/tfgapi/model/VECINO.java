package es.upm.dit.isst.tfgapi.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
public class VECINO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private String nombre;
    private String piso;
    private String contraseña;
    private Boolean esPresidente;

    @ManyToOne (fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "comunidad_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private COMUNIDAD comunidad;

    public VECINO () { }

    public VECINO(String nombre, String piso, String contraseña, Boolean esPresidente, COMUNIDAD comunidad) {
        this.nombre = nombre;
        this.piso = piso;
        this.contraseña = contraseña;
        this.esPresidente = esPresidente;
        this.comunidad = comunidad;

    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getPiso() {
        return piso;
    }
    public void setPiso(String piso) {
        this.piso = piso;
    }
    public Boolean getEsPresidente() {
        return esPresidente;
    }
    public void setEsPresidente(Boolean esPresidente) {
        this.esPresidente = esPresidente;
    }
    public COMUNIDAD getComunidad() {
        return comunidad;
    }
    public void setComunidad(COMUNIDAD comunidad) {
        this.comunidad = comunidad;
    }
    
}

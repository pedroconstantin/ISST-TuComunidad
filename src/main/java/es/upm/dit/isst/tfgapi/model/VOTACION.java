package es.upm.dit.isst.tfgapi.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class VOTACION {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String idvotacion;
    private String fechayhoralimite;
    private String tema;
    private Integer votosafavor;
    private Integer votosencontra;

    public VOTACION () { }
    public VOTACION(String idvotacion, String tema, String fechayhoralimite, Integer votosafavor, Integer votosencontra) {
        this.idvotacion = idvotacion;
        this.tema = tema;
        this.fechayhoralimite = fechayhoralimite;
        this.votosafavor = votosafavor;
        this.votosencontra = votosafavor;
    
    }
    
    public Integer getVotosafavor() {
        return votosafavor;
    }
    public void setVotosafavor(Integer votosafavor) {
        this.votosafavor = votosafavor;
    }
    public Integer getVotosencontra() {
        return votosencontra;
    }
    public void setVotosencontra(Integer votosencontra) {
        this.votosencontra = votosencontra;
    }
    public String getFechayhoralimite() {
        return fechayhoralimite;
    }
    public void setFechayhoralimite(String fechayhoralimite) {
        this.fechayhoralimite = fechayhoralimite;
    }
    public String getIdvotacion() {
        return idvotacion;
    }
    public void setIdvotacion(String idvotacion) {
        this.idvotacion = idvotacion;
    }
    public String getTema() {
        return tema;
    }
    public void setTema(String tema) {
        this.tema = tema;
    }
    
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package administrador_horarios.Entities;

import java.io.Serializable;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Amaury Gomez
 */
@Entity
@Table(name = "institucion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Institucion.findAll", query = "SELECT i FROM Institucion i"),
    @NamedQuery(name = "Institucion.findByHorarios", query = "SELECT i FROM Institucion i WHERE i.horarios = :horarios"),
    @NamedQuery(name = "Institucion.findByMaterias", query = "SELECT i FROM Institucion i WHERE i.materias = :materias"),
    @NamedQuery(name = "Institucion.findByAulas", query = "SELECT i FROM Institucion i WHERE i.aulas = :aulas")})
public class Institucion implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "Horarios")
    private String horarios;
    @Column(name = "Materias")
    private String materias;
    @Id
    @Basic(optional = false)
    @Column(name = "Aulas")
    private String aulas;

    public Institucion() {
    }

    public Institucion(String aulas) {
        this.aulas = aulas;
    }

    public String getHorarios() {
        return horarios;
    }

    public void setHorarios(String horarios) {
        this.horarios = horarios;
    }

    public String getMaterias() {
        return materias;
    }

    public void setMaterias(String materias) {
        this.materias = materias;
    }

    public String getAulas() {
        return aulas;
    }

    public void setAulas(String aulas) {
        this.aulas = aulas;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (aulas != null ? aulas.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Institucion)) {
            return false;
        }
        Institucion other = (Institucion) object;
        if ((this.aulas == null && other.aulas != null) || (this.aulas != null && !this.aulas.equals(other.aulas))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "administrador_horarios.Entities.Institucion[ aulas=" + aulas + " ]";
    }
    
}

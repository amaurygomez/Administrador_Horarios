/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package administrador_horarios.Entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Amaury Gomez
 */
@Entity
@Table(name = "profesor")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Profesor.findAll", query = "SELECT p FROM Profesor p"),
    @NamedQuery(name = "Profesor.findByNombre", query = "SELECT p FROM Profesor p WHERE p.nombre = :nombre"),
    @NamedQuery(name = "Profesor.findByApellidos", query = "SELECT p FROM Profesor p WHERE p.apellidos = :apellidos"),
    @NamedQuery(name = "Profesor.findByCedula", query = "SELECT p FROM Profesor p WHERE p.cedula = :cedula"),
    @NamedQuery(name = "Profesor.findByMaterias", query = "SELECT p FROM Profesor p WHERE p.materias = :materias"),
    @NamedQuery(name = "Profesor.findByHorarios", query = "SELECT p FROM Profesor p WHERE p.horarios = :horarios")})
public class Profesor implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "Nombre")
    private String nombre;
    @Column(name = "Apellidos")
    private String apellidos;
    @Id
    @Basic(optional = false)
    @Column(name = "Cedula")
    private Long cedula;
    @Column(name = "Materias")
    private String materias;
    @Column(name = "Horarios")
    @Temporal(TemporalType.DATE)
    private Date horarios;

    public Profesor() {
    }

    public Profesor(Long cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Long getCedula() {
        return cedula;
    }

    public void setCedula(Long cedula) {
        this.cedula = cedula;
    }

    public String getMaterias() {
        return materias;
    }

    public void setMaterias(String materias) {
        this.materias = materias;
    }

    public Date getHorarios() {
        return horarios;
    }

    public void setHorarios(Date horarios) {
        this.horarios = horarios;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cedula != null ? cedula.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Profesor)) {
            return false;
        }
        Profesor other = (Profesor) object;
        if ((this.cedula == null && other.cedula != null) || (this.cedula != null && !this.cedula.equals(other.cedula))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "administrador_horarios.Entities.Profesor[ cedula=" + cedula + " ]";
    }
    
}

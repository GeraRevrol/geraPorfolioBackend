
package com.Backend.PortfolioGera.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;


@Getter 
@Setter
@Entity 
@Table(name = "experiencia")
public class experiencia {
    
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long idExperiencia;
    
    private String cargo;
    private String institucion;
    private String anioingreso;
    private String anioegreso;
    
    @JsonIgnore
    @ManyToOne
    @JoinColumn (name="idPersona")
    private persona persona;
    
   public experiencia () {}
    
 public experiencia (Long idExperiencia, String cargo, String institucion, String anioingreso, String anioegreso) {
    
        this.idExperiencia = idExperiencia;
        this.cargo = cargo;
        this.institucion = institucion;
        this.anioingreso = anioingreso;
        this.anioegreso = anioegreso;
    }
    
}

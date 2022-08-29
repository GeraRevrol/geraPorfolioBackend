
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
@Table(name = "educacion")
public class educacion {
    
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long idEducacion;
    private String titulo;
    private String institucion;
    private String anioingreso;
    private String anioegreso;
    
    @JsonIgnore
    @ManyToOne
    @JoinColumn (name="idPersona")
    private persona persona;
    
   public educacion () {}
    
 public educacion (Long idEducacion, String titulo, String institucion, String anioingreso, String anioegreso) {
    
        this.idEducacion = idEducacion;
        this.titulo = titulo;
        this.institucion = institucion;
        this.anioingreso = anioingreso;
        this.anioegreso = anioegreso;
    }
    
}

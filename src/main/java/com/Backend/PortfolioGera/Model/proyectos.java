
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
@Table(name = "proyectos")
public class proyectos {
    
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long idProyectos;
    private String nombre;
    private String descripcion;
    private String url;
    
    @JsonIgnore
    @ManyToOne
    @JoinColumn (name="idPersona")
    private persona persona;
      
    
    
    
   public proyectos () {}
    
 public proyectos (Long idProyectos, String nombre, String descripcion, String url) {
    
        this.idProyectos = idProyectos;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.url = url;
        
    }
    
}

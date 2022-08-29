
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
@Table(name = "skills")
public class skills {
    
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long idSkills;
    private String habilidades;
    
    @JsonIgnore
    @ManyToOne
    @JoinColumn (name="idPersona")
    private persona persona;
      
    
    
    
   public skills () {}
    
 public skills (Long idSkills, String habilidades) {
    
        this.idSkills = idSkills;
        this.habilidades = habilidades;
    }
    
}

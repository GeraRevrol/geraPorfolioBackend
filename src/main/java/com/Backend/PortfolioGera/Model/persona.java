
package com.Backend.PortfolioGera.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;



@Getter @Setter
@Entity 
@Table(name = "persona")
public class persona {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idPersona;
    
    private String nombre;
    private String apellido;
    private String domicilio;
    private String fechaNac;
    private String telefono;
    private String correo;
    private String sobreMi;
    private String urlFoto;
    private String descripcion;
    

    public persona(){}
    
    public persona(Long idPersona, String nombre, String apellido,String domicilio, String fechaNac, String telefono, String correo, String sobreMi, String urlFoto, String descripcion){
        
    this.idPersona = idPersona;
    this.nombre = nombre;
    this.apellido = apellido;
    this.domicilio = domicilio;
    this.fechaNac = fechaNac;
    this.telefono = telefono;
    this.correo = correo;
    this.sobreMi = sobreMi;
    this.urlFoto = urlFoto;
    this.descripcion = descripcion;

        
    }
   
}

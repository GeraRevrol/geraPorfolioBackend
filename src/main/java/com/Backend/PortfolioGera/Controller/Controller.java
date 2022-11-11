
package com.Backend.PortfolioGera.Controller;

import com.Backend.PortfolioGera.Model.educacion;
import com.Backend.PortfolioGera.Model.experiencia;
import com.Backend.PortfolioGera.Model.persona;
import com.Backend.PortfolioGera.Model.proyectos;
import com.Backend.PortfolioGera.Model.skills;
import com.Backend.PortfolioGera.Service.IEducacionService;
import com.Backend.PortfolioGera.Service.IExperienciaService;
import com.Backend.PortfolioGera.Service.IPersonaService;
import com.Backend.PortfolioGera.Service.IProyectosService;
import com.Backend.PortfolioGera.Service.ISkillsService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin(origins = "https://frontendporfoliogera.web.app")
public class Controller {
    
    @Autowired 
    private IPersonaService persoServ;
    @Autowired 
    private ISkillsService skillsServ;
    @Autowired 
    private IExperienciaService experienciaServ;
    @Autowired 
    private IEducacionService educacionServ; 
    @Autowired 
    private IProyectosService proyectosServ;

    
    
    
      //Persona
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping ("/personas/new")
    public void agregarPersona (@RequestBody persona pers) {
        persoServ.crearPersona(pers);
    }
    
    @GetMapping ("/personas/ver")
    @ResponseBody
    public List<persona> verPersonas () {
        return persoServ.verPersonas();
    }   
    
    @GetMapping ("/personas/ver/{idPersona}")
    public persona buscarPersona (@PathVariable Long idPersona) {
        return persoServ.buscarPersona (idPersona);
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping ("/personas/editar/{idPersona}")
    public void editarPersona (@RequestBody persona pers) {
        persoServ.crearPersona(pers);
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping ("/personas/delete/{idPersona}")
    public void borrarPersona (@PathVariable Long idPersona) {
        persoServ.borrarPersona(idPersona);
    }
    
           
    //Skills
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping ("/skills/new")
   public void agregarSkills (@RequestBody skills ski) {
        skillsServ.crearSkills(ski);
    }
   
    @GetMapping ("/skills/ver")
    @ResponseBody
    public List<skills> verSkills () {
        return skillsServ.verSkills();
    }
    
    @GetMapping ("/skills/ver/{idSkills}")
   public skills buscarSkills(@PathVariable Long idSkills){
       return skillsServ.buscarSkills(idSkills);
    }
   
   @PreAuthorize("hasRole('ADMIN')") 
   @PutMapping ("/skills/editar/{idSkills}")
    public void editarSkills (@RequestBody skills ski) {
        skillsServ.crearSkills(ski);
    }
        
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping ("/skills/delete/{idSkills}")
    public void borrarSkills (@PathVariable Long idSkills) {
        skillsServ.borrarSkills(idSkills);
    }
    
    
  
    //Experiencia
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping ("/experiencia/new")
   public void agregarExperiencia (@RequestBody experiencia exp) {
        experienciaServ.crearExperiencia(exp);
    }
   
    @GetMapping ("/experiencia/ver")
    @ResponseBody
    public List<experiencia> verExperiencia () {
        return experienciaServ.verExperiencia();
    }
    
    @GetMapping ("/experiencia/ver/{idExperiencia}")
    public experiencia buscarExperiencia(@PathVariable Long idExperiencia){
        return experienciaServ.buscarExperiencia(idExperiencia);
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping ("/experiencia/editar/{idExperiencia}")
    public void editarExperiencia (@RequestBody experiencia exp) {
        experienciaServ.crearExperiencia(exp);
    }
        
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping ("/experiencia/delete/{idExperiencia}")
    public void borrarExperiencia (@PathVariable Long idExperiencia) {
        experienciaServ.borrarExperiencia(idExperiencia);
    }
    
   
    //Educacion
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping ("/educacion/new")
   public void agregarEducacion (@RequestBody educacion edu) {
        educacionServ.crearEducacion(edu);
    }
   
    @GetMapping ("/educacion/ver")
    @ResponseBody
    public List<educacion> verEducacion () {
        return educacionServ.verEducacion();
    }
    
    @GetMapping ("/educacion/ver/{idEducacion}")
    public educacion buscarEducacion(@PathVariable Long idEducacion){
         return educacionServ.buscarEducacion(idEducacion);
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping ("/educacion/editar/{idEducacion}")
    public void editarEducacion (@RequestBody educacion edu) {
        educacionServ.crearEducacion(edu);
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping ("/educacion/delete/{idEducacion}")
    public void borrarEducacion (@PathVariable Long idEducacion) {
        educacionServ.borrarEducacion(idEducacion);
    }
    
     //Proyectos
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping ("/proyectos/new")
   public void agregarProyectos (@RequestBody proyectos pro) {
        proyectosServ.crearProyectos(pro);
    }
   
    @GetMapping ("/proyectos/ver")
    @ResponseBody
    public List<proyectos> verProyectos () {
        return proyectosServ.verProyectos();
    }
    
    @GetMapping ("/proyectos/ver/{idProyectos}")
    public proyectos buscarProyectos(@PathVariable Long idProyectos){
        return proyectosServ.buscarProyectos(idProyectos);
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping ("/proyectos/editar/{idProyectos}")
    public void editarProyectos (@RequestBody proyectos pro) {
        proyectosServ.crearProyectos(pro);
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping ("/proyectos/delete/{idProyectos}")
    public void borrarProyectos (@PathVariable Long idProyectos) {
        proyectosServ.borrarProyectos(idProyectos);
    }
      
 }

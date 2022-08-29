
package com.Backend.PortfolioGera.Service;

import com.Backend.PortfolioGera.Model.proyectos;
import com.Backend.PortfolioGera.Repository.ProyectosRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProyectosService implements IProyectosService{

    @Autowired
    public ProyectosRepository proyectosRepo;
    
    @Override
    public List<proyectos> verProyectos() {
        return proyectosRepo.findAll(); 
    }

    @Override
    public void crearProyectos(proyectos pro){
        proyectosRepo.save(pro);
    }

    @Override
    public void borrarProyectos(Long idProyectos)  {
      proyectosRepo.deleteById(idProyectos);
    }

    @Override
    public proyectos buscarProyectos(Long idProyectos) {
        return proyectosRepo.findById(idProyectos).orElse(null);
    }

}
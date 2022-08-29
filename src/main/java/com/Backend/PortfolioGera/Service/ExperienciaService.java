
package com.Backend.PortfolioGera.Service;

import com.Backend.PortfolioGera.Model.experiencia;
import com.Backend.PortfolioGera.Repository.ExperienciaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienciaService implements IExperienciaService{

    @Autowired
    public ExperienciaRepository experienciaRepo;
    
    @Override
    public List<experiencia> verExperiencia() {
        return experienciaRepo.findAll(); 
    }

    @Override
    public void crearExperiencia(experiencia exp){
        experienciaRepo.save(exp);
    }

    @Override
    public void borrarExperiencia(Long idExperiencia)  {
      experienciaRepo.deleteById(idExperiencia);
    }

    @Override
    public experiencia buscarExperiencia(Long idExperiencia) {
        return experienciaRepo.findById(idExperiencia).orElse(null);
    }

}


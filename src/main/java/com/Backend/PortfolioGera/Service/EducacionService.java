
package com.Backend.PortfolioGera.Service;


import com.Backend.PortfolioGera.Model.educacion;
import com.Backend.PortfolioGera.Repository.EducacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class EducacionService implements IEducacionService{

    @Autowired
    public EducacionRepository educacionRepo;
    
    @Override
    public List<educacion> verEducacion() {
        return educacionRepo.findAll(); 
    }

    @Override
    public void crearEducacion(educacion edu){
        educacionRepo.save(edu);
    }

    @Override
    public void borrarEducacion(Long idEducacion)  {
      educacionRepo.deleteById(idEducacion);
    }

    @Override
    public educacion buscarEducacion(Long idEducacion) {
        return educacionRepo.findById(idEducacion).orElse(null);
    }

}
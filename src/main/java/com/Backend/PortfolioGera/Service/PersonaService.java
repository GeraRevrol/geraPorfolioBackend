
package com.Backend.PortfolioGera.Service;

import com.Backend.PortfolioGera.Model.persona;
import com.Backend.PortfolioGera.Repository.PersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService implements IPersonaService{

    @Autowired 
    private PersonaRepository persoRepo;
    
    @Override
    public List<persona> verPersonas() {
      return persoRepo.findAll();
    }

    @Override
    public void crearPersona(persona per) {
      persoRepo.save(per);
    }

    @Override
    public void borrarPersona(Long idPersona) {
      persoRepo.deleteById(idPersona);
    }

    @Override
    public persona buscarPersona(Long idPersona) {
      return persoRepo.findById(idPersona).orElse(null);
    }
    
}

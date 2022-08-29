
package com.Backend.PortfolioGera.Service;

import com.Backend.PortfolioGera.Model.skills;
import com.Backend.PortfolioGera.Repository.SkillsRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class SkillsService implements ISkillsService{

    @Autowired
    public SkillsRepository skillsRepo;
    
    @Override
    public List<skills> verSkills() {
        return skillsRepo.findAll(); 
    }

    @Override
    public void crearSkills(skills ski){
        skillsRepo.save(ski);
    }

    @Override
    public void borrarSkills(Long idSkills)  {
      skillsRepo.deleteById(idSkills);
    }

    @Override
    public skills buscarSkills(Long idSkills) {
        return skillsRepo.findById(idSkills).orElse(null);
    }

}
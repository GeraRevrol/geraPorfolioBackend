
package com.Backend.PortfolioGera.Service;

import com.Backend.PortfolioGera.Model.skills;
import java.util.List;

public interface ISkillsService {
    
    public abstract List<skills> verSkills ();
    
    public abstract void crearSkills (skills ski);
    
    public abstract void borrarSkills (Long idSkills);
    
    public abstract skills buscarSkills (Long idSkills);
}

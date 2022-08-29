
package com.Backend.PortfolioGera.Service;

import com.Backend.PortfolioGera.Model.experiencia;
import java.util.List;

public interface IExperienciaService {
    public abstract List<experiencia> verExperiencia ();
    
    public abstract void crearExperiencia (experiencia exp);
    
    public abstract void borrarExperiencia (Long idExperiencia);
    
    public abstract experiencia buscarExperiencia (Long idExperiencia);  
}

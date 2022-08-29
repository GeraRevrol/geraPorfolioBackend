
package com.Backend.PortfolioGera.Service;

import com.Backend.PortfolioGera.Model.persona;
import java.util.List;

public interface IPersonaService {
    
    public List<persona> verPersonas ();
    
    public void crearPersona (persona per);
    
    public void borrarPersona (Long idPersona);
    
    public persona buscarPersona (Long idPersona);
    
}

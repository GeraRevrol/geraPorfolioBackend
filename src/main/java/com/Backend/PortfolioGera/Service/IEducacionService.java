
package com.Backend.PortfolioGera.Service;

import com.Backend.PortfolioGera.Model.educacion;
import java.util.List;

public interface IEducacionService {
    public abstract List<educacion> verEducacion ();
    
    public abstract void crearEducacion (educacion edu);
    
    public abstract void borrarEducacion (Long idEducacion);
    
    public abstract educacion buscarEducacion (Long idEducacion);  
}

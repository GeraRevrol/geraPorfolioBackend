
package com.Backend.PortfolioGera.Service;

import com.Backend.PortfolioGera.Model.proyectos;
import java.util.List;

public interface IProyectosService {
    
    public abstract List<proyectos> verProyectos ();
    
    public abstract void crearProyectos (proyectos pro);
    
    public abstract void borrarProyectos (Long idProyectos);
    
    public abstract proyectos buscarProyectos (Long idProyectos);
}


package com.Backend.PortfolioGera.Repository;

import com.Backend.PortfolioGera.Model.proyectos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProyectosRepository extends JpaRepository <proyectos, Long> {
    
}

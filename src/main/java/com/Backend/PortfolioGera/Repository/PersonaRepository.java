
package com.Backend.PortfolioGera.Repository;

import com.Backend.PortfolioGera.Model.persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends JpaRepository <persona, Long>{
    
    
    
}

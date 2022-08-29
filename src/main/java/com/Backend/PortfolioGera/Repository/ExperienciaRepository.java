
package com.Backend.PortfolioGera.Repository;

import com.Backend.PortfolioGera.Model.experiencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExperienciaRepository extends JpaRepository <experiencia, Long> {
    
}


package com.Backend.PortfolioGera.Repository;

import com.Backend.PortfolioGera.Model.educacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EducacionRepository extends JpaRepository <educacion, Long> {
    
}

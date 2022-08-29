
package com.Backend.PortfolioGera.Repository;

import com.Backend.PortfolioGera.Model.skills;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SkillsRepository extends JpaRepository <skills, Long> {
    
}

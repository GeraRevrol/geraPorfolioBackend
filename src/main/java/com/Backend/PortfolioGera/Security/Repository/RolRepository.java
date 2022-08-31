
package com.Backend.PortfolioGera.Security.Repository;

import com.Backend.PortfolioGera.Security.Entity.Rol;
import com.Backend.PortfolioGera.Security.Enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolRepository extends JpaRepository<Rol, Integer>{
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
}

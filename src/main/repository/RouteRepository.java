import org.springframework.data.jpa.repository.JpaRepository;

import com.morris.bikeroutespring.entity.RouteEntity;

public interface RouteRepository extends JpaRepository<RouteEntity, String>{
    
}

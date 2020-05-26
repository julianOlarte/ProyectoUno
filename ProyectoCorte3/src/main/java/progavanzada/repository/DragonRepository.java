package progavanzada.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import progavanzada.model.Dragon;

@Repository
public interface DragonRepository extends JpaRepository<Dragon, Integer> {

	Dragon findById(int id) ;
	
}


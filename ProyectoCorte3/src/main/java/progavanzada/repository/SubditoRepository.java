package progavanzada.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import progavanzada.model.Dragon;
import progavanzada.model.Subdito;


@Repository
public interface SubditoRepository extends JpaRepository<Subdito, Integer> {

	Subdito findById(int id) ;
	
	
}

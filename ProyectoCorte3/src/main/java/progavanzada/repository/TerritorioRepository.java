package progavanzada.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import progavanzada.model.Territorio;

public interface TerritorioRepository extends JpaRepository<Territorio, Integer> {

	Territorio findById(int id ) ;
	
}

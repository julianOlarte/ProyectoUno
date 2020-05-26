package progavanzada.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import progavanzada.model.Guerrero;

@Repository
public interface GuerreroRepository extends JpaRepository<Guerrero, Integer> {

	Guerrero findById(int id) ;
}

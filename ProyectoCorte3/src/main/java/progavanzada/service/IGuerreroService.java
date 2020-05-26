package progavanzada.service;

import java.util.List;

import progavanzada.model.Guerrero;

public interface IGuerreroService {

	List<Guerrero> listarGuerreros () ;
	Guerrero encontrarPorId(int id ) ;
	
}

package progavanzada.service;

import java.util.List;

import progavanzada.model.Subdito;



public interface ISubditoService {

	List<Subdito> listarSubditos () ;
	Subdito encontrarPorId(int id ) ;
	
}

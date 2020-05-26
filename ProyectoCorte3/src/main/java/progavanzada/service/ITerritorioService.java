package progavanzada.service;

import java.util.List;

import progavanzada.model.Territorio;

public interface ITerritorioService {

	List<Territorio> listarTerritorios () ;
	Territorio encontrarPorId(int id ) ;
	
}

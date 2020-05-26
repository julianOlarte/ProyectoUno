package progavanzada.service;

import java.util.List;

import progavanzada.model.Amante;

public interface IAmanteService {

	List<Amante> listarAmantes () ;
	Amante encontrarPorId(int id ) ;
	void guardar (Amante amante) ;
}

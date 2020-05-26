package progavanzada.service;

import java.util.List;

import progavanzada.model.Dragon;

public interface IDragonService {

	List<Dragon> listarDragones () ;
	Dragon encontrarPorId(int id ) ;
}

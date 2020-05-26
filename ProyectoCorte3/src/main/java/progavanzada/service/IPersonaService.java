package progavanzada.service;

import java.util.List;

import progavanzada.model.Persona;

public interface IPersonaService {
	List<Persona> listarpersonas();
	Persona encontrarporId(int id);
	List<Persona> listarporlugar(String lugar);
	void eliminar(int id ); 
}

package progavanzada.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import progavanzada.model.Persona;
import progavanzada.repository.PersonaRepository;

@Service
public class PersonaService implements IPersonaService {
	@Autowired
	PersonaRepository perso;
	public List<Persona> listarpersonas() {
		// TODO Auto-generated method stub
		return perso.findAll();
	}

	public Persona encontrarporId(int id) {
		// TODO Auto-generated method stub
		return perso.findById(id);
	}

	public List<Persona> listarporlugar(String lugar) {
		// TODO Auto-generated method stub
		return perso.findByLugar(lugar);
	}

	@Override
	public void eliminar(int id) {
		// TODO Auto-generated method stub
		
		perso.deleteById(id);
	}

}

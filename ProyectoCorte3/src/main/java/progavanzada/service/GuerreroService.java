package progavanzada.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import progavanzada.model.Guerrero;
import progavanzada.repository.GuerreroRepository;;

@Service
public class GuerreroService implements IGuerreroService {

	
	@Autowired
	GuerreroRepository guerreros ;
	
	@Override
	public List<Guerrero> listarGuerreros() {
		// TODO Auto-generated method stub
		return guerreros.findAll();
	}

	@Override
	public Guerrero encontrarPorId(int id) {
		// TODO Auto-generated method stub
		return guerreros.findById(id);
	}

}

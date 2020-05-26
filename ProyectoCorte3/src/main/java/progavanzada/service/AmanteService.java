package progavanzada.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import progavanzada.model.Amante;
import progavanzada.repository.AmanteRepository; 

@Service
public class AmanteService implements IAmanteService {

	@Autowired
	AmanteRepository amantes ;
	
	@Override
	public List<Amante> listarAmantes() {
		// TODO Auto-generated method stub
		return amantes.findAll();
	}

	@Override
	public Amante encontrarPorId(int id) {
		// TODO Auto-generated method stub
		return amantes.findById(id);
	}

	@Override
	public void guardar(Amante amante) {
		// TODO Auto-generated method stub
		amantes.save(amante) ;
		
	}
	

}

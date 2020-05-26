package progavanzada.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import progavanzada.model.Territorio;
import progavanzada.repository.TerritorioRepository;

@Service
public class TerritorioService implements ITerritorioService {

	
	@Autowired
	TerritorioRepository territorio;
	
	@Override
	public List<Territorio> listarTerritorios() {
		// TODO Auto-generated method stub
		return territorio.findAll();
	}

	@Override
	public Territorio encontrarPorId(int id) {
		// TODO Auto-generated method stub
		return territorio.findById(id);
	}

}

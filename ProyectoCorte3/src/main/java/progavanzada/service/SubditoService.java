package progavanzada.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import progavanzada.model.Subdito;
import progavanzada.repository.SubditoRepository;


@Service
public class SubditoService implements ISubditoService {

	@Autowired
	SubditoRepository subdito;
	
	@Override
	public List<Subdito> listarSubditos() {
		// TODO Auto-generated method stub
		return subdito.findAll();
	}

	@Override
	public Subdito encontrarPorId(int id) {
		// TODO Auto-generated method stub
		return subdito.findById(id);
	}

}

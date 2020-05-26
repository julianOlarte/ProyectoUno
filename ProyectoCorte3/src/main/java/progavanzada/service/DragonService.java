package progavanzada.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import progavanzada.model.Dragon;
import progavanzada.repository.DragonRepository;;;

@Service
public class DragonService implements IDragonService {
	@Autowired
	DragonRepository dragon ;
	
	@Override
	public List<Dragon> listarDragones() {
		// TODO Auto-generated method stub
		return dragon.findAll();
	}

	@Override
	public Dragon encontrarPorId(int id) {
		// TODO Auto-generated method stub
		return dragon.findById(id);
	}

}

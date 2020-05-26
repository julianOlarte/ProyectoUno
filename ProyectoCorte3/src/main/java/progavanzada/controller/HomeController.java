package progavanzada.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import progavanzada.model.Amante;
import progavanzada.model.Dragon;
import progavanzada.model.Guerrero;
import progavanzada.model.Persona;
import progavanzada.model.Subdito;
import progavanzada.model.Territorio;
import progavanzada.service.IAmanteService;
import progavanzada.service.IDragonService;
import progavanzada.service.IGuerreroService;
import progavanzada.service.IPersonaService;
import progavanzada.service.ISubditoService;
import progavanzada.service.ITerritorioService;

//Julian Olarte 


@Controller
public class HomeController {
	@Autowired
	private IPersonaService personas;

	@Autowired
	private IDragonService dragones;
	
	@Autowired
	private IAmanteService amantes;
	
	@Autowired
	private IGuerreroService guerreros;
	
	@Autowired
	private ISubditoService subditos;
	
	@Autowired
	private ITerritorioService territorios;
	

	@RequestMapping(value= "/home", method=RequestMethod.GET)
	public String HomePage(Model model) {
		List<Persona> pers=personas.listarpersonas();
		List<Dragon> dragons = dragones.listarDragones() ;
		List<Guerrero> guerrs = guerreros.listarGuerreros();
		List<Subdito> subs = subditos.listarSubditos() ;
		
		
		model.addAttribute("pers",pers);
		model.addAttribute("dragons",dragons);
		model.addAttribute("guerrs",guerrs);
		model.addAttribute("subs",subs);
		
		return "home";

	}


	@RequestMapping(value="/", method=RequestMethod.GET)
	public String Principal(Model model) {
		List<Persona> pers=personas.listarpersonas();
		List<Dragon> dragons = dragones.listarDragones() ;
		List<Guerrero> guerrs = guerreros.listarGuerreros();
		List<Subdito> subs = subditos.listarSubditos() ;
		
		
		model.addAttribute("pers",pers);
		model.addAttribute("dragons",dragons);
		model.addAttribute("guerrs",guerrs);
		model.addAttribute("subs",subs);
		
		return "home";

	}



	@RequestMapping(value="prueba/{id}" , method=RequestMethod.GET)
	public String Comprobar(@PathVariable("id") int id,Model model) {

		String estu=personas.encontrarporId(id).getClaseSocial();
		

		Persona perso=personas.encontrarporId(id) ;

		model.addAttribute("perso",perso);

		if (estu.equals("realeza")) {

			int valorP = (int) (Math.random()*9);

			if (valorP==1) {	
				Amante a = new Amante (id, estu , "Digno") ;
				amantes.guardar(a);
				
				return "redirect:/home";
			}
			else {

				personas.eliminar(id);
				List<Persona> estudiantes=personas.listarpersonas();

				Amante a = new Amante (id, estu , "No digno") ;
				amantes.guardar(a);
				model.addAttribute("estudiantes",estudiantes);
				return "redirect:/home";		
			}		
		}
		else {

			personas.eliminar(id);
			List<Persona> estudiantes=personas.listarpersonas();
			
			
			Amante a = new Amante (id, estu , "Ejecutado") ;
			amantes.guardar(a);
			
			model.addAttribute("estudiantes",estudiantes);
			
		
			return "redirect:/home" ;
			
			
		}
	}
	
	
	
	


	@RequestMapping(value= "/listaAmantes", method=RequestMethod.GET)
	public String amante(Model model) {
		List<Amante> amans = amantes.listarAmantes();
		
		model.addAttribute("amans",amans);
		
		return "listaAmantes";

	}

	
	@RequestMapping(value= "/conquista", method=RequestMethod.GET)
	public String territorio(Model model) {
		List<Territorio> terrs = territorios.listarTerritorios();
		
		model.addAttribute("terrs",terrs);
		
		return "conquista";

	}












}

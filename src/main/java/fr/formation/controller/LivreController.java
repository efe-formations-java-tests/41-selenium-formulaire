package fr.formation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import fr.formation.bll.LivreManager;
import fr.formation.model.Livre;

@Controller
public class LivreController {

	@Autowired
	LivreManager lm;
	
	@GetMapping("/ajout")
	public String appelAjout() {
		return "ajout";
	}

	
	@PostMapping("/ajout")
	public ModelAndView appelAjout(Livre l) {
		System.out.println(l);
		lm.ajouterLivre(l);
		return appelListe();
	}

	@GetMapping("/liste")
	public ModelAndView appelListe() {
		return new ModelAndView("liste", "listeL", lm.listeLivres());
	}
	
	
	
	@GetMapping("/suppr")
	public ModelAndView appelAjout(int id) {
		lm.supprimerLivre(id);
		return appelListe();
	}

}

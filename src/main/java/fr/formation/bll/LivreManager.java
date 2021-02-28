package fr.formation.bll;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.formation.dal.LivreDao;
import fr.formation.model.Livre;

@Service
public class LivreManager {

	@Autowired
	LivreDao lDao;
	
	public List<Livre> listeLivres(){
		return lDao.findAll();
	}
	
	public void ajouterLivre(Livre l){
		if (l != null && l.getAuteur() != null & l.getTitre() != null && l.getAuteur().trim().length() > 0 && l.getTitre().trim().length() > 0) {
			lDao.save(l);
		}
	}

	public void supprimerLivre(int id) {
		lDao.deleteById(id);
		
	}
}

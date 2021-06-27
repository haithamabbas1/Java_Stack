package Dojosandninja.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import Dojosandninja.models.dojos.Dojo;
import Dojosandninja.models.ninjas.Ninja;
import Dojosandninja.repositories.DojoRepo;
import Dojosandninja.repositories.NinjaRepo;

@Service
public class DojoNinjaServ {
	private final DojoRepo dojoRepo;
	private final NinjaRepo ninjaRepo;
	
	public DojoNinjaServ(DojoRepo dojoRepo, NinjaRepo ninjaRepo) {
		this.dojoRepo = dojoRepo;
		this.ninjaRepo = ninjaRepo;
	}

	public void addDojo(Dojo dojo) {
		dojoRepo.save(dojo);
	}
	
	public List<Dojo> getAllDojos() {
		return (List<Dojo>) dojoRepo.findAll();
	}
	
	public Dojo singleDojo(Long id) {
		Optional<Dojo> dojo = dojoRepo.findById(id);
		if(dojo.isPresent()) {
			return dojo.get();
		}
		else {
			return null;
		}
	}
	
	public void addNinja(Ninja ninja) {
		ninjaRepo.save(ninja);
	}
}
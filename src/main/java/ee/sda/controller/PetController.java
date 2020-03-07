package ee.sda.controller;

import ee.sda.dto.PetDTO;
import ee.sda.services.PetService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//petclinic.com/pet
@RestController("pet")
@RequestMapping(path = "pet")
public class PetController {

	private PetService petService;

	public PetController() {
		this.petService = new PetService();
	}

//POST -> petclinic.com/pet
	@PostMapping
	public PetDTO createPet(@RequestBody PetDTO petDTO){
		return petService.createPet(petDTO.getPetName(), petDTO.getOwnerName(), petDTO.getSpecies(),petDTO.getDob());
	}

}

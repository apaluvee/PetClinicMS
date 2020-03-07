package ee.sda.controller;

import ee.sda.dto.PetDTO;
import ee.sda.services.PetService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PetController {

	private PetService petService;

	public PetController() {
		this.petService = new PetService();
	}


	public PetDTO createPet(@RequestBody PetDTO petDTO){
		return petService.
	}

}

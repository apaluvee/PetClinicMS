package ee.sda.dto;

import com.google.gson.Gson;
import ee.sda.entities.Pet;

import java.time.LocalDate;

public class PetDTO {

    String petName;
    String ownerName;
    String species;
    LocalDate dob;


   public PetDTO(Pet pet) {
       this.petName = pet.getPetName();
       this.ownerName = pet.getOwnerName();
       this.species = pet.getSpecies();
       this.dob = pet.getDob();
   }

    public String getJson() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }


}

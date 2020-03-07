package ee.sda.dto;

import com.google.gson.Gson;
import ee.sda.entities.Pet;

import java.time.LocalDate;

public class PetDTO extends BaseDTO {

    int id;
    String petName;
    String ownerName;
    String species;
    LocalDate dob;

    public PetDTO() {
    }

    public PetDTO(int id) {
        this.id = id;
    }

    public PetDTO(int id, String petName) {
        this.id = id;
        this.petName = petName;
    }

    public PetDTO(Pet pet) {
        this.id = pet.getId();
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

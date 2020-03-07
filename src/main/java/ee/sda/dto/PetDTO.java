package ee.sda.dto;

import ee.sda.entities.Pet;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Getter
@Setter
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


}

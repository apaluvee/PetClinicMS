package ee.sda.services;

import ee.sda.dao.PetDAO;
import ee.sda.dto.PetDTO;
import ee.sda.entities.Pet;

import java.time.LocalDate;

public class ConsultationService {





}

/*public class PetService {

    PetDAO petDAO = new PetDAO();

    public PetDTO createPet(String petName, String ownerName, String species, LocalDate dob){
        if (petName ==  null || petName.isEmpty()){
            //return error
            return createError("Pet name is required");
        }
        if (ownerName ==  null || ownerName.isEmpty()){
            return createError("Owner's name is required");
        }

        if (species ==  null || species.isEmpty()){
            //return error

            return createError("Species is required");
        }

        if (dob == null || dob.isAfter(LocalDate.now())){
            return createError("Date of birth is required and can't be after this year");
        }

        Pet pet = petDAO.createPet(species,petName,ownerName,dob);
        //{status: true, message: "Operation successful", id: 1}
        return new PetDTO(pet.getId());
    }

    public PetDTO createError(String message){
        PetDTO petDTO = new PetDTO();
        petDTO.setMessage(message);
        petDTO.setStatus(false);
        return petDTO;
    }

}*/

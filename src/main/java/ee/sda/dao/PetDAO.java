package ee.sda.dao;

import ee.sda.entities.Pet;

public class PetDAO extends AbstractDAO<Pet, String> {

    public PetDAO() {
        super(Pet.class);
    }

    public Pet createPet(String name, String ownerName) {
        return save(new Pet(name, ownerName));
    }


}

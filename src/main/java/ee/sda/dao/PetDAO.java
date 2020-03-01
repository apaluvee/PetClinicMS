package ee.sda.dao;

import ee.sda.entities.Pet;

public class PetDAO extends AbstractDAO<Pet, String> {

    public PetDAO() {
        super(Pet.class);
    }


}

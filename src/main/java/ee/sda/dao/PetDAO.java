package ee.sda.dao;

import ee.sda.Entities.Pet;

public class PetDAO extends AbstractDAO<Pet, String> {

    public PetDAO() {
        super(Pet.class);
    }


}

package ee.sda.dao;

import ee.sda.entities.Veterinarian;

public class VeterinarianDAO extends AbstractDAO<Veterinarian, Integer> {

    public VeterinarianDAO() {
        super(Veterinarian.class);
    }

}

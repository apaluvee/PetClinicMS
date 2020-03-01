package ee.sda.DAO;

import ee.sda.Entities.Veterinarian;

public class VeterinarianDAO extends AbstractDAO<Veterinarian, Integer> {

    public VeterinarianDAO() {
        super(Veterinarian.class);
    }

}

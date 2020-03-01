package ee.sda.dao;

import ee.sda.entities.Veterinarian;

public class VeterinarianDAO extends AbstractDAO<Veterinarian, Integer> {

    public VeterinarianDAO() {
        super(Veterinarian.class);
    }

    public Veterinarian createVeterinarian(String first_name, String last_name, String address, String speciality, String email, String phone) {
        return save(new Veterinarian(first_name, last_name, address, speciality, email, phone));
    }

    public void updateVeterinarian(int id, String first_name, String last_name, String address, String speciality, String email, String phone) {
        Veterinarian veterinarian = find(id);
    }



}

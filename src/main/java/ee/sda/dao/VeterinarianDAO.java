package ee.sda.dao;

import ee.sda.entities.Pet;
import ee.sda.entities.Veterinarian;

import java.time.LocalDate;
import java.util.ArrayList;

public class VeterinarianDAO extends AbstractDAO<Veterinarian, Integer> {

    public VeterinarianDAO() {
        super(Veterinarian.class);
    }

    public Veterinarian createVet(String first_name, String last_name, String address, String speciality, String email, String phone) {
        return save(new Veterinarian(first_name, last_name, address, speciality, email, phone));
    }

    public Veterinarian updateVet(int id, String first_name, String last_name, String address, String speciality, String email, String phone) {
        Veterinarian vet = find(id);
        vet.setFirst_name(first_name);
        vet.setLast_name(last_name);
        vet.setAddress(address);
        vet.setSpeciality(speciality);
        vet.setEmail(email);
        vet.setPhone(phone);
        update(vet);
        return vet;
    }

    public Veterinarian findVet(int id) {
        Veterinarian vet = find(id);
        return vet;
    }

    public Veterinarian deleteVet(int id) {
        Veterinarian vet = find(id);
        delete(vet);
        return vet;
    }

    public ArrayList<Veterinarian> findALLVets() {
        ArrayList<Veterinarian> allVets = findAll();
        return allVets;
    }

}
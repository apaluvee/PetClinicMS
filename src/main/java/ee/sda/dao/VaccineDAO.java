package ee.sda.dao;

import ee.sda.entities.Pet;
import ee.sda.entities.Vaccine;

import java.time.LocalDate;
import java.util.ArrayList;

public class VaccineDAO extends AbstractDAO<Vaccine, Integer> {

    public VaccineDAO() {
        super(Vaccine.class);
    }


    public Vaccine createVaccine(String vaccine_name, String vaccine_description) {
        return save(new Vaccine(vaccine_name, vaccine_description));
    }

    public Vaccine updateVaccine(int vaccine_id, String vaccine_name, String vaccine_description) {
        Vaccine vaccine = find(vaccine_id);
        vaccine.setVaccine_name(vaccine_name);
        vaccine.setVaccine_description(vaccine_description);
        update(vaccine);
        return vaccine;
    }

    public Vaccine findVaccine(int vaccine_id) {
        Vaccine vaccine = find(vaccine_id);
        return vaccine;
    }

    public Vaccine deleteVaccine(int vaccine_id) {
        Vaccine vaccine = find(vaccine_id);
        delete(vaccine);
        return vaccine;
    }

    public ArrayList<Vaccine> findALLVaccines() {
        ArrayList<Vaccine> allVaccines = findAll();
        return allVaccines;
    }

}
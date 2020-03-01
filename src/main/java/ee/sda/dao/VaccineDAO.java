package ee.sda.dao;

import ee.sda.db.DatabaseUtil;
import ee.sda.entities.Pet;
import ee.sda.entities.Vaccine;
import ee.sda.entities.Veterinarian;
import org.hibernate.Session;

import java.util.List;

public class VaccineDAO extends AbstractDAO<Vaccine, Integer> {

    public VaccineDAO() {
        super(Vaccine.class);
    }

    public Vaccine CreateVaccine(String VaccineName, String VaccineDescription){
        return save(new Vaccine(VaccineName, VaccineDescription));
    }



    public List<Vaccine> FindVaccine(){
        return findAll();
    }


}

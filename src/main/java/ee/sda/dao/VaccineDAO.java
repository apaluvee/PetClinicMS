package ee.sda.dao;

import ee.sda.entities.Vaccine;
import org.hibernate.sql.Update;

import java.util.List;

public class VaccineDAO extends AbstractDAO<Vaccine, Integer> {

    private Object Vaccine;

    public VaccineDAO() {
        super(Vaccine.class);
    }

    public Vaccine CreateVaccine(String VaccineName, String VaccineDescription){
        return save(new Vaccine(VaccineName, VaccineDescription));
    }



    public void UpdateVaccine(int VaccineId, String VaccineName, String VaccineDescription) {
        Vaccine vaccine= find(VaccineId);
        vaccine.setId(VaccineId);
        vaccine.setVaccine_description(VaccineDescription);
        vaccine.setVaccine_name(VaccineName);

        update( vaccine);
    }


    public void DeleteVaccine(int VaccineId){
        Vaccine vaccine =find (VaccineId);
        delete( vaccine);
    }

    public Vaccine FindVaccine(int VaccineId){
        Vaccine vaccine=find(VaccineId);
        return vaccine;
    }


}

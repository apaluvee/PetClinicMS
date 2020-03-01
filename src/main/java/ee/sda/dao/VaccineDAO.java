package ee.sda.dao;

import ee.sda.entities.Vaccine;

public class VaccineDAO extends AbstractDAO<Vaccine, Integer> {

    public VaccineDAO() {
        super(Vaccine.class);
    }


}

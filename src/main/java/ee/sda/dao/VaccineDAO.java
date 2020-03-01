package ee.sda.dao;

import ee.sda.entities.Vaccine;

public class VaccineDAO extends AbstractDAO<Vaccine, String> {

    public VaccineDAO() {
        super(Vaccine.class);
    }


}

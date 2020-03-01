package ee.sda.dao;

import ee.sda.Entities.Vaccine;

public class VaccineDAO extends AbstractDAO<Vaccine, String> {

    public VaccineDAO() {
        super(Vaccine.class);
    }


}

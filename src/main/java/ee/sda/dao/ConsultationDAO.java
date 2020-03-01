package ee.sda.dao;

import ee.sda.entities.Consultation;

public class ConsultationDAO extends AbstractDAO<Consultation, String > {
    public ConsultationDAO() {
        super(Consultation.class);
    }


}

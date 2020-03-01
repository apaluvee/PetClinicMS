package ee.sda.dao;

import ee.sda.entities.Consultation;
import ee.sda.entities.Pet;

import java.time.LocalDate;

public class ConsultationDAO extends AbstractDAO<Consultation, Integer > {

    public ConsultationDAO() {
        super(Consultation.class);
    }



}

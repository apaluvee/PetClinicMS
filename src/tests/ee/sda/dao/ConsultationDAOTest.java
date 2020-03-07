package ee.sda.dao;

import ee.sda.entities.Consultation;
import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ConsultationDAOTest {
    ConsultationDAO consultationDao;
    Consultation consultation;
    LocalDate testDate = LocalDate.of(2020, 3, 13);

    @BeforeEach
    public void init(){
        consultationDao = new ConsultationDAO();
    }

    @Test
    public void testCreateConsultation() {
      consultation = consultationDao.createConsultation(testDate,  "This dog... ", 3, 3);
     assertNotNull(consultation);
    }

    @Test
    public void testFindConsultation(){
        List<Consultation> foundConsultations = consultationDao.findALLConsults();
        assertNotEquals(0, foundConsultations.size());
        Consultation consultation = foundConsultations.get(0);
        assertEquals("This cat needs rabies vaccine.", consultation.getConsultDescription());
    }
/*
    @Test
    void updateConsultation() {
    }

    @Test
    void findConsultation() {
    }

    @Test
    void deleteConsultation() {
    }

    @Test
    void findALLConsults() {
    }*/
}
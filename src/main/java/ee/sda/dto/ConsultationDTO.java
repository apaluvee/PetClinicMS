package ee.sda.dto;

import ee.sda.entities.Consultation;

import java.time.LocalDate;
import java.util.List;

public class ConsultationDTO {

    int consult_id;
    int pet_id;
    int vet_id;
    LocalDate consultDate;
    String consultDescription;

    public ConsultationDTO(int consult_id, int pet_id, int vet_id, LocalDate consultDate, String consultDescription) {
        this.consult_id = consult_id;
        this.pet_id = pet_id;
        this.vet_id = vet_id;
        this.consultDate = consultDate;
        this.consultDescription = consultDescription;
    }

}

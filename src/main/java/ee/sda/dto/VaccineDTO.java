package ee.sda.dto;

public class VaccineDTO {
    private int VaccineId;
    private String VaccineName, VaccineDescription;

    public VaccineDTO(int vaccineId, String vaccineName, String vaccineDescription) {
        VaccineId = vaccineId;
        VaccineName = vaccineName;
        VaccineDescription = vaccineDescription;
    }
}

package ee.sda;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "consultation")

public class Consultation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="consult_id")
    private int id;

    @Column(name="consult_date")
    private LocalDate consultDate;

    @Column(name="consult_description")
    private String consultDescription;

    @OneToOne
    private Pet pet;

    @OneToOne
    private Veterinarian veterinarian;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getConsultDate() {
        return consultDate;
    }

    public void setConsultDate(LocalDate consultDate) {
        this.consultDate = consultDate;
    }

    public String getConsultDescription() {
        return consultDescription;
    }

    public void setConsultDescription(String consultDescription) {
        this.consultDescription = consultDescription;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Veterinarian getVeterinarian() {
        return veterinarian;
    }

    public void setVeterinarian(Veterinarian veterinarian) {
        this.veterinarian = veterinarian;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Consultation that = (Consultation) o;
        return id == that.id &&
                Objects.equals(consultDate, that.consultDate) &&
                Objects.equals(consultDescription, that.consultDescription) &&
                Objects.equals(pet, that.pet) &&
                Objects.equals(veterinarian, that.veterinarian);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, consultDate, consultDescription, pet, veterinarian);
    }

    @Override
    public String toString() {
        return "Consultation{" +
                "id=" + id +
                ", consultDate=" + consultDate +
                ", consultDescription='" + consultDescription + '\'' +
                ", pet=" + pet +
                ", veterinarian=" + veterinarian +
                '}';
    }
}

package ee.sda;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "pet_vaccine")

public class Pet_Vaccine {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pet_id")
    private int pet_id;

    @Column(name = "vaccine_id")
    private int vaccine_id;

    @Column(name = "consult_id")
    private int consult_id;

    public int getPet_id() {
        return pet_id;
    }

    public void setPet_id(int pet_id) {
        this.pet_id = pet_id;
    }

    public int getVaccine_id() {
        return vaccine_id;
    }

    public void setVaccine_id(int vaccine_id) {
        this.vaccine_id = vaccine_id;
    }

    public int getConsult_id() {
        return consult_id;
    }

    public void setConsult_id(int consult_id) {
        this.consult_id = consult_id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pet_Vaccine that = (Pet_Vaccine) o;
        return getPet_id() == that.getPet_id() &&
                getVaccine_id() == that.getVaccine_id() &&
                getConsult_id() == that.getConsult_id();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPet_id(), getVaccine_id(), getConsult_id());
    }

    @Override
    public String toString() {
        return "Pet_Vaccine{" +
                "pet_id=" + pet_id +
                ", vaccine_id=" + vaccine_id +
                ", consult_id=" + consult_id +
                '}';
    }

}

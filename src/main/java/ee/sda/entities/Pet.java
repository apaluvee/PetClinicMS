package ee.sda.entities;

import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "pet")
@ToString
public class Pet {
	@Id
	@Column(name = "pet_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;

	@Column(name = "pet_name")
	String petName;

	@Column(name = "owner_name")
	String ownerName;

	String species;

	LocalDate dob;
/*

    @OneToMany
    @JoinColumn(name = "pet_id")
     List<Consultation> consultations = new ArrayList<>();
*/

	/*@ManyToMany
	@JoinTable(name = "pet_vaccine", joinColumns = {@JoinColumn(name = "pet_id")}, inverseJoinColumns = {@JoinColumn(name = "vaccine_id")})
	List<Vaccine> vaccines = new ArrayList<>();*/


	public Pet(String petName, String ownerName, String species, LocalDate dob) {
		this.petName = petName;
		this.ownerName = ownerName;
		this.species = species;
		this.dob = dob;
	}

	public Pet() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPetName() {
		return petName;
	}

	public void setPetName(String petName) {
		this.petName = petName;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	/*  public List<Consultation> getConsultations() {
		  return consultations;
	  }

	  public void setConsultations(List<Consultation> consultations) {
		  this.consultations = consultations;
	  }
  */
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Pet pet = (Pet) o;
		return id == pet.id &&
				Objects.equals(petName, pet.petName) &&
				Objects.equals(ownerName, pet.ownerName) &&
				Objects.equals(species, pet.species) &&
				Objects.equals(dob, pet.dob);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, petName, ownerName, species, dob);
	}
/*

    @Override
    public String toString() {
        return "Pet{" +
                "id=" + id +
                ", petName='" + petName + '\'' +
                ", ownerName='" + ownerName + '\'' +
                ", species='" + species + '\'' +
                ", dob=" + dob +
                ", consultations=" + consultations +
                ", vaccines=" + vaccines +
                '}';
    }*/
}
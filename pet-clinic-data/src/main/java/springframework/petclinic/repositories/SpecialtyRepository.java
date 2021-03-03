package springframework.petclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import springframework.petclinic.model.Speciality;

public interface SpecialtyRepository extends CrudRepository<Speciality, Long> {
}

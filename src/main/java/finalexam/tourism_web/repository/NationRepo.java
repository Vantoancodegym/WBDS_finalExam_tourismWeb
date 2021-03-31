package finalexam.tourism_web.repository;

import finalexam.tourism_web.model.Nation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NationRepo extends CrudRepository<Nation,Long> {
}

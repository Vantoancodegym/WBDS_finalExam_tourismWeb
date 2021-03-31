package finalexam.tourism_web.repository;

import finalexam.tourism_web.model.City;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepo extends CrudRepository<City,Long> {
}

package finalexam.tourism_web.repository;

import finalexam.tourism_web.model.City;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CityRepo extends CrudRepository<City,Long> {
    @Query(value = "select * from city where name like ?", nativeQuery = true)
    List<City> findLikeName(String name);
}

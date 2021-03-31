package finalexam.tourism_web.service.cityService;

import finalexam.tourism_web.model.City;
import finalexam.tourism_web.repository.CityRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityService implements ICityService {
    @Autowired
    private CityRepo cityRepo;
    @Override
    public List<City> findAll() {
        return (List<City>) cityRepo.findAll();
    }

    @Override
    public City findById(Long id) {
        return cityRepo.findById(id).get();
    }

    @Override
    public City save(City city) {
        return cityRepo.save(city);
    }

    @Override
    public void delete(Long id) {
        cityRepo.deleteById(id);
    }

    @Override
    public List<City> findLikeName(String name) {
        name="%"+name+"%";
        return cityRepo.findLikeName(name);
    }
}

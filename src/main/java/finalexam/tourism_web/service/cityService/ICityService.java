package finalexam.tourism_web.service.cityService;

import finalexam.tourism_web.model.City;
import finalexam.tourism_web.service.Iservice;

import java.util.List;

public interface ICityService extends Iservice<City> {
    List<City> findLikeName(String name);
}

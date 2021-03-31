package finalexam.tourism_web.controller;

import finalexam.tourism_web.model.City;
import finalexam.tourism_web.service.cityService.ICityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RestControllerTourism {
    @Autowired
    private ICityService cityService;
    @GetMapping ("/tourism/delete/{id}")
    public ResponseEntity<?> deleteCity(@PathVariable Long id){
        cityService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @GetMapping ("/tourism/list")
    public ResponseEntity<List<City>> getListCity(){
        List<City> cites = cityService.findAll();
        return new ResponseEntity<>(cites, HttpStatus.OK);
    }
}

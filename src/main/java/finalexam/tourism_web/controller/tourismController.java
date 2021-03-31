package finalexam.tourism_web.controller;

import finalexam.tourism_web.model.City;
import finalexam.tourism_web.model.Nation;
import finalexam.tourism_web.service.cityService.ICityService;
import finalexam.tourism_web.service.naitonService.INationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import sun.awt.ModalExclude;

import java.util.List;

@Controller
@RequestMapping("/tourism")
public class tourismController {
    @Autowired
    private INationService nationService;
    @Autowired
    private ICityService cityService;
    @ModelAttribute("nations")
    public List<Nation> getNations(){
        return nationService.findAll();
    }
    @GetMapping("")
    public ModelAndView showAll(){
        return new ModelAndView("home","cites", cityService.findAll());
    }
    @GetMapping("create")
    public ModelAndView showFormCreate(){
        return new ModelAndView("create","city",new City());
    }
    @PostMapping("create")
    public ModelAndView create(@ModelAttribute City city){
        cityService.save(city);
        return new ModelAndView("redirect:/tourism");
    }
    @GetMapping("edit/{id}")
    public ModelAndView showFormEdit(@PathVariable Long id){
        City city=cityService.findById(id);
        return new ModelAndView("create","city",city);
    }
    @PostMapping("edit/{id}")
    public ModelAndView edit(@ModelAttribute City city){
        cityService.save(city);
        return new ModelAndView("redirect:/tourism");
    }
    @GetMapping("detail/{id}")
    public ModelAndView showDetail(@PathVariable Long id){
        City city=cityService.findById(id);

    }


}

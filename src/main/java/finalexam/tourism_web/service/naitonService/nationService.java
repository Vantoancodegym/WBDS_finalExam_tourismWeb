package finalexam.tourism_web.service.naitonService;

import finalexam.tourism_web.model.Nation;
import finalexam.tourism_web.repository.NationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class nationService implements INationService{
    @Autowired
    private NationRepo nationRepo;
    @Override
    public List<Nation> findAll() {
        return (List<Nation>)nationRepo.findAll() ;
    }

    @Override
    public Nation findById(Long id) {
        return null;
    }

    @Override
    public Nation save(Nation nation) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}

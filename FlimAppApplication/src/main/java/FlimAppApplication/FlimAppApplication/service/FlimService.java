package FlimAppApplication.FlimAppApplication.service;

import FlimAppApplication.FlimAppApplication.model.Flim;
import FlimAppApplication.FlimAppApplication.repository.FlimRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class FlimService {

    @Autowired
    private FlimRepository flimRepository;

    public Flim saveFlim(Flim flim) {
        return flimRepository.save(flim);
    }

    public Optional<Flim> findFlimByName(String name) {
        return flimRepository.findById(name);
    }

    public Flim updateFlim(String name, Flim flim) {
        if (flimRepository.existsById(name)) {
            flim.setName(name);
            return flimRepository.save(flim);
        } else {
            return null;
        }
    }

    public void deleteFlim(String name) {
        flimRepository.deleteById(name);
    }
}

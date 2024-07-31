package FlimAppApplication.FlimAppApplication.repository;

import FlimAppApplication.FlimAppApplication.model.Flim;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface FlimRepository {
    void deleteById(String name);

    Flim save(Flim flim);

    Optional<Flim> findById(String name);

    boolean existsById(String name);
}

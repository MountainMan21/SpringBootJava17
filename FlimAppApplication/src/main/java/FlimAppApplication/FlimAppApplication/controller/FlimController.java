package FlimAppApplication.FlimAppApplication.controller;

import FlimAppApplication.FlimAppApplication.model.Flim;
import FlimAppApplication.FlimAppApplication.service.FlimService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/flims")
public class FlimController {

    @Autowired
    private FlimService flimService;

    @PostMapping
    public ResponseEntity<Flim> createFlim(@RequestBody Flim flim) {
        return ResponseEntity.ok(flimService.saveFlim(flim));
    }

    @GetMapping("Flim/{name}")
    public ResponseEntity<Flim> getFlim(@PathVariable String name) {
        Optional<Flim> flim = flimService.findFlimByName(name);
        return flim.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PutMapping("Flim/{name}/Add")
    public ResponseEntity<Flim> updateFlim(@PathVariable String name, @RequestBody Flim flim) {
        Flim updatedFlim = flimService.updateFlim(name, flim);
        return updatedFlim != null ? ResponseEntity.ok(updatedFlim) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("Flim/{name}/delete")
    public ResponseEntity<Void> deleteFlim(@PathVariable String name) {
        flimService.deleteFlim(name);
        return ResponseEntity.noContent().build();
    }
}

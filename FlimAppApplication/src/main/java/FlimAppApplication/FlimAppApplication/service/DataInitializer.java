package FlimAppApplication.FlimAppApplication.service;

import FlimAppApplication.FlimAppApplication.model.Flim;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer implements CommandLineRunner {

    @Autowired
    private FlimService flimService;

    @Override
    public void run(String... args) throws Exception {
        // Add sample films
        flimService.saveFlim(new Flim("The Revenant", "A frontiersman on a quest for survival and revenge.", 2015));
        flimService.saveFlim(new Flim("Django Unchained", "A freed slave sets out to rescue his wife from a brutal plantation owner.", 2012));
        flimService.saveFlim(new Flim("Once Upon a Time in Hollywood", "A fading actor and his stunt double navigate Hollywood's changing landscape.", 2019));
    }
}

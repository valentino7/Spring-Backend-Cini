package sdcc2018.spring.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sdcc2018.spring.domain.SensorGUI;
import sdcc2018.spring.service.SemaphoreService;

@RestController
@RequestMapping(path = "/semaphore")
@CrossOrigin
public class SemaphoreRest {

    @Autowired
    private SemaphoreService semaphoreService;


    @RequestMapping(path = "", method = RequestMethod.POST)
    public ResponseEntity<SensorGUI> saveSemaphore(@RequestBody SensorGUI semaphore) {
        return new ResponseEntity<>(semaphoreService.createSemaphore(semaphore), HttpStatus.CREATED);
    }

    @RequestMapping(path = "", method = RequestMethod.GET)
    public ResponseEntity<SensorGUI> find(@RequestBody SensorGUI semaphore) {
        return new ResponseEntity<>(semaphoreService.createSemaphore(semaphore), HttpStatus.CREATED);
    }


}

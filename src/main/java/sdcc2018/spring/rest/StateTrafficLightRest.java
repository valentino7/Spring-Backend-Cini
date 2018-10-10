package sdcc2018.spring.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sdcc2018.spring.domain.StateTrafficLight;
import sdcc2018.spring.service.StateTrafficLightService;

import java.util.ArrayList;

@RestController
@RequestMapping(path = "/state")
@CrossOrigin
public class StateTrafficLightRest {


    @Autowired
    private StateTrafficLightService stateTrafficLightService;

    @RequestMapping(path = "/repair", method = RequestMethod.PUT)
    public ResponseEntity<StateTrafficLight> updateIntersection(@RequestBody StateTrafficLight stateTrafficLight) {
        return new ResponseEntity<>(stateTrafficLightService.repair(stateTrafficLight), HttpStatus.OK);
    }

    @RequestMapping(path = "/findAllBroken", method = RequestMethod.GET)
    public ResponseEntity<ArrayList<StateTrafficLight>> findAll() {
        return new ResponseEntity<>(stateTrafficLightService.findAll(), HttpStatus.OK);
    }

}

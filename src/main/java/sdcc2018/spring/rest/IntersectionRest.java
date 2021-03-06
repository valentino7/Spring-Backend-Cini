package sdcc2018.spring.rest;

import javafx.beans.binding.IntegerBinding;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sdcc2018.spring.domain.IntersectionGUI;
import sdcc2018.spring.service.IntersectionService;

import java.util.ArrayList;

@RestController
@RequestMapping(path = "/intersection")
@CrossOrigin
public class IntersectionRest {


    @Autowired
    private IntersectionService intersectionService;


    @RequestMapping(path = "/create", method = RequestMethod.POST)
    public ResponseEntity<IntersectionGUI> createIntersection(@RequestBody IntersectionGUI intersection) {
        return new ResponseEntity<>(intersectionService.createIntersection(intersection), HttpStatus.OK);
    }

    @RequestMapping(path = "/update", method = RequestMethod.PUT)
    public ResponseEntity<IntersectionGUI> updateIntersection(@RequestBody IntersectionGUI intersection) {
        return new ResponseEntity<>(intersectionService.updateIntersection(intersection), HttpStatus.OK);
    }

    @RequestMapping(path = "/findAll", method = RequestMethod.GET)
    public ResponseEntity<ArrayList<IntersectionGUI>> findAll() {
        return new ResponseEntity<>(intersectionService.findAll(), HttpStatus.OK);
    }


    @RequestMapping(path = "/findMaxId", method = RequestMethod.GET)
    public ResponseEntity<Integer> findMaxId() {
        return new ResponseEntity<>(intersectionService.findMaxId(), HttpStatus.OK);
    }


    @RequestMapping(path = "/findByID/{id}", method = RequestMethod.GET)
    public ResponseEntity<IntersectionGUI> findByIdIntersection(@PathVariable String id) {
        IntersectionGUI response = intersectionService.findByIdIntersection(id);
        return new ResponseEntity<>(response!= null ? HttpStatus.OK:  HttpStatus.NOT_FOUND);
    }

    @RequestMapping(path = "/deleteById/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Boolean> deleteIntersection(@PathVariable int id) {
        Boolean response = intersectionService.deleteIntersection(id);
        return new ResponseEntity<>(response, response ? HttpStatus.OK: HttpStatus.NOT_FOUND);
    }

}

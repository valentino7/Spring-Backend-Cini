package sdcc2018.spring.rest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sdcc2018.spring.domain.Median;
import sdcc2018.spring.service.MedianService;

import java.util.ArrayList;

@RestController
@RequestMapping(path = "/Median")
@CrossOrigin
public class MedianRest {

    @Autowired
    private MedianService medianService;


    @RequestMapping(path = "/findAll", method = RequestMethod.GET)
    public ResponseEntity<ArrayList<Median>> findAll() {
        return new ResponseEntity<>(medianService.findAll(), HttpStatus.OK);
    }

    @RequestMapping(path = "/findByIdIntersection/{id}", method = RequestMethod.GET)
    public ResponseEntity<Median> findbyIdIntersection(@PathVariable String id) {
        return new ResponseEntity<>(medianService.findRankByIdWindow(id), HttpStatus.OK);
    }
}

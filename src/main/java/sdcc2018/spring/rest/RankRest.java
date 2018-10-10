package sdcc2018.spring.rest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sdcc2018.spring.domain.Rank;
import sdcc2018.spring.service.RankService;

import java.util.ArrayList;


@RestController
@RequestMapping(path = "/Rank")
@CrossOrigin
public class RankRest {


    @Autowired
    private RankService rankService;


    @RequestMapping(path = "/findAll", method = RequestMethod.GET)
    public ResponseEntity<ArrayList<Rank>>findAll() {
        return new ResponseEntity<>(rankService.findAll(), HttpStatus.OK);
    }

    @RequestMapping(path = "/findByIdIntersection/{id}", method = RequestMethod.GET)
    public ResponseEntity<Rank> findbyIdIntersection(@PathVariable String id) {
        return new ResponseEntity<>(rankService.findRankByIdWindow(id), HttpStatus.OK);
    }

}

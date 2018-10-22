package sdcc2018.spring.rest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sdcc2018.spring.domain.Statistics;
import sdcc2018.spring.domain.StatisticsElement;
import sdcc2018.spring.service.StatisticsService;

@RestController
@RequestMapping(path = "/statistics")
@CrossOrigin
public class StatisticsRest {

    @Autowired
    private StatisticsService statisticsService;

    @RequestMapping(path = "/insertElement", method = RequestMethod.POST)
    public ResponseEntity<Statistics> createIntersection(@RequestBody StatisticsElement statisticsElement) {
        return new ResponseEntity<>(statisticsService.insertElement(statisticsElement), HttpStatus.OK);
    }
}

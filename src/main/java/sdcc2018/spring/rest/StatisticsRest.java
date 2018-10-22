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

    @RequestMapping(path = "/insertStatistics", method = RequestMethod.POST)
    public ResponseEntity<Statistics> InsertStatistics(@RequestBody Statistics statistics) {
        return new ResponseEntity<>(statisticsService.insertStatistics(statistics), HttpStatus.OK);
    }

    @RequestMapping(path = "/insertElement/{query}", method = RequestMethod.POST)
    public ResponseEntity<Statistics> InsertElement(@RequestBody StatisticsElement statisticsElement, @PathVariable int query) {
        return new ResponseEntity<>(statisticsService.insertElement(statisticsElement, query), HttpStatus.OK);
    }
}

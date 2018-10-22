package sdcc2018.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sdcc2018.spring.domain.Statistics;
import sdcc2018.spring.domain.StatisticsElement;
import sdcc2018.spring.repo.StatisticsRepo;

import java.util.List;

@Service
public class StatisticsService {

    @Autowired
    private StatisticsRepo statisticsRepo;

    public Statistics insertElement(StatisticsElement statisticsElement) {
        Statistics s = statisticsRepo.findAll().get(0);
        List<StatisticsElement> list = s.getList();
        list.add(statisticsElement);
        s.setList(list);
        return statisticsRepo.save(s);
    }
}

package sdcc2018.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sdcc2018.spring.domain.Statistics;
import sdcc2018.spring.domain.StatisticsElement;
import sdcc2018.spring.repo.StatisticsRepo;

import java.util.ArrayList;

@Service
public class StatisticsService {

    @Autowired
    private StatisticsRepo statisticsRepo;

    public Statistics insertElement(StatisticsElement statisticsElement, int query) {
        Statistics s = statisticsRepo.findByQuery(query);  // 0 -> query1, 1-> query2, etc...
        ArrayList<StatisticsElement> list = s.getStatisticsElementList();
        list.add(statisticsElement);
        s.setStatisticsElementList(list);
        return statisticsRepo.save(s);
    }

    public Statistics insertStatistics(Statistics statistics) {
        return statisticsRepo.save(statistics);
    }
}

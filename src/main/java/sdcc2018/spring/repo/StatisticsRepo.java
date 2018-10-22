package sdcc2018.spring.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import sdcc2018.spring.domain.Statistics;
import sdcc2018.spring.domain.StatisticsElement;

public interface StatisticsRepo extends MongoRepository<Statistics,String> {

    Statistics findByQuery(int q);
}

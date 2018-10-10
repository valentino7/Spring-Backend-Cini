package sdcc2018.spring.repo;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import sdcc2018.spring.domain.Median;

import java.util.ArrayList;

@Repository
public interface MedianRepo extends MongoRepository<Median, String> {

    ArrayList<Median> findAll();
    Median findMedianByIdWindow(String id);
}

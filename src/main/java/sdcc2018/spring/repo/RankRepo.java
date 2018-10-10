package sdcc2018.spring.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import sdcc2018.spring.domain.Rank;

import java.util.ArrayList;

@Repository
public interface RankRepo extends MongoRepository<Rank, String> {

    Rank findByid(String id);
    ArrayList<Rank> findAll();
    Rank findRankByIdWindow(String id);

}

package sdcc2018.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import sdcc2018.spring.domain.Rank;
import sdcc2018.spring.repo.RankRepo;

import java.util.ArrayList;

@Service
public class RankService {

    @Autowired
    private RankRepo rankRepo;

    @Transactional
    public ArrayList<Rank> findAll(){
        return rankRepo.findAll();
    }
    @Transactional
    public Rank findRankByIdWindow(String id){
        return rankRepo.findRankByIdWindow(id);

    }
}

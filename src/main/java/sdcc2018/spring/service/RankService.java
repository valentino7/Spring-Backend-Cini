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
    public Rank findAll(int choose){

        ArrayList<Rank> ranks = rankRepo.findAll();

        for(int i=0;i!=3;i++){
            if(choose==0) {
                if (ranks.get(i).getIdWindow().equals("15M")){
                    return ranks.get(i);
                }
            }
            else if(choose==1) {
                if (ranks.get(i).getIdWindow().equals("1H")){
                    return ranks.get(i);
                }
            }
            else {
                if (ranks.get(i).getIdWindow().equals("24H"))
                    return ranks.get(i);
            }
        }
        return null;
    }

    @Transactional
    public Rank findRankByIdWindow(String id){
        return rankRepo.findRankByIdWindow(id);

    }
}

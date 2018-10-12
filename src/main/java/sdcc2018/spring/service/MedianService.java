package sdcc2018.spring.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import sdcc2018.spring.domain.Median;
import sdcc2018.spring.repo.MedianRepo;

import java.util.ArrayList;

@Service
public class MedianService {

    @Autowired
    private MedianRepo medianRepo;

    @Transactional
    public Median findAll(int choose){

        ArrayList<Median> medians = medianRepo.findAll();

       for(int i=0;i!=3;i++){
           if(choose==0) {
               if (medians.get(i).getIdWindow().equals("15M"))
                   return medians.get(i);
           }
           else if(choose==1) {
               if (medians.get(i).getIdWindow().equals("1H"))
                   return medians.get(i);
           }
           else {
               if (medians.get(i).getIdWindow().equals("24H"))
                   return medians.get(i);
           }
       }
        return null;

    }

    @Transactional
    public Median findRankByIdWindow(String id){
        return medianRepo.findMedianByIdWindow(id);

    }
}

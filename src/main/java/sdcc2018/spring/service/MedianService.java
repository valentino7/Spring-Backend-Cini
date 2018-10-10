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
    public ArrayList<Median> findAll(){
        return medianRepo.findAll();
    }
    @Transactional
    public Median findRankByIdWindow(String id){
        return medianRepo.findMedianByIdWindow(id);

    }
}

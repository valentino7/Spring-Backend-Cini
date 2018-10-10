package sdcc2018.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import sdcc2018.spring.domain.IntersectionGUI;
import sdcc2018.spring.domain.StateTrafficLight;
import sdcc2018.spring.repo.IntersectionRepo;
import sdcc2018.spring.repo.StateTrafficLightRepo;


import java.util.ArrayList;

@Service
public class IntersectionService {


    @Autowired
    private IntersectionRepo intersectionRepo;

    @Autowired
    private StateTrafficLightRepo trafficLightRepo;

    @Transactional
    public IntersectionGUI createIntersection(IntersectionGUI intersection) {
       /* if(semaphoreRepo.saveAll(intersection.getSemaphoreList())==null)
            return null;*/
        StateTrafficLight trafficLight = new StateTrafficLight();
        for(int i=0;i!=4;i++){
            trafficLight.updateFields(i,intersection.getId(),new String[]{"OK","OK","OK"});
            trafficLightRepo.save(trafficLight);
        }

        return intersectionRepo.save(intersection);
    }

    @Transactional
    public boolean deleteIntersection(String id) {
        IntersectionGUI intersectionToDelete = intersectionRepo.findByid(id);
        if ( intersectionToDelete == null)
            return false;

        if(trafficLightRepo.findByIdIntersection(intersectionToDelete.getId())==null)
            return false;
        intersectionRepo.delete(intersectionToDelete);
        return true;
    }

    @Transactional
    public ArrayList<IntersectionGUI> findAll() {
        return intersectionRepo.findAll();
    }

    @Transactional
    public IntersectionGUI findByIdIntersection(String id) {
        IntersectionGUI intersectionGUI =intersectionRepo.findByid(id);
        return intersectionGUI;
    }

    @Transactional
    public IntersectionGUI updateIntersection(String id, IntersectionGUI intersection) {
        IntersectionGUI intersectionToUpdate = intersectionRepo.findByid(id);
        if (intersectionToUpdate == null )
            return null;

        intersectionToUpdate.updateIntersection(intersection);

        return intersectionRepo.save(intersectionToUpdate);
    }
}

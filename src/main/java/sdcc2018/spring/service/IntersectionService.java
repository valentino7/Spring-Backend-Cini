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
        int idIntersection = this.findMaxId();
        intersection.setIdIntersection(idIntersection+1);
        for(int i=0;i!=4;i++){
            StateTrafficLight trafficLight = new StateTrafficLight();
            trafficLight.updateFields(i,intersection.getIdIntersection(),new String[]{"OK","OK","OK"});
            trafficLightRepo.save(trafficLight);
        }
        return intersectionRepo.save(intersection);
    }

    @Transactional
    public boolean deleteIntersection(int id) {

        return ( (trafficLightRepo.deleteByIdIntersection(id)==4) && ( intersectionRepo.deleteByIdIntersection(id) ==1));

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
    public IntersectionGUI updateIntersection( IntersectionGUI intersection) {
        //System.err.println(intersection.getSensorList());
        IntersectionGUI intersectionToUpdate = intersectionRepo.findByid(intersection.getId());
        if (intersectionToUpdate == null )
            return null;
        intersectionToUpdate.updateIntersection(intersection);
        return intersectionRepo.save(intersectionToUpdate);
    }

    public int findMaxId() {
        ArrayList<IntersectionGUI> allIntersection = intersectionRepo.findAll();
        int max = 0;
        int temp;
        for (int i = 0 ; i< allIntersection.size(); i++){
            temp = allIntersection.get(i).getIdIntersection();
            if (temp > max) {
                max = temp;
            }
        }
        return max;
    }
}

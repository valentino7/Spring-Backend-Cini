package sdcc2018.spring.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import sdcc2018.spring.domain.StateTrafficLight;
import sdcc2018.spring.repo.StateTrafficLightRepo;

import java.util.ArrayList;

@Service
public class StateTrafficLightService {

    @Autowired
    private StateTrafficLightRepo trafficLightRepo;

    @Transactional
    public ArrayList<StateTrafficLight> findAll() {
        ArrayList<StateTrafficLight> stateTrafficLightsBroken=new ArrayList<>();
        ArrayList<StateTrafficLight> stateTrafficLights = trafficLightRepo.findAll();
        for (StateTrafficLight stateTrafficLight: stateTrafficLights) {
            for(int j=0;j!=3;j++)
                if(!stateTrafficLight.getStateTrafficLight()[j].equals("OK")) {
                    stateTrafficLightsBroken.add(stateTrafficLight);
                    break;
                }
        }
        return stateTrafficLightsBroken;
    }

    @Transactional
    public StateTrafficLight repair(StateTrafficLight stateTrafficLight)  {
        StateTrafficLight stateTrafficLightToUpdate = trafficLightRepo.findByid(stateTrafficLight.getId());
        if (stateTrafficLightToUpdate == null )
            return null;

        stateTrafficLightToUpdate.updateState(new String[]{"OK","OK","OK"});

        return trafficLightRepo.save(stateTrafficLightToUpdate);
    }

}

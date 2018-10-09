package sdcc2018.spring.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.stereotype.Component;

import javax.validation.constraints.NotNull;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Component
@Document(collection = "sdccIntersection")
public class IntersectionGUI {


    @Id
    private String id;

    @Field("idIntersection")
    private int idIntersection;

    @Field("listPhase")
    private List<PhaseGUI> listPhase;

    @Field("sensorList")
    private List<SensorGUI> sensorGUIS;

    public List<SensorGUI> getSensorGUIS() {
        return sensorGUIS;
    }

    public void setSensorGUIS(List<SensorGUI> semaphoreList) {
        this.sensorGUIS = semaphoreList;
    }

    public void updateIntersection(@NotNull IntersectionGUI newIntersection) {
        this.sensorGUIS = newIntersection.sensorGUIS;
        this.listPhase = newIntersection.listPhase;
    }

    public List<PhaseGUI> getListPhase() {
        return listPhase;
    }

    public void setListPhase(List<PhaseGUI> listPhase) {
        this.listPhase = listPhase;
    }

}

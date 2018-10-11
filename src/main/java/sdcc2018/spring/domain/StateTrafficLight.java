package sdcc2018.spring.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.stereotype.Component;

import javax.validation.constraints.NotNull;

@Getter
@Setter
@NoArgsConstructor
@Component
@Document(collection = "sdccStateTrafficLight")
public class StateTrafficLight {


    @Id
    private String id;

    @Field("idTrafficLight")
    private int idTrafficLight;

    @Field("idIntersection")
    private String idIntersection;

    @Field("stateTrafficLight")
    private String[] stateTrafficLight;

    public void updateState(@NotNull String[] newState) {
        this.stateTrafficLight = newState;
    }

    public void updateFields(int idTrafficLight,String idIntersection,String[] stateTrafficLight){
        this.stateTrafficLight= stateTrafficLight;
        this.idIntersection=idIntersection;
        this.idTrafficLight=idTrafficLight;
    }

    public String[] getStateTrafficLight() {
        return stateTrafficLight;
    }

    public void setStateTrafficLight(String[] stateTrafficLight) {
        this.stateTrafficLight = stateTrafficLight;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

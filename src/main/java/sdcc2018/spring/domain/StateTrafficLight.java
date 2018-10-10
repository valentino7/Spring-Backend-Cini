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
    private String[] state;

    public void updateState(@NotNull String[] newState) {
        this.state = newState;
    }

    public void updateFields(int idTrafficLight,String idIntersection,String[] state){
        this.state= state;
        this.idIntersection=idIntersection;
        this.idTrafficLight=idTrafficLight;
    }

    public String[] getState() {
        return state;
    }

    public void setState(String[] state) {
        this.state = state;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

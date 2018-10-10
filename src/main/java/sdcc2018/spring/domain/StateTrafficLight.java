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

    @Field("stateTrafficLight")
    private String[] state;

    public void updateIntersection(@NotNull StateTrafficLight newState) {
        this.state = newState.state;
    }

}

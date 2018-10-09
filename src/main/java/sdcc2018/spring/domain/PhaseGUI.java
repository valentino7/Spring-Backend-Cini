package sdcc2018.spring.domain;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.stereotype.Component;

@Getter
@Setter
@NoArgsConstructor
@Component
public class PhaseGUI {


    @Field("greenTime")
    private int greenTime; //0,1,2,3

    @Field("redTime")
    private int redTime;


}

package sdcc2018.spring.domain;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.stereotype.Component;

@Getter
@Setter
@NoArgsConstructor
@Component
public class SensorGUI {


    @Field("trafficLight")
    private int idSem; //0,1,2,3

    @Field("longitude")
    private float longitude;

    @Field("latitude")
    private float latitude;

    @Field("saturation")
    private double saturation;//variabile per ogni semaforo

}

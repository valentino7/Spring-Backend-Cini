package sdcc2018.spring.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.stereotype.Component;

@Getter
@Setter
@NoArgsConstructor
@Component
public class StatisticsElement {

    @Field("latency")
    private double latency;

    @Field("emitted")
    private int emitted;

    @Field("time")
    private double time;
}

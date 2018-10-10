package sdcc2018.spring.domain;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.stereotype.Component;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Component
@Document(collection = "sdccMedian")
public class Median {

    @Id
    private String id;

    @Field("idWindow")
    private String idWindow;

    @Field("globalMedian")
    private String globalMedian;

    @Field("medianList")
    private List<MedianElement> listMedian;

}

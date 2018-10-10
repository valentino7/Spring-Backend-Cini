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
@Document(collection = "sdccRank")
public class Rank {

    @Id
    private String id;

    @Field("idWindow")
    private String idWindow;

    @Field("rankElement")
    private List<RankElement> element;

}

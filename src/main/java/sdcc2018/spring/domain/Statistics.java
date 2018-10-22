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
@Document(collection = "Statistics")
public class Statistics {

    @Id
    private String id;

    public List<StatisticsElement> getList() {
        return list;
    }

    public void setList(List<StatisticsElement> list) {
        this.list = list;
    }

    @Field("statisticsElement")
    private List<StatisticsElement> list;
}

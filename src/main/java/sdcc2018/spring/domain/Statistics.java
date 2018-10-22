package sdcc2018.spring.domain;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Getter
@Setter
@NoArgsConstructor
@Component
@Document(collection = "Statistics")
public class Statistics {

    @Id
    private String id;

    @Field("query")
    private int query;

    @Field("statisticsElement")
    private ArrayList<StatisticsElement> statisticsElementList;


    public ArrayList<StatisticsElement> getStatisticsElementList() {
        return statisticsElementList;
    }

    public void setStatisticsElementList(ArrayList<StatisticsElement> statisticsElementList) {
        this.statisticsElementList = statisticsElementList;
    }

}

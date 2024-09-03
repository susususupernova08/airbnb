package airbnb.domain;

import airbnb.ReviewApplication;
import airbnb.domain.ReviewCreated;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Reiview_table")
@Data
//<<< DDD / Aggregate Root
public class Reiview {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Long roomId;

    private String content;

    private String customerId;

    @PostPersist
    public void onPostPersist() {
        ReviewCreated reviewCreated = new ReviewCreated(this);
        reviewCreated.publishAfterCommit();
    }

    public static ReiviewRepository repository() {
        ReiviewRepository reiviewRepository = ReviewApplication.applicationContext.getBean(
            ReiviewRepository.class
        );
        return reiviewRepository;
    }
}
//>>> DDD / Aggregate Root

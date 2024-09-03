package airbnb.domain;

import airbnb.domain.*;
import airbnb.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class RoomReserved extends AbstractEvent {

    private Long id;
    private String customerId;
    private Long roomId;
    private Date date;
    private Integer price;
}

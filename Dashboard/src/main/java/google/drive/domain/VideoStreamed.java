package google.drive.domain;

import google.drive.domain.*;
import google.drive.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class VideoStreamed extends AbstractEvent {

    private String name;
    private String videoUrl;

    public VideoStreamed(Dashboard aggregate) {
        super(aggregate);
    }

    public VideoStreamed() {
        super();
    }
}

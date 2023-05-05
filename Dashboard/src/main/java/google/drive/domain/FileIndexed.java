package google.drive.domain;

import google.drive.domain.*;
import google.drive.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class FileIndexed extends AbstractEvent {

    private String name;
    private String indexingStatus;

    public FileIndexed(Dashboard aggregate) {
        super(aggregate);
    }

    public FileIndexed() {
        super();
    }
}

package google.drive.domain;

import google.drive.domain.*;
import google.drive.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class FileUploaded extends AbstractEvent {

    private String name;
    private Integer size;
    private String uploadStatus;

    public FileUploaded(Dashboard aggregate) {
        super(aggregate);
    }

    public FileUploaded() {
        super();
    }
}

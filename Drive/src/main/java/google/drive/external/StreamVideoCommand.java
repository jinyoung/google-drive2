package google.drive.external;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Data
public class StreamVideoCommand {

    @Id
    private String name;
}

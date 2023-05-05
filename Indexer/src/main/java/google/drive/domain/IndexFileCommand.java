package google.drive.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Data
public class IndexFileCommand {

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private String name;
}

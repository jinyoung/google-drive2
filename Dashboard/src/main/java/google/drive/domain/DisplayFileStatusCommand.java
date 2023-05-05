package google.drive.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Data
public class DisplayFileStatusCommand {

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private String name;

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private Integer size;

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private String uploadStatus;

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private String indexingStatus;

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private String videoUrl;
}

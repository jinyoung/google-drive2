package google.drive.domain;

import google.drive.DashboardApplication;
import google.drive.domain.FileIndexed;
import google.drive.domain.FileUploaded;
import google.drive.domain.VideoStreamed;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Dashboard_table")
@Data
public class Dashboard {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String name;

    private Integer size;

    private String uploadStatus;

    private String indexingStatus;

    private String videoUrl;

    @PostPersist
    public void onPostPersist() {
        FileUploaded fileUploaded = new FileUploaded(this);
        fileUploaded.publishAfterCommit();

        FileIndexed fileIndexed = new FileIndexed(this);
        fileIndexed.publishAfterCommit();

        VideoStreamed videoStreamed = new VideoStreamed(this);
        videoStreamed.publishAfterCommit();
    }

    @PrePersist
    public void onPrePersist() {}

    public static DashboardRepository repository() {
        DashboardRepository dashboardRepository = DashboardApplication.applicationContext.getBean(
            DashboardRepository.class
        );
        return dashboardRepository;
    }
}

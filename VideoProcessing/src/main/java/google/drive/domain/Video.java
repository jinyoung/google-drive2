package google.drive.domain;

import google.drive.VideoProcessingApplication;
import google.drive.domain.VideoStreamed;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Video_table")
@Data
public class Video {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String name;

    private String videoUrl;

    @PostPersist
    public void onPostPersist() {
        VideoStreamed videoStreamed = new VideoStreamed(this);
        videoStreamed.publishAfterCommit();
    }

    @PrePersist
    public void onPrePersist() {}

    public static VideoRepository repository() {
        VideoRepository videoRepository = VideoProcessingApplication.applicationContext.getBean(
            VideoRepository.class
        );
        return videoRepository;
    }

    public static void notifyUserOnVideoStreamed(VideoStreamed videoStreamed) {
        /** Example 1:  new item 
        Video video = new Video();
        repository().save(video);

        */

        /** Example 2:  finding and process
        
        repository().findById(videoStreamed.get???()).ifPresent(video->{
            
            video // do something
            repository().save(video);


         });
        */

    }

    public static void notifyUserOnVideoStreamed(VideoStreamed videoStreamed) {
        /** Example 1:  new item 
        Video video = new Video();
        repository().save(video);

        */

        /** Example 2:  finding and process
        
        repository().findById(videoStreamed.get???()).ifPresent(video->{
            
            video // do something
            repository().save(video);


         });
        */

    }
}

package google.drive.domain;

import google.drive.DriveApplication;
import google.drive.domain.FileUploaded;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "File_table")
@Data
public class File {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String name;

    private Integer size;

    private String uploadStatus;

    @PostPersist
    public void onPostPersist() {
        //Following code causes dependency to external APIs
        // it is NOT A GOOD PRACTICE. instead, Event-Policy mapping is recommended.

        google.drive.external.Video video = new google.drive.external.Video();
        // mappings goes here
        DriveApplication.applicationContext
            .getBean(google.drive.external.VideoService.class)
            .streamVideo(video);

        FileUploaded fileUploaded = new FileUploaded(this);
        fileUploaded.publishAfterCommit();
    }

    @PrePersist
    public void onPrePersist() {}

    public static FileRepository repository() {
        FileRepository fileRepository = DriveApplication.applicationContext.getBean(
            FileRepository.class
        );
        return fileRepository;
    }

    public static void notifyUserOnFileUpload(FileUploaded fileUploaded) {
        // implement
        /** Example 1:  new item 
        File file = new File();
        repository().save(file);

        */

        /** Example 2:  finding and process
        
        repository().findById(fileUploaded.get???()).ifPresent(file->{
            
            file // do something
            repository().save(file);


         });
        */

    }

    public static void notifyUserOnFileUpload(FileUploaded fileUploaded) {
        /** Example 1:  new item 
        File file = new File();
        repository().save(file);

        */

        /** Example 2:  finding and process
        
        repository().findById(fileUploaded.get???()).ifPresent(file->{
            
            file // do something
            repository().save(file);


         });
        */

    }
}

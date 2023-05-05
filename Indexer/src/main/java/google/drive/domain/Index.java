package google.drive.domain;

import google.drive.IndexerApplication;
import google.drive.domain.FileIndexed;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Index_table")
@Data
public class Index {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String name;

    private String indexingStatus;

    @PostPersist
    public void onPostPersist() {
        FileIndexed fileIndexed = new FileIndexed(this);
        fileIndexed.publishAfterCommit();
    }

    @PrePersist
    public void onPrePersist() {}

    public static IndexRepository repository() {
        IndexRepository indexRepository = IndexerApplication.applicationContext.getBean(
            IndexRepository.class
        );
        return indexRepository;
    }

    public static void notifyUserOnFileIndexed(FileIndexed fileIndexed) {
        /** Example 1:  new item 
        Index index = new Index();
        repository().save(index);

        */

        /** Example 2:  finding and process
        
        repository().findById(fileIndexed.get???()).ifPresent(index->{
            
            index // do something
            repository().save(index);


         });
        */

    }

    public static void notifyUserOnFileIndexed(FileIndexed fileIndexed) {
        /** Example 1:  new item 
        Index index = new Index();
        repository().save(index);

        */

        /** Example 2:  finding and process
        
        repository().findById(fileIndexed.get???()).ifPresent(index->{
            
            index // do something
            repository().save(index);


         });
        */

    }

    public static void notifyUserOnFileIndexed(FileUploaded fileUploaded) {
        /** Example 1:  new item 
        Index index = new Index();
        repository().save(index);

        */

        /** Example 2:  finding and process
        
        repository().findById(fileUploaded.get???()).ifPresent(index->{
            
            index // do something
            repository().save(index);


         });
        */

    }
}

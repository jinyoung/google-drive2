package google.drive.external;

import java.util.Date;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "VideoProcessing", url = "${api.url.VideoProcessing}")
public interface VideoService {
    @RequestMapping(method = RequestMethod.POST, path = "/videos")
    public void streamVideo(@RequestBody Video video);
}

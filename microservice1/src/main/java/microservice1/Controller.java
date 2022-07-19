package microservice1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class Controller {


    @GetMapping("hoTen")
    public String hoTen(){
        return "Tôi tên là: " + getName();
    }

    public String getName(){
        RestTemplate template = new RestTemplate();
        String nameUrl = "http://lbq:8081/ten";
        return template.getForObject(nameUrl, String.class);
    }
}



package microservice1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("ten")
    public String hoTen(){
        return "Lê Bá Quang";
    }
}

package controller;

import com.ltri.hystrixapi.service.HystrixService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HystrixController {
    @Autowired
    private HystrixService hystrixService;

    @GetMapping("/hystrix/{name}")
    public String test(@PathVariable("name") String name) {
        return hystrixService.hystrixService(name);
    }
}

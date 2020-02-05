package root.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Properties;

@RestController
public class BaseController {

    @GetMapping("check")
    public String check() {
        return "OK";
    }

    @GetMapping("info")
    public Properties system(){
        return System.getProperties();
    }
}

package cl.cronos.testapps.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class Root {
    @GetMapping("/")
    public String init() {
        return "Hola Mundoconfigurado para build desde git!";
    }
}

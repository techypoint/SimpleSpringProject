package vbeast.pro.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by varun on 7/9/18.
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String sayHi(){
        return "Hi Pro";
    }
}

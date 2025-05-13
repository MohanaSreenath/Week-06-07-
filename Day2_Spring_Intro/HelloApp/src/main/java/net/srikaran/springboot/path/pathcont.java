package net.srikaran.springboot.path;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class pathcont {
	
	@GetMapping("/path/{name}")
    public String sayHelloPath(@PathVariable String name) {
        return "Hello " + name;
    }

}
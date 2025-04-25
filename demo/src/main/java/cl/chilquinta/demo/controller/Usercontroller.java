package cl.chilquinta.demo.controller;


import java.util.HashMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class Usercontroller {
    
    @GetMapping("/hola")
    public String hola () {
        return "hola mundillo"; 
    }

    @GetMapping("/hola2")
    public HashMap hola2 () {
        HashMap<Integer,String>  hashMap = new HashMap<>();
        
        hashMap.put(1, "hola1");
        hashMap.put(2, "uno");




        
        return hashMap;
    }
} 
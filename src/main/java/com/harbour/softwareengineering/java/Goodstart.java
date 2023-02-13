package com.harbour.softwareengineering.java;
import org.springframework.web.bind.annotation.*;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("")
public class Goodstart {

    @GetMapping("/grade/A")
    public Grade nice() {
        return new Grade(100);
    }
    @GetMapping("/grade/B")
    public Grade good() {
        return new Grade(90);
    }
    @GetMapping("/grade/{letter}")
    public Grade ok() {
        return new Grade(0);
    }



//    @GetMapping("/items")
//    @ResponseBody
//    public Person good(){
//        return new Person(123);
//    }

//    @PostMapping("/items/{id}")
//    public Map<Map, Map> bad(@RequestBody Person person){
//        Map<String, String> result1 = new HashMap<String, String>();
//        Map<String, Integer> result = new HashMap<String, Integer>();
//        Map<Map, Map> itog = new HashMap<Map, Map>();
//        result.put("id", person.id());
//        if(person.id() == 123){
//            result1.put("status", "completed");
//        }
//        else{
//            result1.put("status", "failed");
//        }
//        itog.put(result, result1);
//        return itog;
//    }

}



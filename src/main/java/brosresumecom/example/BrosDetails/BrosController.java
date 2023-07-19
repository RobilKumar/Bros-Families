package brosresumecom.example.BrosDetails;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
@RequestMapping("/Bros")

public class BrosController {

    HashMap<Integer, Bros> hsDb= new HashMap<>();


    @PostMapping("/add")
    public String add(@RequestBody Bros bros){
       // Robil resume1= new Robil("Robil", 26, "fullstackDeveloper", 1);
        int key= bros.getId();

        hsDb.put(key, bros);
        return "Added successfully";
    }

    @GetMapping("/getinfo")
    public Bros get(@RequestParam("id") Integer id){
        Bros bros;
        bros = hsDb.get(id);
        return bros;
    }
}

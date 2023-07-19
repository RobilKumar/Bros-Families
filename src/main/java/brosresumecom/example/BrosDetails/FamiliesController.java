package brosresumecom.example.BrosDetails;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
@RequestMapping("/families")

public class FamiliesController {
    public static Logger logger= LoggerFactory.getLogger(FamiliesController.class);

    HashMap<String, Families> fmDb= new HashMap<>();


    @PostMapping("/add")
    public String add(@RequestBody Families families){

//        logger.info("we are at families controller");
//        logger.debug("we are at families controller with debug");

        System.out.println("we are at families controller");
        String p= families.getPlace();
        fmDb.put(p,families);
        return "added successfully";

    }


    @GetMapping("/getfamily")
    public Families get(@RequestParam("place") String place){
        Families families= fmDb.get(place);
        return families;
    }
//    @PostMapping("/addViaVariable")
//    public String add(@RequestParam("fathername"String fathername,@RequestParam("mothername")String mothername, @RequestParam("brothername") String brothername, @RequestParam("place") String place){
//        Families families= new Families("gavendra", "rina", "rony", "hathras");
//        String p= families.getPlace();
//        fmDb.put(p,families);
//        return "addded via variable successfully";
//    }
}

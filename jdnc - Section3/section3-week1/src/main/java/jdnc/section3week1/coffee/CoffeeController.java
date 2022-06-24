package jdnc.section3week1.coffee;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/v1/coffees",produces ={MediaType.APPLICATION_JSON_VALUE})
public class CoffeeController {

    @PostMapping
    public String postCoffee(@RequestParam("engName") String engName,
                             @RequestParam("korName") String korName,
                             @RequestParam("price") String price){

        System.out.println("engName = " + engName);
        System.out.println("korName = " + korName);
        System.out.println("price = " + price);
        String response =
                "{\"" +
                    "engName\":\""+engName+"\"," +
                    "\"korName\":\""+korName+"\",\"" +
                    "price\":\"" + price+
                "\"}";
        return response;
    }

    @GetMapping("/{coffee-id}")
    public String getCoffees(@PathVariable("coffee-id") long memberId){
        System.out.println("memberId = " + memberId);
        return null;
    }

    @GetMapping
    public String getCoffee(){
        System.out.println("# getCoffees");
        return null;
    }
}

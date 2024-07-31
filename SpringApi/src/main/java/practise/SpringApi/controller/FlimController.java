package practise.SpringApi.controller;


import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import practise.SpringApi.bean.Flim;

import java.time.Clock;
import java.util.ArrayList;
import java.util.List;

@RestController
public class FlimController {

    @GetMapping("Flim")
    public Flim flim(){
        Flim flim = new Flim(1,"Revenant",2016,"Alejandro");
       // Flim flim2 = new Flim(2,"Once Upon a time in Hollywood",2019,"Quentin");
        //Flim flim3 = new Flim(3,"Django",2016,"Quentin");
        //Flim flim4 = new Flim(4,"Fast X",2022,"Louis");
        //Flim flim5 = new Flim(5,"The Hateful Eight",2015,"Quentin Tarantino");



        return flim;
    }

    @GetMapping("Flims")
    public List<Flim> flims(){
        List<Flim> flims = new ArrayList<>();

        flims.add(new Flim(1,"Revenant",2016,"Alejandro"));
        flims.add(new Flim(2,"Once Upon a time in Hollywood",2019,"Quentin"));
        flims.add(new Flim(3,"Django",2016,"Quentin"));
        flims.add(new Flim(4,"Fast X",2022,"Louis"));
        flims.add(new Flim(5,"The Hateful Eight",2015,"Quentin Tarantino"));

        return flims;


    }
  /**  @GetMapping("Flim/{id}/{name}/{release_year}/{director_name}")
    public Flim flimpathvariable(@PathVariable("id")int flimId,
                                 @PathVariable String name,
                                 @PathVariable("release_year")int releaseYear,
                                 @PathVariable("director_name")String directorName){

        return new Flim(flimId,name,releaseYear,directorName);
    }
**/

 /*@GetMapping("Flim/query")
  public Flim flimrequestvariable(@RequestParam int id,
                                  @RequestParam String name,
                                  @RequestParam int releaseYear,
                                  @RequestParam String directorName

  ) {
      return (id,name,releaseYear,directorName);
  }

  */


  /*
    @PostMapping("Flim/created")
    @ResponseStatus(HttpStatus.CREATED)
    public Flim  createFlim(@RequestBody Flim flim){
        System.out.println(flim.getId());
        System.out.println(flim.getName());
        System.out.println(flim.getDirector_name());
        System.out.println(flim.getRelease_year());

        return flim;

    }
    */

  /*  @PutMapping ("Flim/{id}/update")
    public Flim updateFlim(@RequestBody Flim flim,@PathVariable int id){
        System.out.println(flim.getId());
        System.out.println(flim.getName());
        System.out.println(flim.getDirector_name());
        System.out.println(flim.getRelease_year());
        return flim;

    }


*/

   /* @DeleteMapping("Flim{id}/update")
    public String deleteFlim(@PathVariable int id)
    {
        System.out.println(id);
        return "Flim delete successfully";
    }

*/



}

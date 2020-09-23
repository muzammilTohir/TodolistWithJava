package io.todolist.todowithjava.control;

import io.todolist.todowithjava.pojo.Listitem;
import io.todolist.todowithjava.repo.RepositoryItems;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@Controller
//@RequestMapping(value = "/todolists")
public class ControlItems {
    @Autowired
    RepositoryItems repo;

    @RequestMapping("/")
    public String home(){
        System.out.println("Hello browser....");
        return "home.html";
    }

/*
    @RequestMapping(path="/message", produces= MediaType.TEXT_PLAIN_VALUE)
    @ResponseBody
    public String processForm(@RequestParam(defaultValue="Guest") String name,
                              @RequestParam(required = false) String adult) {

        var greet = "on".equals(adult) ? "Good morning" : "Hi";

        return String.format("%s %s!", greet, name);
    }*/

    @GetMapping(produces={"application/json"})
    public List<Listitem> getAllItems(){

        return repo.findAll();
    }

   @GetMapping("/{id}")
   public Optional<Listitem> getElement(@PathVariable int id){
       return repo.findById(id);
   }

   @DeleteMapping("/{id}")
   public String delete(@PathVariable int id){
        Listitem deleted = repo.getOne(id);
        repo.delete(deleted);
        return "Deleted";
   }

   /*@DeleteMapping("/all")
   public void deleteAllItems(Listitem listitem){
        repo.delete(listitem);
   }*/

    @RequestMapping(method = RequestMethod.DELETE)
    public void deleteAllItems(){
        repo.deleteAll();
    }

    @PostMapping(consumes= {"application/json"})
    public Listitem saveItem(@RequestBody Listitem listitem){
        return repo.save(listitem);
    }

    @PutMapping(consumes= {"application/json"})
    public Listitem updateItem(@RequestBody Listitem listitem){
        return repo.save(listitem);
    }

   /* @GetMapping("{id}")
    public Listitem fetchItem(@PathVariable int id,Listitem listitem){
        checkingItem = true;
        return listitem;
    }*/


    @PatchMapping(value = "/{id}",consumes= {"application/json"})
    public Listitem changingItem(@RequestBody Listitem listitem,@PathVariable int id){
        Listitem listItem = repo.findById(id).get();
        boolean checkingItem;
        listItem.setCheckingItem(checkingItem = true);
        return repo.save(listItem);
    }
}













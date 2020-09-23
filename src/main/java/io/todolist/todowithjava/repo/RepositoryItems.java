package io.todolist.todowithjava.repo;

import io.todolist.todowithjava.pojo.Listitem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryItems extends JpaRepository<Listitem,Integer> {
  //  Listitem updateListitem(Listitem listitem);
   //  boolean saveByDone(boolean done);






//     default void delete(int id){
//         getOne(id);
//    }
}

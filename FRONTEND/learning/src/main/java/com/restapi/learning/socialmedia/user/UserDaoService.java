package com.restapi.learning.socialmedia.user;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


@Component
public class UserDaoService {
    // this class will talk to DB
   // JPA/Hibernate --> Database service

   // for now making the static data
    private static Integer idCount = 0;
   private static final List<User> userList = new ArrayList<>();
   static {
       userList.add(new User(++idCount, "Maheera Mobin Khan", LocalDate.now().minusYears(2)));
       userList.add(new User(++idCount, "Munni", LocalDate.now().minusYears(25)));
       userList.add(new User(++idCount, "Mobin Arshad", LocalDate.now().minusYears(27)));
   }

   public List<User> findAll(){
       return userList;
   }

   public void save(User user){
       user.setId(++idCount);
      long exist = userList.stream().filter(u -> u.getId().equals(user.getId())).count();
      if(exist == 0){
          userList.add(user);
          return;
      }
       throw new UnsupportedOperationException("User is already present");
   }

   public User findOne(Integer id) throws UserNotFoundException {
      return userList.stream().
                     filter(u -> u.getId().equals(id)).
                     findFirst().
                     orElseThrow(() -> new UserNotFoundException("user id is not present::"+ id ));
   }

   public void deleteUser(Integer id){
     userList.removeIf(u -> u.getId().equals(id));
   }


}

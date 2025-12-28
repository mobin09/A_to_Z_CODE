package com.restapi.learning.socialmedia.user;

import com.restapi.learning.socialmedia.user.service.UserService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.time.LocalDate;
import java.util.List;
import java.util.Locale;
import java.util.Optional;


@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserDaoService service;
    //private MessageSource messageSource;
//    public UserController(UserDaoService service) {
//        this.service = service;
//    }


//    @GetMapping("/hello-word-i18n")
//    public ResponseEntity<String> helloWorldi18n(){
//        HttpHeaders headers = new HttpHeaders();
//        headers.add("key1", "value1");
//        Locale locale = LocaleContextHolder.getLocale();
//        String msg =  messageSource.getMessage("good.morning.message",
//                null, "Default Message", locale);
//        return ResponseEntity.status(HttpStatus.OK).headers(headers).body(msg);
//    }
     @Autowired
     private UserService userService;

@GetMapping("/users")
public ResponseEntity<List<User>> getAllUser(){
    List<User> userList =  userService.findAll();
    HttpHeaders headers = new HttpHeaders();
    headers.add("Find", "All the list of users");
    return ResponseEntity.status(HttpStatus.OK).headers(headers).body(userList);
}

@GetMapping("/users/{id}")
public EntityModel<User> oneUser(@PathVariable Integer id) throws UserNotFoundException {
   Optional<User> user =  userService.findById(id);
    if(user.isEmpty())
        throw new UserNotFoundException("User is not present with id:::" + id);


    HttpStatus status = HttpStatus.OK;

    EntityModel<User>  entityModel = EntityModel.of(user.get());
    WebMvcLinkBuilder link = WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(this.getClass()).getAllUser());
    entityModel.add(link.withRel("all-users"));

    return entityModel;
}

@PostMapping("/users")
public ResponseEntity<Void> createUser(@Valid @RequestBody User user){
    userService.save(user);
    URI location = ServletUriComponentsBuilder
            .fromCurrentRequest()
            .path("/{id}")
            .buildAndExpand(user.getId()) // replace {id} with newId
            .toUri();
    HttpHeaders headers = new HttpHeaders();
    headers.add("Location", location.toString());
    return ResponseEntity.created(location).build();
}

@DeleteMapping("/users/{id}")
public ResponseEntity<Void> deleteUser(@PathVariable Integer id){
     userService.deleteById(id);
    return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
}


}



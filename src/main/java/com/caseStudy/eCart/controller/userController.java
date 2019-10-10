package com.caseStudy.eCart.controller;

import com.caseStudy.eCart.models.User;
import com.caseStudy.eCart.repository.userRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@CrossOrigin("*")
@RestController
@RequestMapping( value = "/users" ,  method = { RequestMethod.GET , RequestMethod.POST})
public class userController {
    @Autowired
    userRepository UserRepo ;

    @GetMapping("/get1")

    public List<User> getAllNotes() {
            return UserRepo.findAll();
        }


        @PostMapping("/post1")

    public User createNote(@Valid @RequestBody User user1 )
        {
            return UserRepo.save(user1);
        }

        @GetMapping("/get1/{id}")
    public Optional<User> getNoteById(@PathVariable( value = "id") Long noteId )
        {
            return UserRepo.findById(noteId);
        }
}

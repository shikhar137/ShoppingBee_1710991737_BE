package com.caseStudy.eCart.controller;

import com.caseStudy.eCart.models.Authorization;
import com.caseStudy.eCart.repository.authRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
@CrossOrigin(origins = "http://localhost:4200" , allowedHeaders = "*")
@RestController
@RequestMapping("/auth")


public class authController {
    @Autowired
    authRepository z ;

    @PostMapping("/addUsers")
    public Authorization addusers(Authorization auth)
    {
        return z.save(auth);
    }
    @GetMapping("/getUsers")
    public List<Authorization> getusers()
    {
        return z.findAll();
    }
    @GetMapping("/validuser")
    public String valuser()
    {
        return "\" User Successfully Authenticated \"";
    }
}


package com.caseStudy.eCart.controller;

import com.caseStudy.eCart.models.Authorization;
import com.caseStudy.eCart.repository.authRepository;
import com.caseStudy.eCart.service.currentuserservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.security.Principal;

@CrossOrigin( origins = "http://localhost:4200", methods = { RequestMethod.PUT , RequestMethod.GET , RequestMethod.POST } )
@RestController
@RequestMapping("/profile")
public class myProfileController {
    @Autowired
    currentuserservice c ;
    @Autowired
    authRepository u ;
    @GetMapping("/get")
    public Authorization getdata(Principal principal)
    {
        return c.getpro(principal);
    }
    @PutMapping("/update")
    public Authorization update(@Valid @RequestBody Authorization auth )
    {
        auth.setActive(1);
        u.save(auth) ;
        return auth ;

    }
}

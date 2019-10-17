package com.caseStudy.eCart.service;

import com.caseStudy.eCart.models.Authorization;
import com.caseStudy.eCart.repository.authRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.Principal;
import java.util.Optional;
@Service
public class currentuserservice {
    @Autowired
    authRepository u ;
    public Authorization getpro(Principal principal)
    {
        Optional<Authorization> op = u.findByUsername(principal.getName());
        return op.get();
    }
}

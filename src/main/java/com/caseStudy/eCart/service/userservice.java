package com.caseStudy.eCart.service;

//package com.caseStudy.eCart.service;

import com.caseStudy.eCart.models.Authorization;
//import com.caseStudy.eCart.models.;
import com.caseStudy.eCart.repository.authRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.Principal;
import java.util.Optional;

@Service
public class userservice {
    @Autowired
    private authRepository authRepository;
    public Optional<Authorization> CurrentUser(Principal prinicipal) {
        String username = prinicipal.getName();
        return authRepository.findByUsername(username);
    }
    public int getUserId(Principal principal)
    {
        String username = principal.getName();
        int id = authRepository.findByUsername(username).get().getUserid();
        return id;
    }
    //    public Long getUserRole(Principal principal) {
//        return userRepository.findByUsername(principal.getName()).get().getRole().getRoleId();
//    }
    public Optional<Authorization> getUserProfile(Principal principal) {
        return authRepository.findByUsername(principal.getName());
    }
    //public ResponseEntity<?> checkDetails(Users user, Principal principal) {
    //  Optional<Users> usercheck = userRepository.findByUsername(principal.getName());
    //Optional<Users> usercheckinfo = userRepository.findByUsername(user.getUsername());
    //if(usercheckinfo.isPresent()& usercheckinfo.get().getUsername()!=usercheck.get().getUsername());
    //HttpHeaders responseHeaders = new HttpHeaders();

}
//}


